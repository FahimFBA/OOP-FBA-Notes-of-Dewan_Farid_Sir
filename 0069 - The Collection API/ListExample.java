import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("One");
        list.add("2nd");
        list.add("3rd");
        list.add(new Integer(6));
        list.add(new Float(7.7F));
        list.add("2nd"); // duplicate is added
        System.out.println(list);
    }
}
