package geco;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fontb on 30/11/2016.
 */
public class PasswordGeneratorTest {
    @Test
    public void getRandomPassword() throws Exception {
        assertTrue(new PasswordGenerator().getRandomPassword().length() == 8);
    }

}