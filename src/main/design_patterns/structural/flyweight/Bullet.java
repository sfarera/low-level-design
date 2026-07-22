package design_patterns.structural.flyweight;

import lombok.AllArgsConstructor;
import lombok.Getter;

//Step 1 Intrinsic state
@AllArgsConstructor
@Getter
public class Bullet {
    private Double radius;
    private Double weight;
    BulletType  type;
    private String image;

}
