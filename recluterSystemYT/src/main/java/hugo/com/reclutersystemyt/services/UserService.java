/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hugo.com.reclutersystemyt.services;

import hugo.com.reclutersystemyt.database.DatabaseManager;
import hugo.com.reclutersystemyt.model.UserModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author hugoroca
 */
public class UserService extends DatabaseManager {

    public UserModel authentication(String user, String pass) throws SQLException {
        Connection conn = createConnect();
        
        String sql = "select id, username, password, nickname, gender from users where username = ? and password = crypt(?, password)";
        
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, user);
            pstmt.setString(2, pass);
            
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                return new UserModel(rs.getInt("id"), rs.getString("username"), "", rs.getString("nickname"), rs.getString("gender"));
            }
        } finally {
            closeConnect(conn);
        }
        
        return null;
    }
}
