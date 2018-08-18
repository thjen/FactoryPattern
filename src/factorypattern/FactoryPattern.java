package factorypattern;

import factorypattern.FirstFactory;

public class FactoryPattern {

    public static void main(String[] args) {
        FirstFactory factory = new FirstFactory("Oracle");
        
        Connection connection = factory.createConnection();
        
        System.out.println("You're connecting with " + connection.description());
    }
}
