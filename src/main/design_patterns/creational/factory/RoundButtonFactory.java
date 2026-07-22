package design_patterns.creational.factory;

public class RoundButtonFactory implements ButtonFactory{
    @Override
    public Button createButton(Double length, Double radius, Double border, ScreenSize screenSize) {
         return new RoundButton(radius,border); //we can use builder pattern to solve this parameter explosion
    }
}
