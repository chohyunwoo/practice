package baekjoon;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class B10699 {
    public static void main(String[] args) {

        //현재 날짜 객체 생성
        LocalDateTime now = LocalDateTime.now();
        //출력형식 정의
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        //Local 객체를 formatter 이용해서 문자열 변환
        System.out.println(now.format(dtf));
    }
}
