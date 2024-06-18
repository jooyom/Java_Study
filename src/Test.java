import java.util.ArrayList;
import java.util.List;

public class Test extends Youtube {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Hello");
        String str = (String) list.get(0);
        //list가 모든 타입을 받을 수 있기 때문에
        // list의 요소를 String으로 찾기 위해 형변환을 해주어야 한다.


        List<String> list2 = new ArrayList<String>();
        list2.add("Hello");
        String str2 = list2.get(0);


    }

}
