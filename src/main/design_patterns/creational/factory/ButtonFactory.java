package design_patterns.creational.factory;

public interface ButtonFactory {
// Step 3 : Factory Method
    Button createButton(Double length, Double radius, Double border, ScreenSize screenSize);
    }

