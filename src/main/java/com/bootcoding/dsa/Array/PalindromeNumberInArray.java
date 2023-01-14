package com.bootcoding.dsa.Array;

import java.util.Scanner;

public class PalindromeNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array : ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        int i;
        for (i = 0; i < numbers.length; i++) {
            System.out.println("Enter Number" + (i + 1));
            int number = sc.nextInt();
            numbers[i] = number;

        }
        System.out.println("Palindrome Number: ");
        palindromeNumber(numbers);
    }

    public static void palindromeNumber(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int temp=numbers[i];
            int sum=0;
            while (numbers[i]<0){
                int rem=numbers[i]%10;
                numbers[i]=numbers[i]/10;
                sum=sum*10+rem;
            }if(temp==numbers[i]){
                System.out.println(temp);
            }
        }
    }
}


