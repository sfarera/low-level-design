package design_patterns.behavioural.strategy;

import org.junit.Test;

public class NavigatorTest {

    @Test
    public void testBullet(){
  TwoWheelerStrategy strategy = new TwoWheelerStrategy();
  Navigator navigator = new Navigator(strategy); // dependency injection
        System.out.println(navigator.navigate("Pashan","Hinjewadi"));
    }
}
