/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Password="Object_Programming";
        System.out.print("Enter your Username: ");
        String Str1 = input.nextLine();
        System.out.print("Enter your Password: ");
        String Str2 = input.nextLine();
        if(Str2.equals(Password))
            System.out.println("Welcome!");
        else
            System.out.println("I don't know you");
    }
}