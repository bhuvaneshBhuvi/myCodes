import java.util.*;
public class AddUsers{
    String username, password, areaOfInterest;
    public void addUsers(ArrayList<Users> newUser, Set<String> areaObject){
              Scanner scan = new Scanner(System.in);
              System.out.println("enter the user name: ");
              username = scan.next();
              System.out.println("enter the password");
              password = scan.next();
              String add = "true";
              while(add == "true"){
                  System.out.println("enter the area of interest");
                  areaOfInterest = scan.next();
                  areaObject.add(areaOfInterest);
                  System.out.println("Add another area (YES/NO) ");
                  String addAnotherChoice = scan.next();
                  if(addAnotherChoice.equals("NO")){
                       add = "false";
                   //    System.out.println("hello");
                  }
              }
              Users userObject = new Users(username, password, areaObject);
              
              newUser.add(userObject);
    }
}