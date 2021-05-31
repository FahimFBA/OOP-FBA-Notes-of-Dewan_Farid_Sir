import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("one");
        set.add("2nd");
        set.add("3rd");
        set.add(new Integer(6));
        set.add(new Float(7.7F));
        set.add("2nd"); // duplicates are not added
        System.out.println(set);

    }
}
