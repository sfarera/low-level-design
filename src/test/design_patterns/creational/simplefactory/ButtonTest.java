package design_patterns.creational.simplefactory;

import design_patterns.creational.simplefactory.*;
import org.junit.Assert;
import org.junit.Test;

public class ButtonTest {

    @Test
    public void testRoundButton(){
// Below we are creating these objects with constructors. The problem with them is tight coupling, no backward compatibilty, not maintainable.
        Button button  = ButtonFactory.createButton
                (ScreenSize.PHONE,10.0,10.0,null);

        Assert.assertTrue("If screen size is of phone, the button should " +
                "be a round button",button instanceof RoundButton);
    }

    @Test
    public void testSquareButton(){
// Below we are creating these objects with constructors. The problem with them is tight coupling, no backward compatibilty, not maintainable.
        Button  button  = ButtonFactory.createButton
                (ScreenSize.DESKTOP,10.0,10.0,null);

        Assert.assertTrue("If screen size is of phone, the button should " +
                "be a square button",button instanceof SquareButton);
    }
}

/* WHY the factory pattern is needed
1) SRP and OCP should not violate ==> Done
2) Complex construction logic should not be there ==> Done
3) Reduce usage of subclasses ==> Done
*/

/* Downsides of this factory pattern
* 1) Parameter explosion : different products will need different parameters : Assignment : Use builder pattern to not have parameter explosion
* 2) SRP and OCP violation :Consumers will be happy but in the Factory code
* we are still breaking SRP and OCP.
*
* */