package compilador;

import java.io.File;

public class Principal 
{
    public static void main(String[] args) 
    {
        String path="E:/Compilador-Final-Automatas2/src/compilador/Lexer.flex";
        generarLexer(path);
    }

    public static void generarLexer(String path)
    {
        File file=new File(path);
        JFlex.Main.generate(file);
    }
}
