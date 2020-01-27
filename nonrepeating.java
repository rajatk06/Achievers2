import java.util.*;
class nonRepeating
{
    public static void main(String a[])
    {
        Scanner s1 = new Scanner(System.in);
        String str = s1.next();
        System.out.println(firstNonRep(str));

    }
    static int firstNonRep(String str)
    {
       
        str.toLowerCase();
        for(int i = 0;i<str.length();i++)
        {
            boolean status = true;
            for(int j=i+1;i<str.length();j++)
            {
                if(str.charAt(i) == str.charAt(j))
                {
                    status = false;
                }
                else
                status = true;
            }
            if(status == true)
            {
                return i;
            }
        }
     return -1;
    }
}