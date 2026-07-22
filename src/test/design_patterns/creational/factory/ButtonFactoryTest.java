package design_patterns.creational.factory;

import design_patterns.creational.factory.Button;
import design_patterns.creational.factory.RoundButtonFactory;
import org.junit.Assert;
import org.junit.Test;

public class ButtonFactoryTest {

    @Test
    public void testRoundButton(){
        // Conditional dependency injection -> @Qualifier
        design_patterns.creational.factory.ButtonFactory buttonFactory = new RoundButtonFactory() ;
        Button button=buttonFactory.createButton(10.5,5.0,2.0, design_patterns.creational.factory.ScreenSize.PHONE);

        Assert.assertTrue("If screen size is of phone, the button should " +
                "be a round button",button instanceof design_patterns.creational.factory.RoundButton);

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