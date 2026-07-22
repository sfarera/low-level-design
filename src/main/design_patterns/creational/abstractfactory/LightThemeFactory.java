package design_patterns.creational.abstractfactory;

//Step 4 : concrete factory for factory classes. Slightly dance on the lines of SRP (multiple responsibilities) but for the sake of this example, we will keep it simple and not create a separate factory for each concrete product class.
public class LightThemeFactory implements ThemeFactory{
    @Override
    public Button createButton(Double border, Double length, Double radius) {
        return new LightButton(border,length);
    }

    @Override
    public Radio createRadio() {
        return new LightRadio();
    }
}
