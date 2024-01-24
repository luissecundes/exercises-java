package exercises;

public class NumberLineJump {
	
	 public static String kangaroo(int x1, int v1, int x2, int v2) {
		 
	        /* Se a velocidade do primeiro canguru for menor ou igual à velocidade do segundo,
	         e eles partirem do mesmo ponto ou o primeiro canguru estiver atrás do segundo,
	         não será possível alcançar o mesmo local ao mesmo tempo.*/
		 
	        if (v1 <= v2 || (x1 < x2 && (x2 - x1) % (v1 - v2) != 0)) {
	            return "NO";
	        }

	        /* Se a diferença inicial entre os pontos for divisível pela diferença de velocidade então eles se encontrarão em algum ponto no futuro.*/
	        return ((x2 - x1) % (v1 - v2) == 0) ? "YES" : "NO";
	    }

	public static void main(String[] args) {

	}

}
