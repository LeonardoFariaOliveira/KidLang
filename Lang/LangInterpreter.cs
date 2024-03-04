using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using Grammar;

namespace Interpreter.Lang
{
    public class Simbolo
    {
        public string Type { get; set; }
        public string Id { get; set; }
        public object Value { get; set; }

        public Simbolo(string type, string id, object value = null)
        {
            Type = type;
            Id = id;
            Value = value;
        }
    }

    public class LangInterpreter : LangBaseVisitor<object?>
    {
        public Boolean HasErrors { get; private set; } = false;
        public List<string> ErrorMessages { get; private set; } = new List<string>();
        private Dictionary<string, IParseTree> _functions;

        public LangInterpreter(Dictionary<string, IParseTree> functions)
        {
            this._functions = functions;
        }

        public Dictionary<string, Simbolo> Variables { get; protected set; } = new Dictionary<string, Simbolo>();

        #region I/O Statements

        public override object? VisitInputRead([NotNull] LangParser.InputReadContext context)
        {
            var input = Console.ReadLine();
            
            if (!String.IsNullOrEmpty(input))
            {
                string varName = context.VAR().GetText();
                string varType = context.tipo().GetText();
                if (varType == "numero")
                {
                    if (!int.TryParse(input, out int intValue))
                    {   
                        HasErrors = true;
                        while(HasErrors == true){
                             ErrorMessages.Add($"O input: '{input}' não é um número válido");
                             Console.WriteLine(ErrorMessages[ErrorMessages.Count - 1]);
                             Console.WriteLine("Variável " + "'" + varName + "'" + " só aceita inputs desse tipo:  " + "'" + varType + "'");
                             Console.WriteLine("Digite um "+varType+ " válido");
                            input = Console.ReadLine();
                            if(int.TryParse(input, out intValue)){
                                HasErrors = false;
                            }
                            int.TryParse(input, out intValue);
                            Variables[varName] = new Simbolo(context.tipo().GetText(), varName, intValue);
                        }
                    }else{
                        Variables[varName] = new Simbolo(context.tipo().GetText(), varName, intValue);
                    }

                }else if(varType == "texto")
                {
                    if(double.TryParse(input, out double doubleValue))
                    {
                        HasErrors = true;
                        while(HasErrors == true){
                             ErrorMessages.Add($"O input: '{input}' não é um texto válido");
                             Console.WriteLine(ErrorMessages[ErrorMessages.Count - 1]);
                             Console.WriteLine("Variável " + "'" + varName + "'" + " só aceita inputs desse tipo:  " + "'" + varType + "'");
                             Console.WriteLine("Digite um "+varType+ " válido");
                            input = Console.ReadLine();
                            if(!double.TryParse(input, out doubleValue)){
                                HasErrors = false;
                            }
                            Variables[varName] = new Simbolo(context.tipo().GetText(), varName, input);
                        }
                    }else{
                        Variables[varName] = new Simbolo(context.tipo().GetText(), varName, input);
                    }
                    
                }
                else if(varType == "decimal")
                {
                    if(double.TryParse(input, out double doubleValue))
                    {
                        HasErrors = true;
                        while(HasErrors == true){
                             ErrorMessages.Add($"O input: '{input}' não é um decimal válido");
                             Console.WriteLine(ErrorMessages[ErrorMessages.Count - 1]);
                             Console.WriteLine("Variável " + "'" + varName + "'" + " só aceita inputs desse tipo:  " + "'" + varType + "'");
                             Console.WriteLine("Digite um "+varType+ " válido");
                            input = Console.ReadLine();
                            if(!double.TryParse(input, out doubleValue)){
                                HasErrors = false;
                            }
                            Variables[varName] = new Simbolo(context.tipo().GetText(), varName, input);
                        }
                    }else{
                        Variables[varName] = new Simbolo(context.tipo().GetText(), varName, input);
                    }
                    
                }
            }
            
            

            return null;
        }


        public override object? VisitOutputWriteVar([NotNull] LangParser.OutputWriteVarContext context)
        {
            //Console.WriteLine("VisitOutputWriteVar");
            var varName = context.VAR().GetText();
            if (Variables.ContainsKey(varName))
                Console.WriteLine(Variables[varName].Value);
            else
                Console.WriteLine("Variavel " + varName + " nao definida");
            return null;
        }

        public override object? VisitOutputWriteStr([NotNull] LangParser.OutputWriteStrContext context)
        {
            //Console.WriteLine("VisitOutputWriteStr");
            var varName = context.STR().GetText();
            Console.WriteLine(varName.Replace("\"", ""));
            return null;
        }

        public override object? VisitOutputWriteExpr([NotNull] LangParser.OutputWriteExprContext context)
        {
            //Console.WriteLine("VisitOutputWriteExpr");
            object? v = Visit(context.expr());
            if (v != null)
                Console.WriteLine(v);
            return null;
        }
        #endregion

        public override object? VisitAtribVar([NotNull] LangParser.AtribVarContext context)
        {
            //Console.WriteLine("VisitAtribVar");
            var varName = context.VAR().GetText();
            var value = Visit(context.expr());
            if (value != null)
            {
                if (Variables.ContainsKey(varName))
                    Variables[varName].Value = value;
                else
                    Variables[varName] = new Simbolo("numero", varName, value);
            }
            return null;
        }

 
        public override object? VisitExprTerm([NotNull] LangParser.ExprTermContext context)
        {
            //Console.WriteLine("VisitExprTerm");
            return Visit(context.term());
        }


        public override object? VisitTermFactor([NotNull] LangParser.TermFactorContext context)
        {
            //Console.WriteLine("VisitTermFactor");
            return Visit(context.factor());
        }

        public override object? VisitFactorVar([NotNull] LangParser.FactorVarContext context)
        {
            //Console.WriteLine("VisitFactorVar");
            var varName = context.VAR().GetText();
            if (Variables.ContainsKey(varName))
                return Variables[varName].Value;

            //Console.WriteLine("Variable " + varName + " is not defined");
            return null;
        }

        public override object? VisitFactorNum([NotNull] LangParser.FactorNumContext context)
        {
            //Console.WriteLine("VisitFactorNum");
            var txtNum = context.NUM().GetText();
            return Double.Parse(txtNum);
        }

        public override object? VisitFactorExpr([NotNull] LangParser.FactorExprContext context)
        {
            //Console.WriteLine("VisitFactorExpr");
            return Visit(context.expr());
        }
        

        #region Control Statements
        public override object? VisitIfstIf([NotNull] LangParser.IfstIfContext context)
        {
            //Console.WriteLine("VisitIfstIf");
            var cond = Visit(context.cond());
            if (cond != null && (bool)cond)
                Visit(context.block());
            return null;
        }

        public override object? VisitIfstIfElse([NotNull] LangParser.IfstIfElseContext context)
        {
            //Console.WriteLine("VisitIfstIfElse");
            var cond = Visit(context.cond());
            if (cond != null && (bool)cond)
                Visit(context.b1);
            else
                Visit(context.b2);
            return null;
        }

        public override object? VisitWhilestWhile([NotNull] LangParser.WhilestWhileContext context)
        {
            //Console.WriteLine("VisitWhilestWhile");
            var cond = Visit(context.cond());
            while (cond != null && (bool)cond)
            {
                Visit(context.block());
                cond = Visit(context.cond());
            }
            return null;
        }

        public override object? VisitForstFor([NotNull] LangParser.ForstForContext context)
        {
            foreach (var atrib in context.atrib())
            {
                Visit(atrib);
            }

            var cond = Visit(context.cond());
            //quando acabar o for, o cond é null
            while (cond != null && (bool)cond)
            {
                Visit(context.block());
                Visit(context.atrib(1));
                cond = Visit(context.cond());
            }
            return null;
        }

        public override object? VisitCondExpr([NotNull] LangParser.CondExprContext context)
        {
            //Console.WriteLine("VisitCondExpr");
            object? v = Visit(context.expr());
            return v != null && (Double)v != 0;
        }

       

        public override object? VisitCondAnd([NotNull] LangParser.CondAndContext context)
        {
            //Console.WriteLine("VisitCondAnd");
            object? v1 = Visit(context.c1);
            object? v2 = Visit(context.c2);
            return v1 != null && v2 != null && (bool)v1 && (bool)v2;
        }

        public override object? VisitCondOr([NotNull] LangParser.CondOrContext context)
        {
            //Console.WriteLine("VisitCondOr");
            object? v1 = Visit(context.c1);
            object? v2 = Visit(context.c2);
            return v1 != null && (bool)v1 || v2 != null && (bool)v2;
        }

        public override object? VisitCondNot([NotNull] LangParser.CondNotContext context)
        {
            object? v = Visit(context.cond());
            return v != null && !(bool)v;
        }
        #endregion

        #region Functions

        public override object? VisitFuncInvocLine([NotNull] LangParser.FuncInvocLineContext context)
        {
            //Console.WriteLine("VisitFuncInvocLine");
            var funcName = context.VAR().GetText();
            var function = _functions[funcName];

            if (function != null)
            {
                return Visit(function);
            }

            return null;
        }

        #endregion

    }
}