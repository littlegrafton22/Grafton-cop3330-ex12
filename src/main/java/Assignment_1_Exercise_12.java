/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Grafton
 */
import java.util.Scanner;
class SimpleInterest
{
    double principal;
    double rate;
    int years;
    public void read()
    {
        //create an object of Scanner class
        Scanner sc = new Scanner(System.in);
        // take input from users
        System.out.print("Enter the principal: ");
        this.principal = sc.nextDouble();
        System.out.print("Enter the rate of interest: ");
        this.rate = sc.nextDouble();
        System.out.print("Enter the number of years: ");
        this.years = sc.nextInt();
    }
    public void print()
    {
        int worth = (int)Math.round(principal*(1+rate*years*0.01));
        //Print the result
        System.out.println("After "+years+" years at "+rate+"%, the investment will be worth $"+worth );

    }
}
class Main{
    public static void main(String args[])
    {
        SimpleInterest ca = new SimpleInterest();
        ca.read();
        ca.print();


    }
}

