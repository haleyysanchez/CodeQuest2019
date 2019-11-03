
/**
 * Write a description of class prob3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class prob3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        for(int testCase = 0; testCase < testCases; testCase++)
        {
            String one = in.next();
            String two = in.next();
            if(one.equals(two))
            System.out.println("true");
            else
            System.out.println("false");
        }
    }
}


