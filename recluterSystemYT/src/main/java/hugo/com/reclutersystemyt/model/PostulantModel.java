/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hugo.com.reclutersystemyt.model;

import java.sql.Date;

/**
 *
 * @author hugoroca
 */
public class PostulantModel {
    int id;
    String documentNumber;
    String documenType;
    String name;
    String lastname;
    String phone;
    String email;
    String address;
    String gender;
    Date dateBirth;
    String cvFile;
    boolean isHired;

    public PostulantModel(int id, String documentNumber, String documenType, String name, String lastname, String phone, String email, String address, String gender, Date dateBirth, String cvFile, boolean isHired) {
        this.id = id;
        this.documentNumber = documentNumber;
        this.documenType = documenType;
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.gender = gender;
        this.dateBirth = dateBirth;
        this.cvFile = cvFile;
        this.isHired = isHired;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getDocumenType() {
        return documenType;
    }

    public void setDocumenType(String documenType) {
        this.documenType = documenType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getCvFile() {
        return cvFile;
    }

    public void setCvFile(String cvFile) {
        this.cvFile = cvFile;
    }

    public boolean isIsHired() {
        return isHired;
    }

    public void setIsHired(boolean isHired) {
        this.isHired = isHired;
    }
}
