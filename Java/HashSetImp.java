import java.util.*;
public class HashSetImp {

    public static void main(String[] args) {
        HashSet<String>aa = new HashSet<String>();
        aa.add("100");
        aa.add("200");
        aa.add("300");

        aa.add("100");

        System.out.println(aa);
        System.out.println(aa.size());
    }
}