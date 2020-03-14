package homework;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class GeneratingRandomNumbers {

	public static void main(String[] args) {
		Random rand = new Random();
		Set<Integer> ts = new TreeSet<Integer>();
		while (ts.size() < 500) {

			int randomInteger = rand.nextInt((2000 - 100) + 1) + 100;
			ts.add(randomInteger);
		}
		System.out.println(ts);
		System.out.println(ts.size());

		System.out.println("500 random numbers generated");
		System.out.println("=======================");
		Object[] allRandom = ts.toArray();
		System.out.println("Enter the smallest index you want");
		Scanner userInput = new Scanner(System.in);
		int N = userInput.nextInt();
		System.out.println(allRandom[N - 1]);

	}

}
