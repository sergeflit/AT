package autoTest;

import java.util.ArrayList;
import java.util.List;

public class Container implements ContainerComponent {

    private final String title;

    private final List<ContainerComponent> childrenComponents;

    public Container(String title) {
        this.title = title;
        this.childrenComponents = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void addComponent(ContainerComponent packageComponent) {
        childrenComponents.add(packageComponent);
    }

    public void removeComponent(ContainerComponent packageComponent) {
        childrenComponents.remove(packageComponent);
    }

    @Override
    public int countPrice() {
        return childrenComponents.stream()
                .map(ContainerComponent::countPrice)
                .mapToInt(Integer::intValue).sum();
    }

    @Override
    public void display() {
        System.out.println("Set: " + title);
        for (ContainerComponent task : childrenComponents) {
            task.display();
        }
    }
}
