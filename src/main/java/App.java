/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 Gabriel Mousa
 */

import java.util.Scanner;
import java.lang.Math;

public class App{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        final int conv = 350;

        System.out.println("What is the length?");
        int length = Integer.parseInt(input.nextLine());

        System.out.println("What is the width?");
        int width = Integer.parseInt(input.nextLine());

        double area = Math.ceil(width*length);

        int i = 1;
        int num = conv*i;
        while(area > num){
            i++;
            num = conv*i;
        }

        System.out.println("You will need to purchase " + i + " gallons of paint to cover " + area + " square feet.");

    }
}