package estudos;

public class execeções {

	public static void main(String[] args) {
		int soma=0;
		for (int cont = 0; cont <= 100; cont++) {
			
			if (cont % 2 == 0) {
				// % é usado para resto de divisão.
				// Se o resto da divisão for 0, o numero é par.
				soma += cont;
				System.out.println(soma);
			}

		}

	}
}
