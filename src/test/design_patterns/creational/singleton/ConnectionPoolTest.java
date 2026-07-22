package design_patterns.creational.singleton;

import design_patterns.creational.singleton.ConnectionPool;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ConnectionPoolTest {

    @Test
    public void testConstructor(){
        ConnectionPool connectionPool =  ConnectionPool.getInstance();
        // If the constructor was called a non-null object should be created
        assertNotNull("If the constructor was called a non-null object should be created", connectionPool);
    }
    @Test
    public void testConstructor2(){
    ConnectionPool connectionPool1 =  ConnectionPool.getInstance();
    ConnectionPool connectionPool2 =  ConnectionPool.getInstance();
    assertEquals("There should be only one instance of the ConnectionPool class", connectionPool1, connectionPool2);
    }
}


