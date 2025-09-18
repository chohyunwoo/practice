package baekjoon;

import java.util.Scanner;

public class B31403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.println(A+B-C);

        String sA = String.valueOf(A);
        String sB = String.valueOf(B);  // <- String.valueOf() <- 문자열로 변환
        int result = Integer.parseInt(sA+sB);  //Integer.parseInt() <- 정수형으로 변환

        System.out.println(result -C);
    }
}
