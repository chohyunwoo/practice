package exam1.exam4.init;

public class MethodImiyMain1 {
    public static void main(String[] args) {

        MemberInit[] init = {
                new MemberInit("user1", 15, 90),
                new MemberInit( "user2", 16, 80)
        };

        for(MemberInit m : init){
            m.print();
        }



        /*
        MemberInit[] init = new MemberInit[2];
        init[0] = initMember("user1", 15, 90);
        init[1] = initMember( "user2", 16, 80);


        for (MemberInit s : init) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" +
                    s.grade);
        }
    }
    static MemberInit initMember( String name, int age, int grade) {
        MemberInit member = new MemberInit();
        member.name = name;
        member.age = age;
        member.grade = grade;
        return member;
    }

         */
    }
}