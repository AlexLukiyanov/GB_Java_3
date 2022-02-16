package Exercise_Tree;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private final ArrayList<T> box;

    public Box() {
        box = new ArrayList<T>();
    }

    public void addFruit(T fruit) {
        box.add(fruit);
    }

    public double getWeight() {
        return box.stream().mapToDouble(Fruit -> Fruit.getWeight()).sum();
    }

    public boolean compare(Box<? extends Fruit> boxOther) {
        return getWeight() == boxOther.getWeight();
    }

    public void addingBox(Box<T> boxOther) {
        if (box.getClass().getName().equals(boxOther.getClass().getName())) {
            for (int i = 0; i <= box.size(); i++) {
                box.addAll(boxOther.box);
                boxOther.box.clear();
            }
        }
    }

    public void addingOneBox(Box<T> fruit) {
        for (T h : fruit.box) {
            addFruit(h);
        }
    }

    public static void main(String[] args) {
        final Box<Fruit> fruitBox = new Box();
        fruitBox.addFruit(new Apple());
        fruitBox.addFruit(new Orange());
        fruitBox.getWeight();
    }
}
