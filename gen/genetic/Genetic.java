package gen.genetic;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import gen.treasure.Treasure;

public class Genetic {

    int limit;
    int rate;
    List<Treasure> treasure;

    public Genetic(int limit, int rate, List<Treasure> treasure) {

        this.limit = limit;
        this.rate = rate;
        this.treasure = treasure;


        // create empty list
        int[][] population = new int[rate][treasure.size()];

        for (int i = 0; i<9; i++) {
            Population pop = new Population(population);









            System.out.println(pop.getPopulation());
        }

       


        

    }
    
}
