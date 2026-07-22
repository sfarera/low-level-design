package design_patterns.behavioural.strategy;
//Step 3 : Adding a reference to context class
public class Navigator {

    private NavigationStrategy navigationStrategy;

    public Navigator(NavigationStrategy navigationStrategy){
        this.navigationStrategy = navigationStrategy;
    }
    // Pass-through to strategy
    public Double navigate(String from , String to){

        return navigationStrategy.navigate(from, to);

    }
}
