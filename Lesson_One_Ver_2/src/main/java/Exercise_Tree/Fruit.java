package Exercise_Tree;

public abstract class Fruit {

    private final float WEIGHT;
    private final String NAME;

    public Fruit(float WEIGHT, String NAME) {
        this.WEIGHT = WEIGHT;
        this.NAME = NAME;
    }

    public float getWeight() {
        return WEIGHT;
    }

    public String getName() {
        return NAME;
    }

}
