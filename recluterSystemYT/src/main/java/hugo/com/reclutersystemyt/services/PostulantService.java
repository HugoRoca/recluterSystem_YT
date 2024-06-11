/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hugo.com.reclutersystemyt.services;

import hugo.com.reclutersystemyt.database.DatabaseManager;
import hugo.com.reclutersystemyt.model.PostulantModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author hugoroca
 */
public class PostulantService extends DatabaseManager{
    public void insertPostulant(PostulantModel model) throws SQLException {
        Connection conn = createConnect();
        
        String sql = "insert into postulants (documentNumber, documenType, name, lastname, phone, email, address, gender, dateBirth, cvFile, isHired) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, model.getDocumentNumber());
            pstmt.setString(2, model.getDocumenType());
            pstmt.setString(3, model.getName());
            pstmt.setString(4, model.getLastname());
            pstmt.setString(5, model.getPhone());
            pstmt.setString(6, model.getEmail());
            pstmt.setString(7, model.getAddress());
            pstmt.setString(8, model.getGender());
            pstmt.setDate(9, new java.sql.Date(model.getDateBirth().getTime()));
            pstmt.setString(10, model.getCvFile());
            pstmt.setBoolean(11, model.isIsHired());
            
            pstmt.executeUpdate();
        } finally {
            closeConnect(conn);
        }
    }
}
