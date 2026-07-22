package design_patterns.behavioural.strategy;
//Step 2: Concrete strategy
public class FourWheelerStrategy implements NavigationStrategy{

    @Override
    public Double navigate(String from, String to) {
        return 0.0;
    }
}
