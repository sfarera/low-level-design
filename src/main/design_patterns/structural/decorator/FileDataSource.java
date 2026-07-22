package design_patterns.structural.decorator;

import javax.sql.DataSource;
import java.sql.SQLOutput;

//Step 2: Create Product class.
public class FileDataSource implements Datasource {
    @Override
    public String read() {
        return "Base";
    }

    @Override
    public void write(String data) {
        System.out.println(data);
    }
}
