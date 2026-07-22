package design_patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BulletRegistry {

    private Map<BulletType,Bullet> bulletRegistry = new HashMap<>();
    public Bullet getBullet(BulletType type){
      return bulletRegistry.get(type);
    }
    public void addBullet(Bullet bullet){
        bulletRegistry.put(bullet.getType(),bullet);
    }
}
