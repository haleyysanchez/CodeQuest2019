import java.util.*;
public class prob9
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        for(int testCase = 0; testCase < testCases; testCase++)
        {
            String one = in.nextLine();
            ArrayList<String> s = new ArrayList<String>();
            if(one.indexOf(" ") != -1 || one.indexOf(",") != -1)
            {
                String str = one.substring(one.length()-2);
                int n = Integer.parseInt(one.substring(0,one.length()-2));
                if(str.equals("s"))
                {
                    System.out.println("");
                } 
                else
                if(str.equals("m"))
                {
                    
                }
                else
                if(str.equals("h"))
                {
                    
                }
            }
        }
    }
}
