package level2Assignment;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Employee ID (Maximum 10 Chars) : ");
        int id = sc.nextInt();
        System.out.println("Total Working hour : ");
        int hour = sc.nextInt();
        System.out.println("Amount per hour : " );
        int amount= sc.nextInt();
        id=id;
        hour=hour;
        amount=amount;
        Salary(id,hour,amount);



    }


    public static void Salary(int id,int hour,int amount){
        while (hour!=0){
            int Total=hour*amount;
            System.out.println(id + " = " + Total);
            break;
        }


        }

    }

