/**
 * This is the 5th problem in the problem packet.
 *
 * @author Haley Sanchez & Allen Martinez
 */

import java.util.*;
public class prob5
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        for(int testCase = 0; testCase < testCases; testCase++)
        {
            int small  = in.nextInt();
            int big = in.nextInt(); 
            int wall = in.nextInt();
            int a = small;
            int b = big*5;
            int len = wall%5;
            boolean work = false;
            for(int i = 0;i<=b;i+=5)
            {
                for(int j = 0; j<= a; j++)
                {
                    if(i+j==wall)
                    work = true;
                }
            }
            if(b==wall || a == wall)
            System.out.println("true");
            else if(work)
            System.out.println("true");
            else
            System.out.println("false");
        }
    }
}
