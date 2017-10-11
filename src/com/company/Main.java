package com.company;
import java.util.Random; //Import random number generator
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        //Declare variables
        int userchoice;
        int x = 1 + r.nextInt(10);
        //Ask user for input
        System.out.println("Please enter number as 1 -10");
        userchoice = keyboard.nextInt();

//Run Loop to check numbers
        while (userchoice != x) {
            if (userchoice > x) {
                System.out.println("You guessed to low try again");//Ask user for new input
                userchoice = keyboard.nextInt();

            }
            else if (userchoice < x) {

                System.out.println("You guessed to high try again");//Ask user for new input
                userchoice = keyboard.nextInt();

            }

        }//End While

        System.out.println("Congrats You guess correctly");//Tell user they guess correctly

    }//End Main Method

            }//End Main Class

