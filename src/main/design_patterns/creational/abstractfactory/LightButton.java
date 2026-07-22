package design_patterns.creational.abstractfactory;


//Step 2: Create Concrete product classes


public class LightButton extends Button {

    Double length;

    public LightButton(Double length , Double border) {
        super(border);
        this.length = length;

    }

    @Override
    public void onClick(){
        System.out.println("Square button was clicked");
    }

    @Override
    public void render(){
        System.out.println("Rendered!");
    }
}
