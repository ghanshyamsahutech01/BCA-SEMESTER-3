import java.io.*;
public class Fi {
    public static void main(String[] args) throws IOException
    {
        File f = new File("a.txt");
        if(f.createNewFile())
            System.out.println("File created Successfully");
        else
            System.out.println("File Already Exists");
    }
}
