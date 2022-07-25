package org.example;


import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
       int amt, originalAmt, qtrs, nickels, dimes, pennies;

        System.out.println("Enter a whole number from 1 to 99:");
        System.out.println("I will print a combination of coins that add up to that change");

        Scanner input = new Scanner(System.in);
        amt = input.nextInt();

        originalAmt = amt;
        qtrs = amt / 25;
        amt = amt % 25;

        dimes = amt /10;
        amt = amt % 10;

        nickels = amt /5;
        amt = amt % 5;

        pennies = amt;

        System.out.println(originalAmt + "Your change in coins is:");
        System.out.println(qtrs + "quarters," + dimes + "dimes," + nickels + "nickels," + pennies + "pennies");
    }
}
