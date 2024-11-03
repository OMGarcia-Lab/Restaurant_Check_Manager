import java.util.Scanner;

public class RestaurantCheckManager {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double subTotal, tipAmount, totalCheckAmount;
        double totalSales = 0., totalTips = 0., totalCheckSum = 0.;
        int checkCount = 0;
        int checkAmount;
        String toContinue;

        System.out.println("Welcome to the Check Manager! Please Follow the Directions Below!");

        do {

            System.out.println("Total Sale Amount: ");
            subTotal = in.nextDouble();

            System.out.println("Total Tip Amount: ");
            tipAmount = in.nextDouble();

            System.out.println("Total Check Amount: ");
            checkAmount = (int)in.nextDouble();

            checkCount++;
            System.out.println("Check Count: \n " + checkCount);

            if (tipAmount == 0) {
                tipAmount = checkAmount - subTotal;
            }

            if (checkAmount > (subTotal + tipAmount)){
                tipAmount = checkAmount - subTotal;
            }

            if (checkAmount < (subTotal + tipAmount)){
                tipAmount = checkAmount - subTotal;
            }

            totalCheckAmount = subTotal + tipAmount;
            totalSales = totalSales + subTotal;
            totalTips = totalTips + tipAmount;
            totalCheckSum = totalCheckSum + totalSales + totalTips;

            System.out.println("Current Total Sales so far are: \n" + totalSales);
            System.out.println("Current Pooled Tips are: \n" + totalTips);


            System.out.println("Do you want to stop? (y/n): ");
            toContinue = in.next();
        }while(!(toContinue.equalsIgnoreCase("y") |
                toContinue.equalsIgnoreCase("yes")));


        System.out.println("The Total Sale Amount for Today is: " + totalSales);
        System.out.println("The Total Pooled Tip Amount is: " + totalTips);

        System.out.println();
        //Added an Empty Print Statement so I could add space between ones with information//
        //Added an Empty Print Statement so I could add space between ones with information//
        System.out.println("Tip Allocating for: "+ totalTips);

        double serverTips, kitchenTips, frontTips;
        double server1, server2, server3, server4;
        double chef, sChef, kAid;
        double host, busser;

        serverTips = totalTips / 3;
        kitchenTips = totalTips / 3;
        frontTips = totalTips / 3;
        System.out.println();
        //Added an Empty Print Statement so I could add space between ones with information//
        System.out.println("Servers: ");
        System.out.println("Server 1 (Full-Shift): " + serverTips * 0.33);
        System.out.println("Server 2 (Full-Shift): " + serverTips * 0.33);
        System.out.println("Server 3 (Half-Shift): " + serverTips * 0.16);
        System.out.println("Server 4: N/A (Not on Shift)");

        System.out.println();
        //Added an Empty Print Statement so I could add space between ones with information//
        System.out.println("Kitchen : ");
        System.out.println("Chef: " + kitchenTips * 0.5);
        System.out.println("Sous-Chef: " + kitchenTips * 0.3);
        System.out.println("Kitchen-Aid: " + kitchenTips + 0.2);

        System.out.println();
        //Added an Empty Print Statement so I could add space between ones with information//
        System.out.println("Front of House: ");
        System.out.println("Host: " + frontTips * 0.5);
        System.out.println("Busser 1: " + frontTips * 0.25);
        System.out.println("Busser 2: " + frontTips * 0.25);
    }
}
