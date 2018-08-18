package factorypattern;

public class MySqlConnect extends Connection {

    public MySqlConnect() {
    } 
    
    @Override
    public String description() {
        return "MySql";
    }
}
