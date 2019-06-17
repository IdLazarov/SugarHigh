
import java.util.Scanner;

public class MainSugarHigh {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please insert the count of candies you have gathered:");
		Integer countOfCandies = input.nextInt();
		System.out.println("Please insert the sugar grams of the candies you have gathered:");
		Integer[] candies = new Integer[countOfCandies];

		for (int i = 0; i < candies.length; i++) {
			System.out.println("Candy number " + (i + 1) + " is: ");
			candies[i] = input.nextInt();
		}
		System.out.println("Please insert the amount of shugar grams you can eat:");
		Integer threshold = input.nextInt();

		sugarHigh(threshold, candies);

	}

	public static void sugarHigh(Integer border, Integer[] sweets) {

		for (int i = 0; i < sweets.length; i++) {
			int dif = 0;
			int[] arrayOfDif = new int[sweets.length];
			int possable;

			dif = border - sweets[i];

			arrayOfDif[i] = dif;
			System.out.println(arrayOfDif[i]);

			possable = dif + sweets[i++];

			if (possable <= border) {

				System.out.println(possable);

			}

		}

	}

}
