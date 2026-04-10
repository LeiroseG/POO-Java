package application;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = 0;
		int n = sc.nextInt();

		int[][] math = new int[n][n];

		for (int i = 0; i< math.length; i++) {
			for (int j = 0; j< math[i].length; j++) {
				math[i][j] = sc.nextInt();

			}
		}
		for (int i = 0; i < math.length; i++) {
			for (int j = 0; j< math[i].length; j++) {
				if (math[i][j] == math[j][i]) {
					System.out.println("Main diagonal :" + math[i][j]);
				}

				if (math[i][j] < 0) {
					count++;
				}
			}
		}

		System.out.println("negative numbers : " + count);
		sc.close();
	}
}
