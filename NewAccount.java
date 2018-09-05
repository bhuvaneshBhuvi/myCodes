import java.util.*;
public class NewAccount{
    String username;
    String password;
    
    public  void createAccount(String username, String password){
        this.username = username;
        this.password = password;
    }
    public int login(String username, String password, ArrayList<NewAccount> arraylistObject){
        for(NewAccount it: arraylistObject){
            if(username.equals(it.username)){
                if(password.equals(it.password)){
                
                    return 1;
                }
                else
                    return -1;
            }
        }
        return 0;
    }
        

}