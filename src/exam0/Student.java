package exam0;

public class Student {
    String name;
    int age;
    int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }


    public  void print( ){

        System.out.println("이름: " +name + "나이: " + age + " 성적: " + grade);
    }
}
