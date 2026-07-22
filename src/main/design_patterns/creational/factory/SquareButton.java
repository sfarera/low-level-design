package design_patterns.creational.factory;


import lombok.Getter;
import lombok.Setter;

//Step 2: Create Concrete product classes

@Getter
@Setter
public class SquareButton extends Button {

    Double length;

    public SquareButton(Double length , Double border) {
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
