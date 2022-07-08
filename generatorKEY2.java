package com.company;

import java.util.Random;
import java.util.Scanner;

public class generatorKEY2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        String value = "";
        int key = 0;
        int memory = 0;

        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        for (int i=0; i<a; i++){
            key = 65 + rnd.nextInt(26);
            if (key==memory){
                key = 65 + rnd.nextInt(26);
                if (key==memory){
                    key = 65 + rnd.nextInt(26);
                }
            }
            value+=(char) (key);
            memory = key;
        }

        for (int i=0; i<b; i++){
            key = 97 + rnd.nextInt(26);
            if (key==memory){
                key = 97 + rnd.nextInt(26);
                if (key==memory){
                    key = 97 + rnd.nextInt(26);
                }
            }
            value+=(char) (key);
            memory = key;
        }

        for (int i=0; i<c; i++){
            key = 48 + rnd.nextInt(10);
            if (key==memory){
                key = 48 + rnd.nextInt(10);
                if (key==memory){
                    key = 48 + rnd.nextInt(10);
                }
            }
            value+=(char) (key);
            memory = key;
        }

        n = n-value.length();
        for (int i=0; i<n; i++){
            key = 97 + rnd.nextInt(26);
            if (key==memory){
                key = 97 + rnd.nextInt(26);
                if (key==memory){
                    key = 97 + rnd.nextInt(26);
                }
            }
            value+=(char) (key);
            memory = key;
        }

        System.out.println(value);
    }
}