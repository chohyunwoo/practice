package exam1.exam4.member;



public class MethodInitMain3 {
    public static void main(String[] args) {

        MemberThis[] member = {
                new MemberThis("user1",1,2),
                new MemberThis("user2",4,5),
        };

        for(MemberThis m : member){
            m.print();
        }


//        MemberThis member1 = new MemberThis();
//        member1.initMember("user1",1,2);
//
//        MemberThis member2 = new MemberThis();
//        member2.initMember("user2",4,5);
//
//        MemberThis[] members = {member1, member2};
//
//        for (MemberThis s : members) {
//            System.out.println("이름" + s.nameField + "나이" + s.a + "성적" + s.b);
//        }

    }
}

