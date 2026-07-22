package polymorphism;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student extends User {

    private String batchName;
    private double psp;
}
