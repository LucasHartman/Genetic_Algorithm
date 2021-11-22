package gen.genetic;

import java.util.List;

public class Population {

    List<Integer> population;

    public Population(List<Integer> population) {
        this.population = population;
    }


    protected List<Integer> getPopulation (List<Integer> population) {
        return population;
    }
}
