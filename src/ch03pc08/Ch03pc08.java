package ch03pc08;
import java.util.Scanner;
/**
 *
 * @author FRANK.OLSON
 * date: 11/1/2017
 * purpose: Calculate discount of sales
 */
public class Ch03pc08 {

    public static void main(String[] args) {
        //variables
        double retail = 99;
        double quantity, rate, cost, discount, total;
        
        //create keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        //request input
        System.out.print("Please enter the quantity of packages: ");
        quantity = keyboard.nextDouble();
        
        //calculate discount
        if (quantity >= 100)
            rate = .50;
        else if (quantity < 100 && quantity >= 50)
            rate = .40;
        else if (quantity < 50 && quantity >= 20)
            rate = .30;
        else if (quantity < 20 && quantity >= 10)
            rate = .20;
        else
            rate = 0;
        
        cost = retail * quantity;
        discount = cost * rate;
        total = cost - discount;
        
        System.out.printf("The cost is: $%,.2f\n", cost);
        System.out.printf("The discount is: $%,.2f\n", discount);
        System.out.printf("The total is: $%,.2f\n", total);
        
    }
    
}
