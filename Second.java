import java.util.*;
class Second
{
    public static void main(String a[]) 
    {
        Scanner s1 = new Scanner(System.in);
        String s = s1.next();
        System.out.println(atoi(s));
    }
    static int atoi(String s)
    {
        int n = 0;
		boolean flag = false ;
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(c>='0' && c<='9')
			{
				n*=10 ;
				n += c - '0'  ;
			}
			else if(c=='-')
			{
				flag = true ;
			}
		}
		if(flag)
		{
			return -n;
		}
        else
        { return n;} 
	}
}

