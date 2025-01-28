import java.util.Scanner;
public class Even {
        public static void main(String[] args){
            int Number;
            Scanner sc=new Scanner(System.in);
            System.out.println("\n please Enter any integer Value:");
            Number=sc.nextInt();
            if(Number%2==0){
                System.out.println("\n You have entered EVEN Numbebr");
    
            }
            else{
                System.out.println("\n You have entered ODD Number");
           }
           sc.close();
        }
    }
    

