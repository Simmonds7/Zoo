package retail;

import java.util.Scanner;

public class Concessions {
    static Scanner keyboard = new Scanner(System.in);

    public static void ConcessionStands()
    {
        String input = "";
        System.out.println("Ey my name is Big Tony. Welcome to the Zoo Concessions!");
        System.out.println("We have: \n" +
                "Dippin Dots: 5$\n" +
                "Funnel Cake: 3$\n" +
                "Hot Dog: 2$\n" +
                "Large Popcorn: 2$\n" +
                "Small Popcorn: 1$\n" +
                "What would you like to purchase? (Or type leave to exit)");
        while (!input.equals("leave"))
        {
            input = keyboard.nextLine();
            switch (input)
            {
                case "Dippin Dots" :
                    Wallet.walletSize = Wallet.walletSize - 5;
                    System.out.println("Thank you for your purchase. Anything Else?");
                    break;
                case "Funnel Cake" :
                    Wallet.walletSize = Wallet.walletSize - 4;
                    System.out.println("Thank you for your purchase. Anything Else?");
                    break;
                case "Hot Dog" :
                    Wallet.walletSize = Wallet.walletSize - 2;
                    System.out.println("Thank you for your purchase. Anything Else?");
                    break;
                case "Large Popcorn" :
                    Wallet.walletSize = Wallet.walletSize - 2;
                    System.out.println("Thank you for your purchase. Anything Else?");
                    break;
                case "Small Popcorn" :
                    Wallet.walletSize = Wallet.walletSize - 5;
                    System.out.println("Thank you for your purchase. Anything Else?");
                    break;
                case "leave" :
                    System.out.println("Aight paly. You have a good day.");
                    input = "leave";
                    break;
                    default: System.out.println("Listen here paly, make a purchase or leave. No lollygagging.");
            }

        }
    }
}
