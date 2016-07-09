package javaio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ScannerIO {
	
	public static void main(String[] args) throws IOException {
        InputStream is = System.in;  //new FileInputStream("arquivo.txt");
        Scanner entrada = new Scanner(is);

        System.out.println("Digite sua mensagem:");
        while (entrada.hasNextLine()) {
            System.out.println(entrada.nextLine());
        }
        entrada.close();
    }

}
