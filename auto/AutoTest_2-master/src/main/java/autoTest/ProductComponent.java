package autoTest;

public class ProductComponent implements ContainerComponent {

    private String title;
    private int price;

    public ProductComponent(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int countPrice() {
        return price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void display() {
        System.out.println("Product: " + title + ", price: " + getPrice() + " rub.");
    }

}
