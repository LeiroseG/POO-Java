package entities;

public class Notas {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;

	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	/*
	 * public Object stats() { if (notaFinal() > 60) { return 0; }else { return 60 -
	 * notaFinal(); } }
	 */

	public double notaFaltando() {
		if (notaFinal() < 60) {
		}
		return (double) resultado();

	}

	public Object resultado() {
		if (notaFinal() < 60.0) {
			System.out.println("FAILED");
			double notaFaltando = 60 - notaFinal();
			System.out.printf("MISSING %.2f POINTS%n", notaFaltando);
		} else {
			System.out.println("PASS");
			return 0;
		}
		return name;
	}
}
