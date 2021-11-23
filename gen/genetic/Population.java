package gen.genetic;

import java.util.function.Function;

public class Population {

    int[][] population;

    public Population(int[][] population) {
        this.population = population;
    }


    protected int[][] Population () {
        return newPopulation.apply(population);
    }

    Function<int[][], int[][]> newPopulation = (p) -> {
        // create a brand new population


		return p;
    };

    Function<int[][], int[][]> editPopulation = (p) -> {
        // edit population


		return p;
    };
}
