package br.com.betha.banco;

public class TestaString {
	
	public static void main(String[] args) {
		
		/*--- Exemplo 01
		String palavra = "Alura";
		
		for (int i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}
		*/
		
		
		String texto1 = "Socorram-me, subi no ônibus em Marrocos";
		String texto2 = "anotaram a data da maratona";
		String invertida1 = "";
		String invertida2 = "";
		
		/*-- Exemplo 02
		for (int i = texto1.length()-1; i >= 0; i--) {
			invertida1 += texto1.charAt(i);
		}
		System.out.println(invertida1);
		*/
		
		/*-- Exemplo 03
		for (int i = texto2.length()-1; i >= 0; i--) {
			invertida2 += texto2.charAt(i);
		}
		System.out.println(invertida2 + "\n\n");
		*/
		
		/*-- Exemplo 04
        String palavras[] = texto1.split(" ");
        for(int i = palavras.length-1;i >= 0;i--){
        	invertida1 = invertida1.concat(palavras[i]+" ");
        }
        System.out.println("Frase invertida: " + invertida1);
        */
		
		/*-- Exemplo 05
		String invertida3 = new StringBuilder(texto1).reverse().toString();
		System.out.println(invertida3);
		*/
		
		
		/* -- Converte String para Int
		String x = "762";
		int numero = Integer.parseInt(x);
		System.out.println(numero);
		
		//Ouu
		
        public class DesafioConversaoDeNumeros {

            public static void main(String[] args) {
                String numero = "762";
                System.out.println("Imprimindo a string: " + numero);

                int resultado = converteParaInt(numero);
                System.out.println("Imprimindo o int: " + resultado);
            }

            private static int converteParaInt(String numero) {
                int resultado = 0;
                while (numero.length() > 0) {
                    char algarismo = numero.charAt(0);
                    resultado = resultado * 10 + (algarismo - '0');
                    numero = numero.substring(1);
                }
                return resultado;
            }
        }
        */
		
	}

}
