package codigo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Estudiante {
	private int id;
	private String nombre;
	private int edad;
	private double calificacion;

	public Estudiante(int id, String nombre, int edad, double calificacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.calificacion = calificacion;
	}

	public Estudiante(String nombre, int edad, double calificacion) {
		this.nombre = nombre;
		this.edad = edad;
		this.calificacion = calificacion;
	}

	public static class EstudianteDAO {
		private String jdbcURL = "jdbc:mysql://localhost:3306/universidad";
		// TODO encontrar credenciales de acceso
		private String jdbcUsername = "";
		private String jdbcPassword = "";

		private static final String INSERT_ESTUDIANTE_SQL = "INSERT INTO estudiantes (nombre, edad, calificacion) VALUES (?, ?, ?)";
		private static final String SELECT_ALL_ESTUDIANTES = "SELECT * FROM estudiantes";

		public EstudianteDAO() throws SQLException, ClassNotFoundException {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}

		protected Connection getConnection() throws SQLException {
			return DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		}

		public void insertEstudiante(Estudiante estudiante) throws SQLException {
			try (Connection connection = getConnection();
					PreparedStatement preparedStatement = connection.prepareStatement(INSERT_ESTUDIANTE_SQL)) {
				preparedStatement.setString(1, estudiante.getNombre());
				preparedStatement.setInt(2, estudiante.getEdad());
				preparedStatement.setDouble(3, estudiante.getCalificacion());
				preparedStatement.executeUpdate();
			}
		}

		public List<Estudiante> selectAllEstudiantes() throws SQLException {
			List<Estudiante> estudiantes = new ArrayList<>();
			try (Connection connection = getConnection();
					PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_ESTUDIANTES);
					ResultSet resultSet = preparedStatement.executeQuery()) {
				while (resultSet.next()) {
					int id = resultSet.getInt("id");
					String nombre = resultSet.getString("nombre");
					int edad = resultSet.getInt("edad");
					double calificacion = resultSet.getDouble("calificacion");
					estudiantes.add(new Estudiante(id, nombre, edad, calificacion));
				}
			}
			return estudiantes;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public int getEdad() {
		return edad;
	}

	public int getId() {
		return id;
	}
}
