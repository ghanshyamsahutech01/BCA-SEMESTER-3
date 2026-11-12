import java.util.*;
public class LinkedList1 {

    public static void main(String[] args) {
        LinkedList<String> aa = new LinkedList<String>();
        aa.add("100");
        aa.add("200");
        aa.add("300");

        aa.add("100");

        System.out.println(aa);
        System.out.println(aa.size());
        aa.removeFirst();
        System.out.println(aa);
        aa.removeLast();
        System.out.println(aa);
        aa.addFirst("50");
        System.out.println(aa);
        aa.addLast("500");
        System.out.println(aa);
    }
}