/**
 * This is the 4th problem in the problem packet.
 *
 * @author Haley Sanchez & Allen Martinez
 */

import java.util.*;
public class prob4
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        for(int testCase = 0; testCase < testCases; testCase++)
        {
            int s = in.nextInt();
            
            String b = in.nextLine();//in.nextLine();
            int index = b.indexOf(" ");
            String h = b.substring(index + 1);
            if(h.equalsIgnoreCase("true"))
            {
            if(s <= 65)
            System.out.println("no ticket");
            else if(66 <= s&&s <= 85)
            System.out.println("small ticket");
            else if(s >= 86)
            System.out.println("big ticket");
            }
            else
            {   
                if(s <= 60)
            System.out.println("no ticket");
            else if(61 <= s&&s <= 80)
            System.out.println("small ticket");
            else if(s >= 81)
            System.out.println("big ticket");
            }
        }
    }
}

