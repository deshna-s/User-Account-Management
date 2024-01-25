/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author deshna
 */
public class User {
    String neuid;
    String firstName;
    String lastName;
    String userName;
    String password;
    String emailID;
    boolean isAdmin;
    boolean isEnabled;
    ArrayList<String> previousPass;

    public ArrayList<String> getPreviousPass() {
        return previousPass;
    }

    public void setPreviousPass(ArrayList<String> previousPass) {
        this.previousPass = previousPass;
    }

    public boolean getIsIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getneuid() {
        return neuid;
    }

    public void setneuid(String neuid) {
        this.neuid = neuid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }
    
    @Override
    public String toString() {
        return neuid;
    }
}
