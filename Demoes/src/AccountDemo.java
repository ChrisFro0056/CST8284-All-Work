package Demoes;

/*
 * 	Name			Christopher Frosst
 * 	Student Num 	041121594
 * 	Course Name 	Computer Programming (Java)
 * 	Lab Section 	301
 */

import java.util.Scanner;

public class AccountDemo {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int accountID;
        int balance;
        int withdraw;

        System.out.println("Enter Account ID: ");
        accountID = input.nextInt();
        System.out.print("Enter Balance: \n$");
        balance = input.nextInt();
        System.out.print("Enter Withdrawal: \n$");
        withdraw = input.nextInt();

        System.out.printf("\nAccount ID: %d\nBalance: %d\nWithdraw: %d\n", accountID, balance, withdraw);
    }
}
