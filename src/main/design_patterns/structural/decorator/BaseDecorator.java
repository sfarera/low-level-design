package design_patterns.structural.decorator;

import lombok.AllArgsConstructor;

//Step 3 : Base decorator. we need base decorator to bbe abstract. Because we need to add references as well. Also we do not want to implement the methods here.
@AllArgsConstructor
public abstract class BaseDecorator implements Datasource{

    protected Datasource nextLayer;
}
