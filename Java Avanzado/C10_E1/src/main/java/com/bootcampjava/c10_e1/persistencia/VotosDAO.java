package com.bootcampjava.c10_e1.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jerem
 */
public class VotosDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/votos";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    public static void votar(String partido) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "INSERT INTO votos (partido) VALUES (?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, partido);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
        }
    }

    public static ResultSet obtenerResultados() {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "SELECT partido, COUNT(*) as cantidad_votos FROM votos GROUP BY partido";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                return statement.executeQuery();
            }
        } catch (SQLException e) {
            return null;
        }
    }
}

