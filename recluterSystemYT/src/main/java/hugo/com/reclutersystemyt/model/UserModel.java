/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hugo.com.reclutersystemyt.model;

/**
 *
 * @author hugoroca
 */
public class UserModel {
    private int id;
    private String usernmane;
    private String password;
    private String nickName;
    private int idEmployee;

    public UserModel(int id, String usernmane, String password, String nickName, int idemployee) {
        this.id = id;
        this.usernmane = usernmane;
        this.password = password;
        this.nickName = nickName;
        this.idEmployee = idemployee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsernmane() {
        return usernmane;
    }

    public void setUsernmane(String usernmane) {
        this.usernmane = usernmane;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }
}
