package design_patterns.creational.simplefactory;

import lombok.AllArgsConstructor;
import lombok.Getter;


//Step 1 : Create the common interface
@AllArgsConstructor
@Getter
public abstract class Button {
    private Double border;

    public abstract void onClick();

    public abstract void render();

}
