package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int a  ,b;
        int sum;
        Scanner n =new Scanner(System.in);

        System.out.println("entur first number");
        a =n.nextInt();
        System.out.println("entur secound number");
        b =n.nextInt();
        sum= a+b;
        System.out.println(sum);
    }
}
