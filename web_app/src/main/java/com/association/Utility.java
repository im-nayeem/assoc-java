package com.association;

import java.util.concurrent.ThreadLocalRandom;

public class Utility {
    public static String getAbbreviation(String s){

        return "";
    }
    public  static  int getVerificationCode(){
       return   ThreadLocalRandom.current().nextInt(1111, 1000000 );
    }


}
