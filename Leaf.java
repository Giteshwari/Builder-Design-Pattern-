package CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

interface Component
{
    public void showPrice();
}

class Leaf implements Component
{
    int price;
    String name;

    public Leaf(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public void showPrice() {
        System.out.println("Name::" + name + " Price::" + price);
    }
}

class Composite implements Component
{
    String name;
    List<Component> components= new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void addComponent(Component comp)
    {
        components.add(comp);
    }

    @Override
    public void showPrice() {
        System.out.println("Name::" + name );
        for (Component c : components) {
            c.showPrice();  //for leaf directly print price but for composite it will traverse like composite, composite and leaf
        }
    }
}
