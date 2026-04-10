package application;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe numero de linhas : ");
		int m = sc.nextInt();
		System.out.println("Informe numero de colunas : ");
		int n = sc.nextInt();

		int[][] math = new int[m][n];

		for (int i = 0; i < math.length; i++) {
			for (int j = 0; j < math[i].length; j++) {
				math[i][j] = sc.nextInt();
			}
		}

		System.out.println("Qual valor voce quer checar : ");
		int checar = sc.nextInt();

		for (int i = 0; i < math.length; i++) {
			for (int j = 0; j < math[i].length; j++) {

				if (math[i][j] == checar) {

					if (j > 0) {
						System.out.println("Left : " + math[i][j - 1]);
					}
					if (j< n -1 ) {
						System.out.println("Right : " + math[i][j + 1]);
					}

					if (i > 0) {
						System.out.println("Up : " + math[i - 1][j]);
					}
					if (i < m -1 ) {
						System.out.println("Down : " + math[i + 1][j]);
					}

				}
			}
		}

		sc.close();
	}
}
