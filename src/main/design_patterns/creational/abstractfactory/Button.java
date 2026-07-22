package design_patterns.creational.abstractfactory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


//Step 1 : Create the common interface
@AllArgsConstructor
@NoArgsConstructor
public abstract class Button {
     Double border;

    public abstract void onClick();

    public abstract void render();

}
