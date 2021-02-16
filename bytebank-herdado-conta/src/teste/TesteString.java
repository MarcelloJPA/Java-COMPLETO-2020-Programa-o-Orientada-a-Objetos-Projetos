package teste;

public class TesteString {

	public static void main(String[] args) {
		String vazio = "";
		String nome = "Alura"; //Object Literal
		
		/*Verificar se a String ta vazia*/
		System.out.println(vazio.isEmpty());
		
		/*Letra da 2 Posição*/
		System.out.println(nome.charAt(2));
		
		/*Substitui A por a*/
		String outra = nome.replace("A", "a");
		
		/*nº da posição da string*/
		System.out.println(nome.indexOf("ra"));
		
		/*subtrai a letra especificada(1º)*/
		System.out.println(nome.substring(1));
		
		System.out.println(nome);
		System.out.println(outra);
		
		/*Faz um looping em toda a palavra e imprime cada letra*/
		for(int i=0; i<nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		
		
		

	}

}
