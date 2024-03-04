using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using Interpreter.Lang;
using Grammar;

internal class Program
{
    private static void Main(string[] args)
    {
           
        var inputStream = new AntlrFileStream("../../../codigo.kid");
      
        var lexer = new LangLexer(inputStream);

        var tokenStream = new BufferedTokenStream(lexer);
    
        var parser = new LangParser(tokenStream);

        var errorListener = new LangErrorListener();
        parser.RemoveErrorListeners();
        parser.AddErrorListener(errorListener);
       
        parser.ErrorHandler = new DefaultErrorStrategy();

        var semanticListener = new SemanticLangListener();
        parser.RemoveParseListeners();
        parser.AddParseListener(semanticListener);

        IParseTree? tree = null;
        try
        {
            tree = parser.prog();
            
            Console.WriteLine("Chegou até aqui, continue assim!!!");

            if (errorListener.HasErrors){
                Console.WriteLine("Eita que tem erro");
                errorListener.ErrorMessages.ForEach(e => Console.WriteLine(e));
                tree = null;
            }

            if (semanticListener.HasErrors){
                Console.WriteLine("");
                semanticListener.ErrorMessages.ForEach(e => Console.WriteLine(e));
                tree = null;
            }

            
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
        }

    
        if (tree != null)
        {
            var interpreter = new LangInterpreter(semanticListener.Functions);
            interpreter.Visit(tree);
        }

    }
}