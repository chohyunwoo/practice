package exam0;

public class ProductOrder {
    String productName;
    int price;
    int quantity;


    public ProductOrder(String productName, int price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

//    public String getProductName() {
//        return productName;
//    }
    public int getPrice() {
        return price;
    }
//
//    public int getQuantity() {
//        return quantity;
//    }
    public int getTotalPrice() {
        return price * quantity;
    }

    public void print(){
        System.out.println("상품명: " + productName + ", 가격: " +
                price + ", 수량: " + quantity);
    }

}
