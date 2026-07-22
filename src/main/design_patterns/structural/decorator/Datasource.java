package design_patterns.structural.decorator;
//Step 1 : Crate a product interface.
public interface Datasource {
    String read();
    void write(String data);
}
