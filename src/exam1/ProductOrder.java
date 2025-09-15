package exam1;

public class ProductOrder {
     String productName;
     int price;
     int quantity;


     public ProductOrder(String productName, int price, int quantity) {
          this.productName = productName;
          this.price = price;
          this.quantity = quantity;
     }

     public void print() {
          System.out.println("상품명 : " + productName + ", 가격 : "  + price + ", 수량 : " + quantity);
     }
}
