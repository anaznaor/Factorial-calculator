package hr.fer.oop.lab.zad1;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Unesi broj do kojeg ce se ispisati sve faktorijele:");
		Scanner sc = new Scanner(System.in);
		int n;
		try {
			n = Integer.parseInt(sc.nextLine());
			Iterator<Integer> iterator = new FactorialIterator(n);
			while(iterator.hasNext())
			    System.out.println(iterator.next());
		} catch (NumberFormatException e) {
			System.out.println("Potrebno je unijeti prirodan broj.");
			sc.close();
		}
		sc.close();
	}

}
