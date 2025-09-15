package exam1.exam4.init;

public class MemberInit {
    private String name;
    private int age;
    private int grade;


    public MemberInit(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public void print() {
        System.out.println("이름:" + name + " 나이:" + age + " 성적:" +
                grade);
    }
}
