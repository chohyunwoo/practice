package enumeration.ex3;

import enumeration.ex2.ClassGrade;

public class DiscountService {

    public int discount(Grade grade, int price){
        int discountPercent = 0;

        if(grade==grade.BASIC){
            discountPercent = 10;
        } else if (grade==grade.GOLD) {
            discountPercent = 20;
        } else if (grade==grade.DIAMOND){
            discountPercent = 30;
        }else {
            System.out.println("할인X");
        }
        return price * discountPercent / 100;
    }

//    public void printDiscount(ClassGrade classGrade , int price){
//        System.out.println(classGrade);
//    }
}
