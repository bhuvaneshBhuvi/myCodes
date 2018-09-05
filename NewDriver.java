import java.util.*;
public class NewDriver{
    public static void main(String[] args){
       
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Create Account ");
        System.out.println("2. Login ");
        System.out.println("3. Exit ");
        System.out.println("Enter your choice ");
        int choice = scan.nextInt();
        ArrayList<NewAccount> listobj = new ArrayList<>();
        NewAccount object = new NewAccount();
        while(choice < 3 && choice != 3){
            switch(choice){
                case 1:{
                   
                    System.out.println("Enter the username ");
                    String username = scan.next();
                    System.out.println("Enter the password ");
                    String password = scan.next();
                    object.createAccount(username, password);
                    listobj.add(object);
                    break;
                }
                case 2:{
                    System.out.println("Ener the username ");
                    String username = scan.next();
                    System.out.println("Enter the password ");
                    String password = scan.next();
                    int offset = object.login(username, password, listobj);
                    if(offset == 1)
                        System.out.println("logged in successfully");
                    else
                        System.err.println("invalid combination");
                    break;
                }
            }
            System.out.println("1. Create Account ");
            System.out.println("2. Login ");
            System.out.println("3. Exit ");
            System.out.println("Enter your choice ");
            choice = scan.nextInt();
        }
    }
}