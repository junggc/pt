package t2;
import java.util.regex.Pattern;
public class C1 {

    public static void main(String[]args){

        String pattern = "^[0-9]*$"; //숫자만
        String val = "@@"; //대상문자열

        boolean regex = Pattern.matches(pattern, val);
        System.out.println(regex);



    }

}
