import java.util.*;
public class Arrays1 {

    public static void main(String[] args) {
        ArrayList<String> aa = new ArrayList<String>();
        aa.add("100");
        aa.add("200");
        aa.add("300");

        aa.add("100");

        System.out.println(aa);
        System.out.println(aa.size());
    }
}