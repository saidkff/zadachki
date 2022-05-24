package com.company;

import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String mess;

        while (true){
            int x = (int) (Math.random()*100+1);
            while(true){
                System.out.println("Gues a number between 1 and 100: ");
                int myNumber = scan.nextInt();
                if (myNumber<x){
                    System.out.println(myNumber + " is too low. Try again! ");
                }
                else if(myNumber>x){
                    System.out.println(myNumber + " is too high. Try again! ");
                }
                else{
                    System.out.println(myNumber + " is correct! You Win!  ");
                    break;
                }
            }
            System.out.println("Would you like to play again? (y/n)");
            mess = scan.next();
            if (!mess.equals("y")){
                System.out.println("GOOD LUCK!");
                break;
            }
        }
    }
}
