package exam1.exam2;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = createOrder("두부", 2000 , 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);

        printOrders(orders);
         int totalAmount = getTotalAmount(orders);
        System.out.println(" 총 결제 금액 : " + totalAmount);


    }
    static ProductOrder createOrder(String productName, int price, int quantity){
        return new ProductOrder(productName, price,quantity);
    }

    static void printOrders(ProductOrder[] orders){
        for(ProductOrder order : orders) {
            order.print();
        }
    }

    static int getTotalAmount(ProductOrder[] orders){
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.getTotalPrice();
        }
        return totalAmount;
    }
}

//public class ProductOrderMain2 {
//    public static void main(String[] args) {
//        ProductOrder[] products = new ProductOrder[3];
//        products[0] = createOrder("두부",2000,2);
//        products[1] = createOrder("김치", 5000, 1);
//
//        printOrders(products);
//        int totalAmount = getTotalAmount(products);
//        System.out.println("총 결제 금액 : " + totalAmount);
//    }
//    static ProductOrder createOrder(String productName, int price, int quantity) {
//        ProductOrder product = new ProductOrder();
//        product.productName = productName;
//        product.price = price;
//        product.quantity = quantity;
//
//        return product;
//    }
//
//    static void printOrders(ProductOrder[] products) {
//        for (ProductOrder product : products) {
//            System.out.println("상품명 : " +product.productName + "가격 : " +product.price + "수량 : " + product.quantity);
//        }
//    }
//
//    static int getTotalAmount(ProductOrder[] products) {
//        int totalAmount = 0;
//        for (ProductOrder product : products) {
//            totalAmount += product.quantity * product.price;
//        }
//        return totalAmount;
//    }
//}
