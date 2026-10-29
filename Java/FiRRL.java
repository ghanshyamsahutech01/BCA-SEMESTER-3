import java.io.*;
public class FiRRL {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Name = ");
        String s = br.readLine();
        System.out.println("Your Name = " + s);
    }
}
