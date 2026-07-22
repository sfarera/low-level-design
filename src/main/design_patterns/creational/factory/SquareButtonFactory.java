package design_patterns.creational.factory;

public class SquareButtonFactory implements ButtonFactory{
    @Override
    public Button createButton(Double length, Double radius, Double border, ScreenSize screenSize) {
        return new SquareButton(length,border); //we can use builder pattern to solve this parameter explosion
    }
}
