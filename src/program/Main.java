package program;

/*
beecrowd | 1095 - Sequencia IJ 1

Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

Entrada
Não há nenhuma entrada neste problema.

Saída
Imprima a sequencia conforme exemplo abaixo
*/

public class Main {

	public static void main(String[] args) {
		
		for(int i = 1, j = 60; j > -1; i += 3, j -= 5) {
			System.out.printf("I=%d J=%d\n",i,j);
		}
	}
}
