package panchi;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class  BirdV2 {
        private String name;
        private Double weight;
        private BirdType type ;
        private Colour colour;
        private Size size;


    public abstract void fly();

        public void eat(){
            System.out.println("I am hungry, I wanna eat");
        }

        public void sleep(){
            System.out.println("I am sleepy, I wanna sleep");
        }
}
