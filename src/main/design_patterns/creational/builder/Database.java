package design_patterns.creational.builder;

public class Database {

    private String name;
    private String userName;
    private String password;
    private DatabaseType type;
    private boolean isCompressed;
    private Integer port;

    private Database(){}
    //Trick 1 Builder nethod
    public static Builder builder(){
        return new Builder();
    }
    //STEP 1: Create a static inner class and make constructor private of outer class

    public static class Builder{
        //STEP 2 Copy all the fields from outer class to inner class

        private String name;
        private String userName;
        private String password;
        private DatabaseType type;
        private boolean isCompressed;
        private Integer port;

        //STEP 3 : Create setters for the fields in the inner class

        // Trick 2 : Return the inner class object from the setter method to enable chaining . This is called Fluent Interface
        public Builder name(String name) {
            this.name = name;
            return this;
        }

       /* public Builder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }*/

        //Instead of using set username and set password we can club them in one method like withCredentials to make it look fancy
        public Builder withCredentials(String userName, String password){
            this.userName=userName;
            this.password=password;
            return this;
        }
        public Builder setType(DatabaseType type) {
            this.type = type;
            return this;
        }
        // we can have methods for database types like below

        public Builder mysql(){
            this.type = DatabaseType.MYSQL;
            return this;
        }
        public Builder port(Integer port){
            this.port = port;
            return this;

        }
       /* public Builder setCompressed(boolean compressed) {
            isCompressed = compressed;
            return this;
        }*/

/* Instead of using set compressed we can just use compressed without any arguments so that anyone call this method
        will get compressed */
        public Builder compressed(){
            this.isCompressed = true;
            return this;
        }

        public Database build (){

            // Before even creating the database objet we can do some validation like name should not be null , username should not be null etc. If any of the validation fails we can throw an exception
            boolean isValid = validate();
            if (!isValid){
                throw new IllegalArgumentException("Wrong port!");
            }

            Database database = new Database();

            database.name = name;
            database.userName = userName;
            database.password = password;
            database.type = type;
            database.isCompressed = isCompressed;
            database.port=port;

            return database;

        }
        private boolean validate(){
            if (type==DatabaseType.MYSQL && port !=3306){
                return false;
            }
            return true;
        }
    }
}

