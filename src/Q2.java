import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("배열의 크기를 입력하세요");
        int a = scanner.nextInt();
        int[] array = new int[a];

        for (int i = 0; i < array.length; i++) {
            System.out.println("배열의 요소를 작성하세요");
            int b = scanner.nextInt();
            b = array[i];
        }

        try {
            System.out.println("호출하고자 하는 인덱스 번호를 입력하세요.");
            int c = scanner.nextInt();
            System.out.println("배열의 요소는: " + array[c]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 크기를 초과했습니다.");
        } finally {
            scanner.close();
        }
    }
}
