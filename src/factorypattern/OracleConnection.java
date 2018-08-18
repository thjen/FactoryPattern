package factorypattern;

public class OracleConnection extends Connection {

    public OracleConnection() {
    }
    
    @Override
    public String description() {
        return "Oracle";
    }
}
