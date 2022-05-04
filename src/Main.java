public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("молоко", 40);
        basket.add("шоколадка",20);
        basket.add( "картошка", 30,40);
        basket.print("Содержимое корзины");
        basket.clear();
        basket.print("Содержимое корзины");
        basket.print(totalPrice);

    }
}
