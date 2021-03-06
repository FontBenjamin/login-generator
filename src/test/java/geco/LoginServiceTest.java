package geco;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by fontb on 22/11/2016.
 */
public class LoginServiceTest {

    private String[] logins ;
    private ArrayList<String> loginsExistants;
    private LoginService ls;


    @Before
    public void setup(){
        loginsExistants = new ArrayList<String>();
        logins = new String[] {"ben","lea"};
        ls = new LoginService(logins);
    }

    @Test
    public void loginExists() throws Exception {
        assertTrue(ls.loginExists("ben"));
    }

    @Test
    public void addLogin() throws Exception {
        ls.addLogin("theo");
        assertTrue(ls.loginExists("theo"));
    }

    @Test
    public void findAllLoginsStartingWith() throws Exception {
        List<String> log = new ArrayList<String>();
        log = ls.findAllLoginsStartingWith("b");
        assertTrue(log.size()==1 && log.get(0).equals("ben"));
    }

    @Test
    public void findAllLogins() throws Exception {
        for(int i = 0 ; i < logins.length ; i++){
            loginsExistants.add(logins[i]);
        }
        assertEquals(ls.findAllLogins(),loginsExistants);
    }

}