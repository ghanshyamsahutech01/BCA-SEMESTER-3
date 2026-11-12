import java.util.*;
public class HashSetImp2 {

    public static void main(String[] args) {
        HashSet<String> aa = new HashSet<String>();
        aa.add("100");
        aa.add("200");
        aa.add("300");

        aa.add("100");

        System.out.println(aa);
        System.out.println(aa.size());

        Iterator itr = aa.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}