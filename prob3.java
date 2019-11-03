/**
 * This is the 3rd problem in the problem packet.
 *
 * @author Haley Sanchez & Allen Martinez
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


