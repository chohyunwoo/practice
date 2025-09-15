package exam1.exam4.member;

public class MemberThis {
    private String nameField;
    private int a;
    private int b;

    public MemberThis(String nameField, int a, int b) {
        this.nameField = nameField;
        this.a = a;
        this.b = b;
    }
    public void print(){
        System.out.println("이름: " + nameField + "나이: " +a + "성적: " + b);

    }

//    void initMember(String nameParameter, int age,  int grade) {
//        nameField = nameParameter;
//        a=  age;
//        b= grade;
//
//    }
}
