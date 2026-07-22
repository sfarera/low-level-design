package design_patterns.creational.simplefactory;

public class ButtonFactory {
/* Most of the times this ButtonFactory class is created by the third party
* you will use these libraries as a consumer to create the objects. Just like we did in the
* Test class */
    public static Button createButton(ScreenSize screenSize,Double border ,Double radius, Double length){

        switch (screenSize){
            case PHONE:
            case TABLET: return new RoundButton(border,radius);
            case DESKTOP:return new SquareButton(border, length);
            // DO not add default condition in the switch case condition, because if we add another type
            // in the enum it will falsely match it with the default condition. So Always add the default
            //  condition outside the switch case just like here.
        }
        throw new IllegalArgumentException("Invalid type:" +screenSize);
    }
}
