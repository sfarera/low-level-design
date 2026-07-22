package design_questions.tictactoe.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

//Intrinsic state - which will not change
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private String email;
    private String photo;
}
