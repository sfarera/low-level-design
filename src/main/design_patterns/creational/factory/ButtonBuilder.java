package design_patterns.creational.factory;

import lombok.Getter;

@Getter
public class ButtonBuilder {

    Double radius;
    Double length;
    Double border;

    public ButtonBuilder radius(Double radius){
        this.radius=radius;
        return this;
    }
    public ButtonBuilder length(Double length){
        this.length=length;
        return this;
    }
    public ButtonBuilder border(Double border){
        this.border=border;
        return this;
    }
}
