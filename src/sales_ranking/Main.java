package sales_ranking;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int alcohol = 0;
		int gasoline = 0;
		int diesel = 0;
		
		int productCode = 0;
		
		System.out.printf("Enter the product code:%n"
				+ " 1 - Alcool%n"
				+ " 2 - Gasoline%n"
				+ " 3 - Diesel%n"
				+ " 4 - To exit%n");
		
		while (productCode != 4) {
			productCode = sc.nextInt();
			
			switch (productCode) {
			
			case 1:
				alcohol += 1;
				break;
			case 2:
				gasoline += 1;
				break;
			case 3:
				diesel += 1;
				break;
			default:
				System.out.println("Invalid code. Please enter 1, 2, 3 or 4 to exit.");
			}
		}
		
		System.out.printf("Thank You%n"
				+ "Alcohol: %d%n"
				+ "Gasoline: %d%n"
				+ "Diesel: %d%n",
				alcohol, gasoline, diesel);
		
		
		sc.close();

	}

}
