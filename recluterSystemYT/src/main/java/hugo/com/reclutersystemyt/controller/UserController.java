/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hugo.com.reclutersystemyt.controller;

import hugo.com.reclutersystemyt.model.UserModel;
import hugo.com.reclutersystemyt.services.UserService;
import java.sql.SQLException;

/**
 *
 * @author hugoroca
 */
public class UserController {
    private final UserService _userService;

    public UserController() {
        this._userService = new UserService();
    }
    
    public UserModel authentication(String user, String pass) throws SQLException {
        return _userService.authentication(user, pass);
    }
}
