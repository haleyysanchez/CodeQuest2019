import java.util.*;
public class prob7
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        for(int testCase = 0; testCase < testCases; testCase++)
        {
            int n = in.nextInt();
            ArrayList<Double> num = new ArrayList<Double>();
            num.clear();
            for(int i = 0; i<n;i++)
            {
                num.add(in.nextDouble());
            }
            ArrayList<Double> sort = new ArrayList<Double>();
            for(double k : num)
            {
                sort.add(k);
            }
            Collections.sort(sort);
            double min = sort.get(0);
            double max = sort.get(sort.size()-1);
            sort.clear();
            for(double x : num)//int j = 0; j < num.size(); j++)
            {
                double out = ((x-min)/(max-min))*255;
                System.out.println(Math.round(out));
            }
            
        }
    }
}
