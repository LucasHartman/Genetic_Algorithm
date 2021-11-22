public class Main {

    public static void main(String[] args) {

        new Genetic(2000, 100, getTreasure());
    }

    private static List<Treasure> getTreasure() {
        /* Create a list of items */
        return List.of(new Treasure("Crown", 900, 66, 9), new Treasure("Ring", 300, 11, 4),
                new Treasure("Medallion", 500, 44, 7), new Treasure("Diamond", 800, 22, 2),
                new Treasure("Gold", 200, 66, 7), new Treasure("Silver", 700, 55, 3), new Treasure("Ebony", 500, 88, 8),
                new Treasure("Necklace", 800, 33, 5));
    }
}