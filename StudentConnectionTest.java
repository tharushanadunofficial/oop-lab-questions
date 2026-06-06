/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Amarajeewa M.K.T.N
 */
import java.sql.Connection;
import java.sql.SQLException;

public class StudentConnectionTest {

    public static void main(String[] args) {

        try {
            Connection connection =
                    StudentDatabaseConnection.getConnection();

            System.out.println("Database connected successfully.");

            connection.close();

        } catch (SQLException e) {
            System.out.println("Database connection error.");
        }
    }
}