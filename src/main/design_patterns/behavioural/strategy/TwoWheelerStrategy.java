package design_patterns.behavioural.strategy;
//Step 2: Concrete strategy
public class TwoWheelerStrategy  implements NavigationStrategy{

    @Override
    public Double navigate(String from, String to) {
        // GeoCode the location
        //Distance between the location
        // distance / speed
        return 0.0;
    }
}
