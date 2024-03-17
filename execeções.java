package estudos;

import java.util.Scanner;

public class execeções {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero");
		int n1 = sc.nextInt();
		for (int m = 1; m <= 10; m++) {
            int multi = m * n1;
            System.out.println( n1 + "x"+ m + "=" + multi);
		}
	}

}
