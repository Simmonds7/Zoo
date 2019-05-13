package retail;

import java.util.Scanner;

public class Wallet
{
    static int walletSize = 0;
    static Scanner keyboard = new Scanner(System.in);

    public static void setWallet()
    {
        System.out.println("Your current Balance is " + getWallet() + "$. How much would you like to add?");
        int inputMoney = keyboard.nextInt();
        walletSize = walletSize + inputMoney;
    }
    public static int getWallet()
    {
        return walletSize;
    }

}
