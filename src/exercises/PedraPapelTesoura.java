package exercises;

import java.util.Scanner;

public class PedraPapelTesoura {

public static String rps(String mao1, String mao2) {
		
	    String resultado = null;

	    if (mao1.equals(mao2)) {
	        resultado = "Empate";
	    } else if (mao1.equals("Pedra") && mao2.equals("Tesoura")) {
	        resultado = "Mão 1 VENCEU !!!";
	    } else if (mao1.equals("Tesoura") && mao2.equals("Papel")) {
	        resultado = "Mão 1 VENCEU !!!";
	    } else if (mao1.equals("Papel") && mao2.equals("Pedra")) {
	        resultado = "Mão 1 VENCEU !!!";
	    } else {
	        resultado = "Mão 2 VENCEU !!!";
	    }
	    return resultado;
	}
	

	public static void main(String[] args) {
		System.out.println("COMECE A PARTIDA");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Faça a escolha da primeira mão [Pedra/Papel/Tesoura]: ");
		String mao1 = sc.next();
		System.out.println("Faça a escolha da segunda mão [Pedra/Papel/Tesoura]: ");
		String mao2 = sc.next();
		
		String result = rps(mao1, mao2);
		System.out.println(result);
		sc.close();
		
	}

}
