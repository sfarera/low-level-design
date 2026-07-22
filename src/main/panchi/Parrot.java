package panchi;

public class Parrot extends BirdV2 {

    public Parrot(String name, Double weight, BirdType type, Colour colour, Size size) {
        super(name, weight,type , colour, size);
    }

     public void fly(){
         System.out.println("Parrot is flying");
     }
}
