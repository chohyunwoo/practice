package exam0;

//public class MovieReviewMain {
//    public static void main(String[] args) {
//
//
//        MovieReview[] reviews = new MovieReview[2];
//
//        MovieReview inception = new MovieReview();
//        inception.title ="인셉션";
//        inception.review = "인생은 무한 루프";
//        reviews[0] = inception;
//
//        MovieReview aboutTime = new MovieReview();
//        aboutTime.title = "어바웃 타임";
//        aboutTime.review ="인생 시간 영화!";
//        reviews[1] = aboutTime;
//
//
//        for(MovieReview mr : reviews) {
//            System.out.println("영화 제목:" + mr.title +",리뷰 : " + mr.review);
//        }
//
//    }
//}
public class MovieReviewMain {
    public static void main(String[] args) {
        //  객체 2개 생성, 배열에 담아 초기화
        MovieReview[] reviews = {
                new MovieReview("인셉션", "인생은 무한 루프"),
                new MovieReview("어바웃", "인생 시간 영화!")
        };
        //향상된 for문 사용 reviews 배열에서 하나씩 꺼내서 review 변수에 담고 반복 실행
        for (MovieReview review : reviews) {
           // MovieReview의 print() 메서드 호출
            review.print();
        }


//        for (MovieReview review : reviews) {
//            System.out.println("영화제목: " + review.getTitle() + " 리뷰: " + review.getReview());
//        }
    }
}
