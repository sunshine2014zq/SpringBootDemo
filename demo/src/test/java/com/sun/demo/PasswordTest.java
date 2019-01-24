package com.sun.demo;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCrypt;

public class PasswordTest {

    @Test
    public void test(){
        BCrypt bCrypt = new BCrypt();
        String hashpw = BCrypt.hashpw("123456", BCrypt.gensalt());
        System.out.println(hashpw);
        boolean checkpw = BCrypt.checkpw("123456", hashpw);
        System.out.println(checkpw);
    }
}
