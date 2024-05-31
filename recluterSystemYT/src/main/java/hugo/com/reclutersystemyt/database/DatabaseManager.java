/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hugo.com.reclutersystemyt.database;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hugoroca
 */
public class DatabaseManager {

    private Dotenv env;

    public DatabaseManager() {
        this.env = Dotenv.load();
    }

    public Connection createConnect() throws SQLException {
        String url = "jdbc:postgresql://" + env.get("DB_HOST") + ":" + env.get("DB_PORT") + "/" + env.get("DB_NAME");
        String user = env.get("DB_USERNAME");
        String pass = env.get("DB_PASSWORD");

        return DriverManager.getConnection(url, user, pass);
    }

    public void closeConnect(Connection conn) throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }
}
