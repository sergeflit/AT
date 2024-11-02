package autoTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainerTest {

    @Test
    void correctNewProductData() {
        ProductComponent product1 = new ProductComponent("Bread", 111);
        Assertions.assertEquals(product1.getPrice(), 111);
        Assertions.assertEquals("Bread", product1.getTitle());
    }

    @Test
    void correctAmountOfProductsInTheContainerWhenAddingAProduct() {
        ProductComponent product1 = new ProductComponent("Bread", 111);
        Container container1 = new Container("Container1");
        container1.addComponent(product1);
        Assertions.assertEquals(111, container1.countPrice());
    }

    @Test
    void correctAmountOfProductsInAContainerWhenAddingAnotherContainer() {
        ProductComponent product1 = new ProductComponent("Bread", 111);
        Container container1 = new Container("Container1");
        Container container2 = new Container("Container2");
        container2.addComponent(product1);
        container1.addComponent(container2);
        Assertions.assertEquals(111, container1.countPrice());
    }

    @Test
    void correctAmountOfProductsInTheContainerWhenRemovingAProduct() {
        ProductComponent product1 = new ProductComponent("Bread", 111);
        Container container1 = new Container("Container1");
        container1.addComponent(product1);
        container1.removeComponent(product1);
        Assertions.assertEquals(0, container1.countPrice());
    }

    @Test
    void theSumOfProductsWhenRemovingAContainerWithProductsFromAnotherContainerIsZero() {
        ProductComponent product1 = new ProductComponent("Bread", 111);
        Container container1 = new Container("Container1");
        Container container2 = new Container("Container2");
        container2.addComponent(product1);
        container1.addComponent(container2);
        container1.removeComponent(container2);
        Assertions.assertEquals(0, container1.countPrice());
    }
}
