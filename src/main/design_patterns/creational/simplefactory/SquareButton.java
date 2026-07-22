package design_patterns.creational.simplefactory;


import lombok.Getter;

//Step 2: Create Concrete product classes

@Getter
public class SquareButton extends Button {

    Double length;

    public SquareButton(Double border, Double length) {
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
