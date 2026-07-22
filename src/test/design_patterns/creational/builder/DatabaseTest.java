package design_patterns.creational.builder;

import design_patterns.creational.builder.Database;
import org.junit.Test;

public class DatabaseTest {

    @Test
    public void testDatabaseBuilder() {
        Database database = Database.builder() // sccessing inner class
      /*  builder.setName("rescaler");
        builder.setUserName("groot");
        builder.setPassword("pass");
*/ //We see a lot of repetion here .we can use Fluent interface to chain the methods and reduce the repetion
       /* builder
                .setName("rescaler")
                .setUserName("groot")
                .setPassword("pass")
                .setType(DatabaseType.MYSQL)
                .setCompressed(true);*/ // Instead of using set username we can something like below
        // name , withredentials , compressed , mysql , these are the things that make look the code very fanccy
        // neat and clean. This is called Fluent Interface


                .name("rescaler")
                .mysql()
                .port(8001)
                .withCredentials("groot","pass")
                .compressed()
                .build();

// you cannot call database.setName("rescaler") because the constructor is private and the setter methods are also private. So you can only use the builder to create the object.
        // Database is immutable and Builder is mutable. So you can change the builder object but you cannot change the database object once it is created.


    }
}
