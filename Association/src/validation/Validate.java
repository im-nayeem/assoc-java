/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validation;

import java.io.IOException;

/**
 *
 * @author Nayeem
 */
public class Validate {
    public static boolean isValidVarsityName(String s){
       for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z')) 
            {
                continue;
            }
            else if(s.charAt(i)==' ')
                continue;
            else
                return false;
                
        }
        return true;
        
    }
    public static boolean isValidAssocName(String s){
         for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z')) 
            {
                continue;
            }
            else if(s.charAt(i)==' ' || s.charAt(i)=='\'')
                continue;
            else
                return false;
                
        }
        return true;
    }
    public static boolean isUrl(String url){
         try {
            (new java.net.URL(url)).openStream().close();
            return true;
        } catch (IOException ex) {
            return false;
        }
    }
    public static boolean isNumber(String s){
         for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (('0' <= ch && ch <= '9') == false) {
                return false;
            }
        }
        return true;
    }
    public static boolean isOnlyAlphabet(String s){
        return false;
    }
    
}