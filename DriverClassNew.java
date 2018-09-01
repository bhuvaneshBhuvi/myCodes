import java.util.*;
public class DriverClassNew{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Add user");
        System.out.println("2. Login");
        System.out.println("3. Search matching user");
        System.out.println("-1. Exit");
        System.out.println("Enter your choice ");
        int choice = scan.nextInt();
        ArrayList<Users> newUser = new ArrayList<>();
        Set<String> areaObject  = new HashSet<String>();
        
        while(choice != -1){
            switch(choice){
            case 1:{
                AddUsers adduserObject = new AddUsers();
                
                adduserObject.addUsers(newUser, areaObject);
                break;
            }
            case 2:{
                UserLogin loginObject = new UserLogin();
                System.out.println("Enter the username ");
                String username = scan.next();
                System.out.println("Enter the password ");
                String password = scan.next();
                if(loginObject.login(newUser, areaObject, username, password)){
                    System.out.println("1. Find matching User ");
                    System.out.println("2. Update Area of Interest ");
                    int choiceOfUser = scan.nextInt();
                    while(choiceOfUser != 2){
                        switch(choiceOfUser){
                            case 1:{
                                SearchMatchingUser searchObject = new SearchMatchingUser();
                                if(!searchObject.findMatch(newUser, username)){
                                    System.err.println("Invalid username ");
                                    System.out.println("Enter correct Username ");
                                }
                                break;
                            }
                        }
                        System.out.println("1. Find matching User ");
                        System.out.println("2. Update Area of Interest ");
                        System.out.println();
                        System.out.println("Enter your choice ");
                        choiceOfUser = scan.nextInt();
                    }
                }
                break;
            }
           
            
        }
        System.out.println("1. Add user");
        System.out.println("2. Login");
        System.out.println("3. Search matching user");
        System.out.println("-1. Exit");
        System.out.println("Enter your choice");
        choice = scan.nextInt();
               
        
      }
    }
}