package exam1;

import exam1.exam2.ProductOrder;

public class ProductOrderMain {
    public static void main(String[] args) {

        ProductOrder[] products = {
                new ProductOrder("두부", 2000, 2),
                new ProductOrder("김치", 5000, 1),
                new ProductOrder("콜라", 1500, 2)
        };
        int amount =0;
        for (ProductOrder productOrder : products) {
            productOrder.print();
            amount += productOrder.getPrice();
        }
        System.out.println("총 결제 금액 : " + amount);

       /*
        ProductOrder[] products = new ProductOrder[3];

        ProductOrder a = new ProductOrder();
        a.productName = "두부";
        a.price = 2000;
        a.quantity = 2;
        products[0] = a;

        ProductOrder b = new ProductOrder();
        b.productName = "김치";
        b.price =5000;
        b.quantity = 1;
        products[1] = b;

        ProductOrder c = new ProductOrder();
        c.productName = "콜라";
        c.price = 1500;
        c.quantity = 2;
        products[2] = c;


        int amount =0;

        for(ProductOrder product : products) {
            System.out.println("상품명 : " + product.productName + ", 가격 : "  + product.price + ", 수량 : " + product.quantity);
            amount += product.price * product.quantity;
        }
        System.out.println("총 결제 금액 : " + amount);

        */

    }
}
