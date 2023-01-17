package level2Assignment;

import java.lang.reflect.Array;

public class Operations {

    public static void Count() {
        int sum=0, add, sub, div;
        while (sum==0){
            add=-5 + 8 * 6;
            sub=(55+9) % 9;
            div=20 + -3*5 / 8;
            sum=5 + 15 / 3 * 2 - 8 % 3;

            System.out.println(add);
            System.out.println(sub);
            System.out.println(div);
            System.out.println(sum);
        }
    }
       public static void main (String[]args){
            Count();
        }
    }

