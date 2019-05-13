package retail;

import java.util.Scanner;

public class Gift_Shop
{
    static Scanner keyboard = new Scanner(System.in);

    public static void GiftShop()
    {
        String input = "";
        System.out.println("Ey my name is Small Tony. Welcome to the Zoo GiftShop!");
        System.out.println("We have: \n" +
                "Monkey Plushie: 5$\n" +
                "KingJulian Plushie: 3$\n" +
                "Madagascar: 15$\n" +
                "Jungle Book: 10$\n" +
                "Rock with a Face on it: 1$\n" +
                "Zoo Coloringbook: 3$\n" +
                "Zoo T-Shirt: 7$\n" +
                "Zoo Hat: 5$\n" +
                "Zoo Pin: 1$\n" +
                "Zoo Stickerbook: 2$\n" +
                "What would you like to purchase? (Or type leave to exit)");
        while (!input.equals("leave"))
        {
            input = keyboard.nextLine();
            switch (input)
            {
                case "Monkey Plushie" :
                    Wallet.walletSize = Wallet.walletSize - 5;
                    System.out.println("Thank you for your purchase. Anything Else?");
                    break;
                case "KingJulian Plushie" :
                    Wallet.walletSize = Wallet.walletSize - 3;
                    System.out.println("Thank you for your purchase. Anything Else?");
                    break;
                case "Madagascar" :
                    Wallet.walletSize = Wallet.walletSize - 15;
                    System.out.println("Thank you for your purchase. Anything Else?");
                    break;
                case "Jungle Book" :
                    Wallet.walletSize = Wallet.walletSize - 10;
                    System.out.println("Thank you for your purchase. Anything Else?");
                    break;
                case "Rock with a Face on it" :
                    Wallet.walletSize = Wallet.walletSize - 3;
                    System.out.println("Thank you for your purchase. Anything Else?");
                    break;
                case "Zoo Coloringbook" :
                    Wallet.walletSize = Wallet.walletSize - 3;
                    System.out.println("Thank you for your purchase. Anything Else?");
                    break;
                case "Zoo T-Shirt" :
                    Wallet.walletSize = Wallet.walletSize - 7;
                    System.out.println("Thank you for your purchase. Anything Else?");
                    break;
                case "Zoo Hat" :
                    Wallet.walletSize = Wallet.walletSize - 5;
                    System.out.println("Thank you for your purchase. Anything Else?");
                    break;
                case "Zoo Pin" :
                    Wallet.walletSize = Wallet.walletSize - 1;
                    System.out.println("Thank you for your purchase. Anything Else?");
                    break;
                case "Zoo Stickerbook" :
                    Wallet.walletSize = Wallet.walletSize - 2;
                    System.out.println("Thank you for your purchase. Anything Else?");
                    break;
                case "leave" :
                    System.out.println("Alright. You have a good day, or don't, don't bother me none");
                    input = "leave";
                    break;
                default: System.out.println("Listen here paly, make a purchase or leave. No lollygagging.");
            }

        }
    }
}
