import java.util.Scanner;

public class Sumofdigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int x=0;
        for(;n>0;n/=10){
            int y=n%10;
            x+=y;
        }
        System.out.println("Sum of digits: " + x);
        sc.close();
    }
}

    

