package design_patterns.creational.abstractfactory;


// Step 3 : Factory Interface
public interface ThemeFactory {

    Button createButton(Double border, Double length, Double radius);
    Radio createRadio();
}
