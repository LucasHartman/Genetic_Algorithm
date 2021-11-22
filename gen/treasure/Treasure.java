package gen.treasure;

public class Treasure {

    private final String name;
    private final int value;
    private final int size;
    private final int weight;

    public Treasure(String name, int value, int size, int weight) {
        this.name = name;
        this.value = value;
        this.size = size;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Treasure{" + "name= " + name + '\'' + ", value= " + value + ", size= " + size + ", weight= " + weight
                + '}';
    }
    
}
