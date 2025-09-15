package exam0;

public class MethodCange1 {
    public static void main(String[] args) {
        int a=10;
        System.out.println("메서드 호출 전: a = " +a);
        changePrimitive(a);
        System.out.println("메서드 호출 전: a = " + a);
    }

    private static void changePrimitive(int x) {
        x =20;

    }

    /*

      int a=10;
        System.out.println("메서드 호출 전: a = " +a);

        메서드가 반환한 값을 re 변수에 저장
        int re = changePrimitive(a);

        반환된 값 (a는 여전히 10  , re는 20)
        System.out.println("메서드 호출 전: a = " + re);

        void는 반환값이 없기 때문에, 값을 돌려받으려면 int로 반환 타입을 바꿔야 한다.
        private static int changePrimitive(int x) {
        x =20;
        return x;
    }

     */

}
