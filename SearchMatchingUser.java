import java.util.*;
public class SearchMatchingUser{
    public boolean findMatch(ArrayList<Users> searchUser, String username){
          String interestedarea = "";
          for(Users matchObject: searchUser){
                    if(username.equals(matchObject.username)){
                      interestedarea += matchObject.areaOfInterest;
                      for(Users matchUserObject: searchUser){
                          if( (!username.equals(matchUserObject.username)) && (interestedarea.equals(matchUserObject.areaOfInterest)) ){
                              System.out.println("Matching pair " + matchUserObject.username);
                              return true;
                      }
                }
                System.out.println("No matching pair found ");
                return true; 
            }
                
      }
    return false;
  }
}