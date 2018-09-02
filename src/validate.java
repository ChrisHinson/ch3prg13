import java.util.regex.*;
public class validate
{
    public static Boolean validString(String in, String regex)
    {

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(in);


        Boolean b = m.matches();
        if (b == true)
        {
            return Boolean.TRUE;
        }
        else
        {
            return Boolean.FALSE;
        }
    }

}
