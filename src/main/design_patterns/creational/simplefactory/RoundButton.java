package design_patterns.creational.simplefactory;


import lombok.Getter;

//Step 2: Create Concrete product classes

@Getter
public class RoundButton extends Button {

    Double radius;

    public RoundButton(Double border , Double radius) {
        super(border);
        this.radius=radius;
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
