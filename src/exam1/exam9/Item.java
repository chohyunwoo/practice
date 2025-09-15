package exam1.exam9;

public class Item {
    String name;
    int price;

    Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    public void print() {
        System.out.println(
                "이름:"+name + "가격:" + price
        );
    }
}
