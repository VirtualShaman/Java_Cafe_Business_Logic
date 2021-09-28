import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TestCafe {
    
    public static void main(String[] args) {
        // In here is where I put all the test code

        // TO-DO:
        // Create an instance of the CafeUtil class        
        // in order to use the CafeUtil class' methods.
    
        // Hint: it will need to correspond with the variable name
        // used in your test code.
    
        CafeUtil appTest = new CafeUtil();

        // Given Test Cases Here
    
        // Get Streak Goal
        System.out.println("----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n", appTest.getStreakGoal());


        // Print price chart
        System.out.println("----- Price Chart Test-----");
        appTest.printPriceChart("Chai Latte Mix", 4.5, 3);
        appTest.printPriceChart("Specialty Coaster", 2.0, 5);

        // Get order total
        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n",appTest.getOrderTotal(lineItems));

        // Display the menu
		System.out.println("----- Display Menu Test-----");
		List<String> loadMenu = Arrays.asList( "drip coffee", "cappucino", "latte", "mocha" );
		List<Double> loadPrices = Arrays.asList(1.5, 3.5, 4.5, 3.5);
		ArrayList<String> menu = new ArrayList<String>();
		ArrayList<Double> prices = new ArrayList<Double>();
    
		// Note: Below is a way to add multiple elements to a list in fewer lines.
		// It does require an extra import at the top of the file.
		menu.addAll(loadMenu);
		prices.addAll(loadPrices);
		appTest.displayMenu(menu, prices);

		// Solution 2
		// appTest.displayMenu(loadMenu, loadPrices);

		// Add Customer

		String userName = System.console().readLine();

		System.out.println("----- Add Customer Test-----");
		ArrayList<String> customers = new ArrayList<String>();
		// Test 4 times
		for (int i = 0; i < 4; i++) { 
		appTest.addCustomer(customers, userName); 
		System.out.println(customers);
		}


    }
}