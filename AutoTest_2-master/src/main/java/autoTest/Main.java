package autoTest;

public class Main {

    public static void main(String args[]) {

        ProductComponent product1 = new ProductComponent("Bread", 777);
        ProductComponent product2 = new ProductComponent("Milk", 222);
        Container container1 = new Container("Purchase1");
        container1.addComponent(product1);
        container1.addComponent(product2);
        container1.display();
        container1.countPrice();
        System.out.println("Sum " + container1.getTitle() + ": " + container1.countPrice() + " rub.");
        System.out.println("------------------------");

        ProductComponent product3 = new ProductComponent("Cheese", 111);
        Container container2 = new Container("Purchase2");
        container2.addComponent(product3);
        container1.addComponent(container2);
        container1.display();
        container1.countPrice();
        System.out.println("Sum " + container1.getTitle() + ": " + container1.countPrice() + " rub.");
        System.out.println("------------------------");

        container1.removeComponent(product2);
        container1.display();
        System.out.println("Sum " + container1.getTitle() + ": " + container1.countPrice() + " rub.");
    }
}
