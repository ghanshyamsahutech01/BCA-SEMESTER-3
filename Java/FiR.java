import java.io.*;
public class FiR {
    public static void main(String[] args) throws IOException
    {
        File f = new File("a.txt");
        if(f.createNewFile())
            System.out.println("File created Successfully");
        else
            System.out.println("File Already Exists");

        FileReader fr = new FileReader(f);
        int ch;
        while ((ch=fr.read())!=-1)
            System.out.print((char)ch);

        fr.close();
    }
}
