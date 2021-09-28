import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CafeUtil {

    // Method for Get Streak Goal
    // Return the sum of 1 thru 10 (int)

    public int getStreakGoal() {

        int sum = 0;
        for (int x=0; x<11; x++){
            sum+=x;
        }
        return sum;
    }


    // Method for Print Price Chart
    public void printPriceChart(String productName, double price, int maxNumber) {

        System.out.println(productName + "\n" + "1 - $" + price);
        System.out.println("2 - $" + price*2);
        System.out.println("3 - $" + price*3);
    }


    // Method for Get Order Total
    public double getOrderTotal(double[] lineItems) {
        double sum = 0;
        for (int x=0; x<lineItems.length; x++){
            sum += lineItems[x];
        }
        return sum;
    }

    // Method for Display Menu

    public void displayMenu(ArrayList<String> menu, ArrayList<Double> prices){
        for (int x=0; x<menu.size(); x++){
            System.out.println(x + " " + menu.get(x) + " -- $" + prices.get(x));
        }
    }


    // Another way to solve

    // public void displayMenu(List<String> loadMenu, List<Double> loadPrices){
    //     for (int x=0; x<loadMenu.size(); x++){
    //         System.out.println(x + " " + loadMenu.get(x) + " -- $" + loadPrices.get(x));
    //     }
    // }


    // Add Customer

    public void addCustomer(ArrayList<String> customers, String userName){
        customers.add(userName);
    }


}