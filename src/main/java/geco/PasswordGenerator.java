package geco;

import java.util.UUID;

/**
 * Created by fontb on 30/11/2016.
 */
public class PasswordGenerator {

    public String getRandomPassword(){
        String uuid = UUID.randomUUID().toString();
        System.out.println(uuid);
        return uuid.substring(0,8);
    }
}
