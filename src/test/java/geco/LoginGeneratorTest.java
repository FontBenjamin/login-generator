package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fontb on 22/11/2016.
 */
public class LoginGeneratorTest {

    LoginGenerator loginGenerator;
    LoginService loginService;

    @Before
    public void setUp(){
        loginService = new LoginService(new String[] {"JROL", "BPER",
                "CGUR", "JDUP", "JRAL", "JRAL1"});
        loginGenerator = new LoginGenerator(loginService);
    }

    @Test
    public void generateLoginForNomAndPrenomPaulDurant() throws Exception {
        loginGenerator.generateLoginForNomAndPrenom("Durant","Paul");
        assertTrue(loginService.loginExists("PDUR"));
    }

    @Test
    public void generateLoginForNomAndPrenomJohnRalling() throws Exception {
        loginGenerator.generateLoginForNomAndPrenom("Ralling","John");
        assertTrue(loginService.loginExists("JRAL2"));
    }


    @Test
    public void generateLoginForNomAndPrenomJeanRolling() throws Exception {
        loginGenerator.generateLoginForNomAndPrenom("Rolling","Jean");
        assertTrue(loginService.loginExists("JROL1"));
    }

    @Test
    public void generateLoginForNomAndPrenomPaulDurantAccent() throws Exception {
        loginGenerator.generateLoginForNomAndPrenom("Dùrant","Paul");
        assertTrue(loginService.loginExists("PDUR"));
    }

    @Test
    public void generateLoginForNomAndPrenomPaulDu() throws Exception {
        loginGenerator.generateLoginForNomAndPrenom("Du","Paul");
        assertTrue(loginService.loginExists("PDU"));
    }


}