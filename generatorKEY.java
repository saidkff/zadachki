package com.company;

import java.util.Random;
import java.util.Scanner;

public class generatorKEY {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        String value = "";
        int k = 0;

        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        for (int i=0; i<a; i++){
            if (k%2!=0){
                value+='A';
            }
            else{
                value+='B';
            }
            k++;
        }

        for (int i=0; i<b; i++){
            if (k%2!=0){
                value+='a';
            }
            else{
                value+='b';
            }
            k++;
        }
        for (int i=0; i<c; i++){
            if (k%2!=0){
                value+='9';
            }
            else{
                value+='1';
            }
            k++;
        }

        n = n-value.length();
        for (int i=0; i<n; i++){
            if (k%2!=0){
                value+='s';
            }
            else{
                value+='h';
            }
            k++;
        }
        System.out.println(value);
    }
}
