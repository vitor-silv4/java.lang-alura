package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {

		String nome = "Alura";
		
		//nome.replace("A", "a"); <- forma errada
		//nome.toLowerCase(); <- forma errada
		
		String outra = nome.replace("A", "a");
		String outraa = nome.toLowerCase();
		String outraaa = nome.toUpperCase();
		char c  = nome.charAt(2);
		int pos = nome.indexOf("ur");
		String sub = nome.substring(1);
		String vazio = " ";
		String outrovazio = vazio.trim(); //método trim retira espaço do começo e fim da String e retorna
		System.out.println(nome.contains("Alur")); //método pesquisa em uma string se tem esse trcho de string nessa string
		
		
		System.out.println(outra);
		System.out.println(outraa);
		System.out.println(outraaa);
		System.out.println(c);
		System.out.println(pos);
		System.out.println(sub);
		System.out.println(nome.length());
		for(int i = 0; i < nome.length(); i++ ) {
			System.out.println(nome.charAt(i));
		}
		System.out.println(vazio.isEmpty());
		System.out.println(outrovazio.isEmpty());
		
	}

}
