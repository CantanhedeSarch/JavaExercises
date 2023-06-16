package repetiçãoaula;

import java.util.Scanner;

public class Repeat {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numeroSorteado = 4;

		System.out.println("Qual é o número sorteado? ");
		int numeroDigitado = entrada.nextInt();//1
		int tentativas = 1;

		while (numeroDigitado != numeroSorteado) {
			
			if (tentativas == 3) {
				System.out.println("Passou do numero de tentativas");
				break;
			}
	

			System.out.println("tentativas: " + tentativas);

			System.out.println("Errou. Tente mais uma vez");
			numeroDigitado = entrada.nextInt(); //2 6
			tentativas++;//3
		}

		if (numeroDigitado == 5) {
			System.out.println("Parabéns. Você acertou!");
			
		}
	}
}