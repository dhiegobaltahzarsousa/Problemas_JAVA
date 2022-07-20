package br.org.javaproblems.basic;

import java.util.*;

public class MediasPonderadas {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int casos = input.nextInt();
		int cont = 0;
		while (cont < casos) {

			float a = input.nextFloat();
			float b = input.nextFloat();
			float c = input.nextFloat();

			System.out.printf("%.1f\n", (a * 2 + b * 3 + c * 5) / 10);

			cont++;
		}

		input.close();
	}
}
