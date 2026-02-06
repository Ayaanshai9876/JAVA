import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int x=0;
        for(;n>0;n/=10){
            int y=n%10;
            x=x*10+y;


        }
        System.out.println(x);
        sc.close();

    }
    
}
