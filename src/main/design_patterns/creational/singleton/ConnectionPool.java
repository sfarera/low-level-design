package design_patterns.creational.singleton;

public class ConnectionPool {

    //Step 3  Create a global static attribute
    public static ConnectionPool INSTANCE = null;
    //Step 1 : Constructor hiding

    private ConnectionPool(){}
// Step 2 A global access point
    public static ConnectionPool getInstance(){
        //Step 4: if instance is not null returm
        // Else create , store and return

        if (INSTANCE==null){
            INSTANCE = new ConnectionPool();
        }
        /*if (INSTANCE==null){  // this is double check locking
             synchronized (ConnectionPool.class){
                 if (INSTANCE==null){
                     INSTANCE=new ConnectionPool();
                 }
             }

            }*/


return INSTANCE;

    }



}
