package exercicio1;

public class Studenty {

	public String name, situacao;
	public double notaSemestre_1, notaSemestre_2, notaSemestre_3;
	double media;

	public void calcularMedia() {
		media = notaSemestre_1 + notaSemestre_2 + notaSemestre_3;

	}

	public void aprovacao() {
		if (media >= 60) {
			situacao = "PASS";
		} else {
			situacao = "FAILED";
		}
	}
	public double faltaNota() {
		return 60.00 - media;  
	}

	public String toString() {
		return "FINAL GRADE = " 
				+ String.format("%.2f%n", media)
				+ situacao;
	}

}
