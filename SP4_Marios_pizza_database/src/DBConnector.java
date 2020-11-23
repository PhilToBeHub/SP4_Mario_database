import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.*;

// https://mkyong.com/jdbc/jdbc-statement-example-select-list-of-the-records/
public class DBConnector {
    private Connection conn;

    public DBConnector(){

        getConection();
    }

    private void getConection(){
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/marios_pizzaria?serverTimezone=UTC", "root", "Humleridderen12");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public ArrayList<Pizza> getPizzas(){
        ArrayList<Pizza> pizzas = new ArrayList();
        try {
            String sql = "SELECT * FROM pizza";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            // .next() returns true if there are more results, and false if there are no more results.
            while (resultSet.next()){
                int id = resultSet.getInt("pid");
                String name = resultSet.getString("navn");
                int price = resultSet.getInt("pris");
                Pizza pizza = new Pizza(name, price, id);
                pizzas.add(pizza);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return pizzas;
    }

}
