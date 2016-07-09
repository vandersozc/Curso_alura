package javaio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TesteIO {
	
	public static void main(String[] args) throws IOException {
		
		InputStream is = new FileInputStream("arquivo.txt"); //System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader bfr = new BufferedReader(isr);
		
		System.out.println("Digite uma mensagem...");
		String linha = bfr.readLine();
		
		while (linha != null) {
			System.out.println(linha);
			linha = bfr.readLine();
		}
		bfr.close();
	}
}
