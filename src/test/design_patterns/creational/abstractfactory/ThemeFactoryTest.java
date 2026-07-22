package design_patterns.creational.abstractfactory;

import design_patterns.creational.abstractfactory.*;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ThemeFactoryTest {

    @Test
    public void testDarkTheme(){

        ThemeFactory darkThemeFactory = new DarkThemeFactory();
        Button button = darkThemeFactory.createButton(0.5,10.0,null);
       assertTrue("if using a dark theme the button should be dark button",button instanceof DarkButton);

        Radio radio = darkThemeFactory.createRadio();
        assertTrue("if using a dark theme the radio should be dark radio",radio instanceof DarkRadio);


    }
}
