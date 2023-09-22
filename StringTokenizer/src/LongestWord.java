import java.util.Scanner;
import java.util.StringTokenizer;

public class LongestWord 
{
	public static void main(String[] Args)
	{
		try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Escribe algo: ");
            String input = sc.nextLine();

            String longest ;
            
            StringTokenizer st = new StringTokenizer(input, " ");
            longest ="";
            while (st.hasMoreTokens()) {
                String token = st.nextToken();
                if(longest.length() <= token.length())
                {
                	longest = token;
                	
                }
                
                System.out.println(longest);
                
            }
        }
	}
}
