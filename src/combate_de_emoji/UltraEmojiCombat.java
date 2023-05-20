package combate_de_emoji;

import java.util.Scanner;

import entidades.combate.Luta;
import entidades.combate.Lutador;

public class UltraEmojiCombat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lutador l[] = new Lutador[6];

		l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 81.9f, 11, 2, 1);

		l[1] = new Lutador("Putscrip", "brasil", 29, 1.68f, 80.8f, 14, 2, 3);

		l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);

		l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);

		l[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 80.3f, 5, 4, 3);

		l[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 82.7f, 12, 2, 4);

		Luta UEC01 = new Luta();
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha dois numeros de 0 a 5 para começar");
		System.out.print("Essse numero indica o primeiro lutador: ");
		int lutador1 = sc.nextInt();
		System.out.print("Essse numero indica o segundo lutador: ");
		int lutador2 = sc.nextInt();
		System.out.println();

		UEC01.marcaeLuta(l[lutador1], l[lutador2]);
		UEC01.lutar();

		sc.close();
	}

}
