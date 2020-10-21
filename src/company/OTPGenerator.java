package company;

import java.util.*;

public class OTPGenerator {
    static char[]otp_Password(int len) 
    {
        System.out.println("Generate password using randoms() : ");
        System.out.println("Your password is : ");
        String Capital_Chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_Chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "1234567890";
        String Symbols = "!@#$%^&*_=-/.?<>)";
        String values = Capital_Chars + Small_Chars + numbers + Symbols;

        Random rnd_Method = new Random();//Method to generate random characters
        char[]password = new char[len];

        for(int i = 0; i < len; i++)
        {
            password[i] = values.charAt(rnd_Method.nextInt(values.length()));
        }
        return password;
    }
    public static void main(String... Thanos)
    {
        int length = 10;
        System.out.println(otp_Password(length));

    }
}