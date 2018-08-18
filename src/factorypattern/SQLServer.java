package factorypattern;

public class SQLServer extends Connection {

    public SQLServer() {
    }
    
    @Override
    public String description() {
        return "SQLServer";
    }
}
