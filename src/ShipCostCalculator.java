public class ShipCostCalculator {
    public static void main(String[] args)

    {
        System.out.println("Enter the item price: ");

        // simulate user input
        double itemPrice = 10;

        //calculations
        double shippingCost = itemPrice * .02;
        double totalCost = itemPrice + shippingCost;


        if (itemPrice >= 100)
        {
            System.out.println( "Your shipping is free, so your total cost is: $" + itemPrice);
        }

        else
        {
            System.out.println("Your shipping cost is: $" + shippingCost + ", so your total cost is: $" + totalCost);
        }

    }
}