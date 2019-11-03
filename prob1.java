
/**
 * Write a description of class prob1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class prob1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        for(int testCase = 0; testCase < testCases; testCase++)
        {
            String lower = in.nextLine();
            System.out.println(lower.toLowerCase());
        }
    }
}

