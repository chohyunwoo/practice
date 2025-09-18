package midle_1;

public class StringImmutable1 {
    public static void main(String[] args) {
        // String은 불변 객체 ! <- 이뜻은 뭐냐 불변객체는 저장할 변수가 필요함!
        String str = "hello";
        String a = str.concat("java");
        System.out.println("str = "+ a);
    }
}
