package panchi;

public class Bird {
    private String name;
    private Double weight;
    private BirdType type ;
    private Colour colour;
    private Size size;

    public void fly(){
        if (type==BirdType.PENGUIN){
            System.out.println("Penguins can't fly");
        } if (type==BirdType.DUCK) {
            System.out.println("Duck is flying");
        } if (type == BirdType.EAGLE){
            System.out.println("Eagle is flying");
        }
    }

    public void eat(){
        System.out.println("I am hungry, I wanna eat");
    }

    public void sleep(){
        System.out.println("I am sleepy, I wanna sleep");
    }
}
