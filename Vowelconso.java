import java.util.Scanner;

public class Vowelconso {

    public static void main(String[] args) {
        char ch;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter an alphabet: ");
        ch = scn.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'); {
            System.out.println(ch + " is a Vowel");}
            else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                System.out.println(ch + " is a Consonant");}
                else if((ch>='0' && ch<='9')){
                    System.out.println(ch + " is a Digit");}
                    else{
                        System.out.println(ch + " is a Special Character");
                    }
                    scn.close();
                }
                

        
    
}
         
        
