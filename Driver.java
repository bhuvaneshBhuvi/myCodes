import java.util.*;
public class Driver{
    public static void main(String[] args){
        Scanner scan = new Scannner(System.in);
        System.out.println("1. SignUp");
        System.out.println("2. Login");
        System.out.println("3. View");
        System.out.println("4. Add Details");
        System.out.println("5. Delete Details");
        System.out.println("6. Delete Account");
        System.out.println("7. Exit");
        System.out.println("Enter your choice");
        int choice = scan.nextInt();
        while(choice !=7 && choice <7){
            switch(choice){
                case 1:{
                    Account accountObject = new Account();
                    if(accountObject.addAccount())
                      System.out.println("Signed Up successfully!");
                    else
                      System.out.println("Sign Up failed");
                    break;
                }
            }
        }

    }
}