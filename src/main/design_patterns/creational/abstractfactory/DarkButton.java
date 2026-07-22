package design_patterns.creational.abstractfactory;


//Step 2: Create Concrete product classes


public class DarkButton extends Button {

    Double radius;

    public DarkButton(Double radius , Double border) {
        super(border);
        this.radius = radius;
    }

    @Override
    public void onClick(){
        System.out.println("Round button was clicked");
    }

    @Override
    public void render(){
        System.out.println("Rendered!");
    }
}