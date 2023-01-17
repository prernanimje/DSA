package level2Assignment;

import java.util.Scanner;

public class printTwoNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []numbers = new int [2];
        for (int i=0;i<numbers.length;i++){
            System.out.println("Enter number : " );
            int  print = sc.nextInt();
            numbers[i]=print;
        }
           System.out.println("This is sum of two numbers : " );
         create(numbers);


    }

    public static int[] create(int[] numbers) {
        for (int i = 1; i > 0; i++) {
            while (numbers[i] != 0) {
                int Add = numbers[i] + numbers[i];
                 System.out.println(Add);
                 break;
            }
        }
          return numbers;
    }
}
