package exam1.exam6;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item[] items = {
                new Item("마늘", 2000, 2),
                new Item("상추", 3000, 4)
        };

        cart.addItem(items[0]);
        cart.addItem(items[1]);

        cart.displayItems();
    }
}
