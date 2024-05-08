package ie.atu.limerickservice;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        // MySQL database connection details
        String url = "jdbc:mysql://localhost:3306/limerick_service";
        String username = "root";
        String password = "password";

        String selectSQL = "SELECT station_name FROM stations";

        try (Connection connection = DriverManager.getConnection(station_name);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(selectSQL)) {

            while (resultSet.next()) {
                String user = resultSet.getString("station_name");
                System.out.println("Station name: " + station_name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
