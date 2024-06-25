import java.util.ArrayList;
import java.util.List;

public class List2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add(1,"Spring");
        list.add("DBMS");

        int size = list.size();
        System.out.println("총 객체 수: " + size);

        for (int i = 0; i < list.size(); i++){
            String str = list.get(i);
            System.out.println(i + ": " + str);
        }
    }
}
