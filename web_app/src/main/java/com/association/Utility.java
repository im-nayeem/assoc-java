package com.association;


import javax.servlet.http.HttpServletRequest;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Base64;
import java.util.concurrent.ThreadLocalRandom;

public class Utility {
    public  static  int getVerificationCode(){
       return   ThreadLocalRandom.current().nextInt(1111, 1000000 );
    }

    public static String getBaseUrl(HttpServletRequest request) {
        String scheme = request.getScheme() + "://";
        String serverName = request.getServerName();
        String serverPort = (request.getServerPort() == 80) ? "" : ":" + request.getServerPort();
        String contextPath = request.getContextPath();
        return scheme + serverName + serverPort + contextPath;
    }

    public static String inputStreamToString( InputStream inpStream)
    {
        if(inpStream==null)
            return "";
        try{

            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

            byte[] buffer = new byte[8192];
            int length;
            while ((length = inpStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, length);
            }
            outputStream.flush();


            String base64Image = Base64.getEncoder().encodeToString(outputStream.toByteArray());
            return base64Image;



        }
        catch(Exception e)
        {
            throw  new RuntimeException(e.getMessage());
        }

    }
}
