package exam1.exam4.construct;

public class MemberConstruct {
    private String name;
    private int age;
    private int grade;

    MemberConstruct(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public void printInfo() {
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" +
                grade);
    }

}
