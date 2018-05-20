package br.com.douglasramiro.imac.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    private static Regex instance = new Regex();

    private Regex(){

    }

    public boolean containsAValidName(String value){

        String regx = "^[\\p{L} .'-]+$";
        return validateRegex(regx,value);

    }

    public boolean containsOnlyNumbers(String value){
        String regx = "^\\d{1,10}$";
        return validateRegex(regx,value);
    }

    public boolean containsEmail(String email){

        String regx = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        return validateRegex(regx,email);

    }

    private boolean validateRegex(String regex, String value){
        if (value != null) {
            Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(value);
            return matcher.find();
        }else{
            return false;
        }
    }

    public static Regex getInstance() {
        return instance;
    }
}
