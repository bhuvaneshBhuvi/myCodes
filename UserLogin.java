import java.util.*;
public class UserLogin{
    public boolean login(ArrayList<Users> user, Set<String> setAreaObj,  String userName, String password){
        for(Users checkUser : user){
            if ((userName.equals(checkUser.username)) && (password.equals(checkUser.password))){
                System.out.println("User Name = " + checkUser.username);
                System.out.println("Area Of Interest ");
                System.out.println(checkUser.setAreaObj);
                return true;
            }
        }
        return false;
    }
}
