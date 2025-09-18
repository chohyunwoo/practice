package midle_1;

public class ImmutableMydateMain {

    public static void main(String[] args) {


        ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1);
        ImmutableMyDate date2 = date1;

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
        System.out.println("2025 -> date1");
        date1 = date2.withYear(2025); //객체를 반환할때는 변수에  저장을 해줘야 한다!! , 저장할 변수가 없으면 객체가 생성되고 버려지게 된다.
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}
