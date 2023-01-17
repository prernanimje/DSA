package level2Assignment;

public class printOperators {

    public static void print(){
        int first=125;
        int second=24;
        int num=0;
        while (num==0){
            int sum = first+second;
            int sub=first-second;
            int multi = first*second;
            int div=first/second;
            int rem=first%second;

            System.out.println(" Multiplications of 125 and 24 :"+ sum);
            System.out.println(" Subtractions of 125 and 24 :"+sub);
            System.out.println(" Multiplication of 125 and 24 : "+multi);
            System.out.println(" Divide  of 125 and 24 : "+div);
            System.out.println(" Remainder of 125 and 24 : "+rem);
            break;
        }

    }

    public static void main(String[] args) {
        print();
    }
}
