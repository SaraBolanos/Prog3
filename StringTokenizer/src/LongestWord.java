import java.util.Scanner;
import java.util.StringTokenizer;

/*funcion creada para encontrar la palabra mas larga en una frase	*/

public class LongestWord 
{
	public static void main(String[] Args)
	{
		try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Escribe algo: ");
            String input = sc.nextLine();

            String longest ;
            System.out.println();
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
