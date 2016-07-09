package javaio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class EscreveArquivo {
	
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(new FileInputStream("arquivo.txt"));
        PrintStream saida = new PrintStream(new FileOutputStream("saida.txt"));
        while (entrada.hasNextLine()) {
            saida.println(entrada.nextLine());
        }
        saida.close();
        entrada.close();
    }
}
