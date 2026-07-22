package design_patterns.structural.flyweight;

import org.junit.Test;

public class FlyWeightTest {

    @Test
    public void testFlyWeight(){

        Bullet bullet1 = new Bullet(0.9,10.0,BulletType.NINE_MM,"IMG1");
        Bullet bullet2 = new Bullet(1.1,20.0,BulletType.ELEVEN_MM,"IMG2");

        BulletRegistry registry = new BulletRegistry();
        registry.addBullet(bullet1);
        registry.addBullet(bullet2);
        FlyingBullet flyingBullet1 = new FlyingBullet(0.0,0.0,0.0,90.0,registry.getBullet(BulletType.NINE_MM));
        FlyingBullet flyingBullet2 = new FlyingBullet(0.0,2.0,3.0,180.0,registry.getBullet(BulletType.ELEVEN_MM));

    }
}
