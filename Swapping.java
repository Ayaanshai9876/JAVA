import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers: ");  
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println("After swapping: n1 = " + n1 + ", n2 = " + n2);
        sc.close();
    }
    
}
