package level2Assignment;

import java.util.Scanner;

public class printTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("The table of " + num);
        table(num);
        }

    public static void table(int num){

        for(int i=1;i<=10;i++)
        {
            int multi=num*i;
            System.out.println("Table of " + num + "*"+ i+ " ="+multi);

        }
    }
}
