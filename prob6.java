/**
 * This is the 6th problem in the problem packet.
 *
 * @author Haley Sanchez & Allen Martinez
 */

import java.util.*;
public class prob6
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        for(int testCase = 0; testCase < testCases; testCase++)
        {
            int num = in.nextInt();
            double r = 40075/ 3.1415926;
            double c = (2 * 3.1415926) * (r +num);
            System.out.println(c);
        }
    }
}
