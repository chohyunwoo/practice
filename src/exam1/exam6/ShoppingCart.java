package exam1.exam6;

public class ShoppingCart {

    private final Item[] items = new Item[10];
    private int itemCount = 0;

    public void addItem(Item item) {
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[itemCount++] = item;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");

        for (int i = 0; i < itemCount; i++) {
            printItem(items[i]);
        }

        System.out.println("전체 가격 합: " + calculateTotalPrice());
    }

    private void printItem(Item item) {
        System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
    }

    private int calculateTotalPrice() {
        int total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].getTotalPrice();
        }
        return total;
    }
}





/*
public class ShoppingCart {

    private Item[] items = new Item[10];
    private int itemCount;


    public void addItem(Item item1) {
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
        }else{
            items[itemCount] = item1;
            itemCount++;
        }
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명:" + item.getName() + ", 합계:" +
                    item.getTotalPrice());
        }
        System.out.println("전체 가격 합:" + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }


}

 */
