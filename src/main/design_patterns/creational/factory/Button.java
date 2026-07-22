package design_patterns.creational.factory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


//Step 1 : Create the common interface
@AllArgsConstructor
@NoArgsConstructor
@Getter
public abstract class Button {
    private Double border;

    public abstract void onClick();

    public abstract void render();

}
