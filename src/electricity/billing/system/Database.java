package electricity.billing.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database {
    Connection connection;
    Statement statement;
    Database(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bill_System", "root", "1234");
            statement = connection.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
