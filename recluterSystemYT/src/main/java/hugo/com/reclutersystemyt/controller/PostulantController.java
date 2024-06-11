/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hugo.com.reclutersystemyt.controller;

import hugo.com.reclutersystemyt.model.PostulantModel;
import hugo.com.reclutersystemyt.services.PostulantService;
import java.sql.SQLException;

/**
 *
 * @author hugoroca
 */
public class PostulantController {

    private final PostulantService _postulantService;

    public PostulantController() {
        this._postulantService = new PostulantService();
    }

    public void insertPostulant(PostulantModel model) throws SQLException {
        _postulantService.insertPostulant(model);
    }
}
