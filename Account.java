import java.util.*;
public class Account{
    String username, password;
    Set<String> areaOfInterestObject = new Set<String>();
    ArrayList<Account> accountObject = new ArrayList<>();
    public boolean addAccount(){
         System.out.println("Enter the user name");
         username = scan.next();
         for(Account iterator: accountObject){
             if(username.equals(iterator.username))
                 return  false;
         }
         do{
         System.out.println("Enter the password of atleast 4 characters");
         password = scan.next();
         }while(password.length()<4);
         String add = "true";
         while(add == "true"){
             System.out.println("Enter the area of interest");
             areaOfInterest = scan.next();
             areaOfInterestObject.add(areaOfInterest);
             System.out.println("Another another field? (YES/NO)");
             String choice = scan.next();
             if(choice != "YES")
                 add = "FALSE";
            }
            accountObject.add(username, password, areaOfInterestObject);
            return true;
    }
}