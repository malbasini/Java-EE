package it.corso.java.database;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Clienti {

    private Connection connection;
    public static void main(String[] args) {
        try
        {
            Clienti clienti = new Clienti();
            clienti.Insert("Marco","Albasini","malbasini@gmail.com","999999999");
            clienti.Insert("Mario","Rossi","mario.rossi@gmail.com","2222222222");
            clienti.Insert("Luca","Verdi","luca.verdi@gmail.com","1223445678");
            clienti.Update("12345678",1);
            clienti.Select("Rossi");
            clienti.Delete(3);
        }
        catch(SQLException e){
            String s = e.getMessage();
            System.out.println(s);
        }

    }

    private void Insert(String nome, String cognome, String email, String telefono) throws SQLException {
		String sql = "INSERT INTO clienti(nome, cognome, email, telefono) "+
					 "VALUES('"+nome+"', '"+cognome+"', '"+email+"', '"+telefono+"')";
        PreparedStatement ps = getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        rs.next();
        System.out.println("l'id generato è: " + rs.getInt(1));
    }
    private void Select(String cognome) throws SQLException {
        String sql = "SELECT * FROM clienti WHERE cognome = ?";
        PreparedStatement ps = getConnection().prepareStatement(sql);
        ps.setString(1, cognome);
        ResultSet rs = ps.executeQuery();

        while(rs.next()) {
            System.out.println("id = " + rs.getInt(1));
            System.out.println("nome = " + rs.getString(2));
            System.out.println("cognome = " + rs.getString(3));
            System.out.println("email = " + rs.getString(4));
            System.out.println("telefono = " + rs.getString(5));
            System.out.println("------------------------------------------------");
        }
    }
    private void Delete(int id) throws SQLException {
        String sql = "DELETE FROM clienti WHERE id = ?";
        PreparedStatement ps = getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, id);
        ps.executeUpdate();
        connection.close();
    }

    private void Update(String telefono, int id) throws SQLException {
        String sql = "UPDATE clienti SET telefono = ? WHERE id = ?";
        PreparedStatement ps = getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, telefono);
        ps.setInt(2, id);
        ps.executeUpdate();
    }
    private Connection getConnection() throws SQLException {
        if(connection == null) {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setServerName("127.0.0.1");
            dataSource.setPortNumber(3307);
            dataSource.setUser("root");//root
            dataSource.setPassword("**************");//pwd di MySQL
            dataSource.setDatabaseName("CorsoJava");
            connection = dataSource.getConnection();
        }
        return connection;
    }
}
