import java.util.*;
public class MainClass{
    public static void main(String[] args){
       
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Create Account ");
        System.out.println("2. Login ");
        System.out.println("3. Exit ");
        System.out.println("Enter your choice ");
        int choice = scan.nextInt();
      //  Account object;
        
        while(choice < 3 && choice != 3){
            switch(choice){
                case 1:{
                   
                    System.out.println("Enter the username ");
                    String username = scan.next();
                    System.out.println("Enter the password ");
                    String password = scan.next();
                    System.out.println("Enter the email");
                    String email = scan.next();
                
                    object.addAccount(username, email, password);
                    break;
                }
                case 2:{
                    System.out.println("Enter the username ");
                    String username = scan.next();
                    System.out.println("Enter the password ");
                    String password = scan.next();
                    if(object.authenticate(username, password)){
                        System.out.println("YOU ARE LOGGED IN SUCCESSFULLY!!!");
                        System.out.println("logged in successfully");
                        System.out.print("\n\n\n");
                        System.out.print("1. Add a new area of interest");
                        System.out.println("2. Remove an existing area of interest");
                        System.out.println("3. Username");
                        System.out.println("4. Email id");
                        System.out.println("5. Log out");
                        System.out.println("\nEnter your choice");
                        int loginChoice = scan.nextInt();
                        while(loginChoice  < 5){
                            switch(loginChoice){
                                case 1:{
                                    System.out.println("Enter your area of interest(s)");
                                    String areaOfInterest = scan.next();
                                    object.addDomain(areaOfInterest);
                                    break;
                                }
                                case 2:{
                                    System.out.println("enter the area of interest to be removed ");
                                    String area = scan.next();
                                    object.removeDomain(area);
                                    break;
                                }
                                case 3:{
                                    System.out.println("username is: ");
                                    System.out.println(object.getUserName());
                                    break;
                                }
                                case 4:{
                                    System.out.println("your email id is: ");
                                    System.out.println(object.getUserEmail());
                                    break;
                                }
                            }
                            System.out.print("1. Add a new area of interest");
                            System.out.println("2. Remove an existing area of interest");
                            System.out.println("3. Username");
                            System.out.println("4. Email id");
                            System.out.println("5. Log out");
                            System.out.println("\nEnter your choice");
                            loginChoice = scan.nextInt();
                        }
                    }
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