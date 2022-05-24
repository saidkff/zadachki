package com.company;

import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int myNumber;
        String mess;
        boolean flag = true;
        int x = (int) (Math.random()*100+1);
        while(flag){
            System.out.println("Gues a number between 1 and 100: ");
            myNumber = scan.nextInt();
            if (myNumber>x){
                System.out.println(myNumber + " is too high. Try again! ");
            }
            else if(myNumber<x){
                System.out.println(myNumber + " is too lov. Try again! ");
            }
            else{
                System.out.println(myNumber + " is correct! You Win!  ");
                System.out.println("Would you like to play again? (y/n)");
                mess = scan.next();
                if (!mess.equals("y")){
                    System.out.println("Good Luck!, Have a nice day! ");
                    flag = false;
                }
                else{
                    x = (int) (Math.random()*100+1);
                }
            }
        }
    }
}
