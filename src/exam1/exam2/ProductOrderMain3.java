package exam1.exam2;

import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력할 주문의 개수를 입력하세요 :");
        int n = sc.nextInt();
        sc.nextLine(); // nextInt() 후 남은 \n을 처리하기 위한 nextLine() 추가

        ProductOrder[] products = new ProductOrder[n];


        int i = 0;
        while (i < n) {
            System.out.println((i+1)+ "번째 주문 정보를 입력하세요.");

            System.out.print("상품명 :");
            String productName = sc.nextLine(); // 이제 정상적으로 입력을 받을 수 있음

            System.out.print("가격 : ");
            int price = sc.nextInt();

            System.out.print("수량 : ");
            int quantity = sc.nextInt();
            sc.nextLine(); // 숫자 입력 후 남은 \n을 처리하기 위한 nextLine() 추가

            products[i] = createOrder(productName, price, quantity);
            i ++;
        }
        printOrders(products);
        int totalAmount = getTotalAmount(products);
        System.out.println(totalAmount);

    }


/*
        for (int i = 0; i < n; i++) {
            System.out.println((i+1)+ "번째 주문 정보를 입력하세요.");

            System.out.print("상품명 :");
            String productName = sc.nextLine(); // 이제 정상적으로 입력을 받을 수 있음

            System.out.print("가격 : ");
            int price = sc.nextInt();

            System.out.print("수량 : ");
            int quantity = sc.nextInt();
            sc.nextLine(); // 숫자 입력 후 남은 \n을 처리하기 위한 nextLine() 추가

            products[i] = createOrder(productName, price, quantity);
        }
        printOrders(products);
        int totalAmount = getTotalAmount(products);
        System.out.println("총 결제 금액 : " + totalAmount);
    }
    */


        static ProductOrder createOrder (String productName,int price, int quantity){
            return new ProductOrder(productName, price, quantity);
        }

        static void printOrders (ProductOrder[]orders){
            for (ProductOrder order : orders) {
                order.print();
            }
        }

        static int getTotalAmount (ProductOrder[]orders){
            int totalAmount = 0;
            for (ProductOrder order : orders) {
                totalAmount += order.getTotalPrice();
            }
            return totalAmount;
        }
    }
