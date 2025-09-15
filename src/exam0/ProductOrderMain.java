package exam0;

/*
public class ProductOrderMain {
    public static void main(String[] args) {

        ProductOrder[] products = new ProductOrder[3];

        ProductOrder item1 = new ProductOrder();
        item1.productName = "두부";
        item1.price = 2000;
        item1. quantity =2;
        products[0] = item1;

     //   김치 , 콜라 <- 위 와 같은 방식으로 코드 작성
        int totalAmount = 0;
        for(ProductOrder p : products){
            System.out.println("상품명: " + p.productName + ", 가격: " +
                    p.price + ", 수량: " + p.quantity);
            totalAmount += p.price * p.quantity;
        }

        System.out.println("총 결제 금액: " + totalAmount);
    }
        /*
         int totalAmount = 0;
        for(int i=0;  i< products.length; i ++){
            System.out.println("상품명: " + products[i].productName + ", 가격: " +
                    products[i].price + ", 수량: " + products[i].quantity);
            totalAmount += products[i].price * products[i].quantity;
        }
        System.out.println("총 결제 금액: " + totalAmount);
    }
         */
public class ProductOrderMain {
    public static void main(String[] args) {

        ProductOrder[] products = {
                new ProductOrder("두부", 2000, 2),
                new ProductOrder("김치", 5000, 1),
                new ProductOrder("콜라", 1500, 2)
        };

        int totalAmount = 0;
        for (ProductOrder product : products) {
            product.print();
            totalAmount += product.getTotalPrice();
        }
        System.out.println("총 결제 금액:" + totalAmount);

    }
}





