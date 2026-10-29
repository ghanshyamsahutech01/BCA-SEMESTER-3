import java.io.*;
public class Fi2 {
    public static void main(String[] args) throws IOException
    {
        File f = new File("a.txt");
        if(f.createNewFile())
            System.out.println("File created Successfully");
        else
            System.out.println("File Already Exists");

        FileWriter fw = new FileWriter(f);
        fw.write("Welcome To Io Package");
        fw.flush();
        fw.close();
    }
}
