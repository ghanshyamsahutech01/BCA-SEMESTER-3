import java.util.*;
public class Arrays2 {

    public static void main(String[] args) {
        ArrayList<String>aa = new ArrayList<String>();
        aa.add("100");
        aa.add("200");
        aa.add("300");

        aa.add("100");

        System.out.println(aa);
        System.out.println(aa.size());
        aa.remove("200");
        System.out.println(aa);

        for(int i=0; i<aa.size(); i++)
            System.out.println(aa.get(i));
    }
}