import java.util.*;
public class Users{
    String username, password;
    Set<String> setObj;
    Users(String username, String password, Set<String> setAreaObj){
        this.username = username;
        this.password = password;
        this.setObj = setAreaObj;
    //    this.areaOfInterest = areaOfInterest;
    }
    public void setter(String username, String password, String areaOfInterest){
        this.username = username;
        this.password = password;
     //   this.areaOfInterest = areaOfInterest;
    }
    public void getter(){
        System.out.println("username = "+ username);
       
    }
}