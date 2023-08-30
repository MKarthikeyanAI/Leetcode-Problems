import java.util.Scanner;
import java.util.*;
class Solution15{
    public boolean ispalindrome(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            Character start=s.charAt(i);
            Character end=s.charAt(j);
            if(!Character.isLetterOrDigit(start))
            {
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(end))
            {
                j--;
                continue;
            }
            if(Character.toLowerCase(start)!=Character.toLowerCase(end))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
public class palindrome_two_pointer {
    public static void main(String args[])
    {
        Scanner d= new Scanner(System.in);
        String s = d.nextLine();
        Solution15 sol = new Solution15();
        boolean t = sol.ispalindrome(s);
        System.out.println("Answer is "+t);
    }
}
