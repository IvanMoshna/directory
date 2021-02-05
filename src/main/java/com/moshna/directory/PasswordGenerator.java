package com.moshna.directory;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {

    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPassword = "user";
        String encoderPassword = encoder.encode(rawPassword);

        System.out.println(encoderPassword);
    }
}