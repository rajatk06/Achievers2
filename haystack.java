import java.util.*;
class haystack
{
    public static void main(String a[] )
	{
		Scanner s1 = new Scanner (System.in);
		String haystack = s1.next();
		String needle = s1.next();
		System.out.print(strStr(haystack,needle));
    }
    static int strStr(String haystack, String needle)
    {
        return haystack.indexOf(needle);
    }
}