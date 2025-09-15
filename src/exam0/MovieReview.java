package exam0;

public class MovieReview {
    String title;
    String review;


    public MovieReview(String title, String review) {
        this.title = title;
        this.review = review;
    }

//    public String getTitle() {
//        return title;
//    }
//
//    public String getReview() {
//        return review;
//    }

    public  void print() {
        System.out.println("영화제목: " + title + " 리뷰: " + review);
    }
}


