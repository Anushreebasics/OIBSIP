import java.util.*;
public class IDandPasswords {
    HashMap<String, String> logininfo=new HashMap<>();

    IDandPasswords(){
        logininfo.put("Bro","pizza");
        logininfo.put("Bhumika","PASSWORD");
        logininfo.put("Anushree","abc123");
    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }

}
