/**
 * This is the 2nd problem in the problem packet.
 *
 * @author Haley Sanchez & Allen Martinez
 */

import java.util.*;
public class prob2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        for(int testCase = 0; testCase < testCases; testCase++)
        {
            int one = in.nextInt();
            int two = in.nextInt(); int d = (one + two)*2;
            if(one == two)
            {System.out.println(d);}
            else if(one != two)
            {System.out.println(one + two);}
            
        }
    }
}
