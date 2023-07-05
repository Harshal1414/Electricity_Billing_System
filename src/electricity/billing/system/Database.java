package electricity.billing.system;

import java.sql.*;

public class Database {
    Connection connection;
    Statement statement;
    Database() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bill_system", "root", "1234");
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
