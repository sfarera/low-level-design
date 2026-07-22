package design_patterns.creational.factory;


import lombok.Getter;
import lombok.Setter;

//Step 2: Create Concrete product classes

@Getter
@Setter
public class RoundButton extends Button {

    Double radius;

    public RoundButton(Double radius , Double border) {
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