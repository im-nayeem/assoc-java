package com.association;

import org.jetbrains.annotations.NotNull;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.concurrent.ThreadLocalRandom;

public class Utility {
    public  static  int getVerificationCode(){
       return   ThreadLocalRandom.current().nextInt(1111, 1000000 );
    }


}
