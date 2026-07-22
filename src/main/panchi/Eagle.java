package panchi;

public class Eagle extends BirdV2 {

    public Eagle(String name, Double weight, BirdType type, Colour colour, Size size) {
        super(name, weight,type , colour, size);
    }
     public void fly(){
         System.out.println("Eagle is flying");
     }


}
