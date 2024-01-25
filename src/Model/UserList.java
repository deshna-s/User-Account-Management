/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.security.MessageDigest;
import java.util.ArrayList;

/**
 *
 * @author deshna deshna
 */
public class UserList {
    private ArrayList<User> userList;

    public UserList(){
        this.userList = new ArrayList<>();
        //Admin
        User a = new User();
        a.neuid = null;
        a.firstName = "Deshna";
        a.lastName = "Shah";
        a.userName = "deshnaadmin";
        a.password = HashPassword("2613");
        a.emailID = "shah.des@northeastern.edu";
        a.isAdmin = true;
        a.isEnabled = true;
        this.userList.add(a);
        
        //Default User
        User u = new User();
        u.neuid = "002727578";
        u.firstName = "Noor";
        u.lastName = "Shah";
        u.userName = "NoorUser";
        u.password = HashPassword("4567");
        u.emailID = "shah.noor@northeastern.edu";
        u.isAdmin = false;
        u.isEnabled = true;
        this.userList.add(u);
    }
    
    public ArrayList<User> getUserList() {
        return userList;
    }
    
    public User getUserByUsernamePass(String username, String password){
            for (int i = 0; i < userList.size(); i++) {
            User user = userList.get(i);
            if (user.userName.equals(username) && user.password.equals(password)) {
                return user;
            }
        }
        return null;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }
    
    public User addNewUser(){
        User newPerson = new User();
        userList.add(newPerson);
        return newPerson;
    }
    
    public void  deleteUser(User u){
        userList.remove(u);
    }
    
    public void disableUser(String neuid){
        for (int i = 0; i < userList.size(); i++) {
            User user = userList.get(i);
            if (user.neuid != null && user.neuid.equals(neuid)) {
                user.setIsEnabled(false); // Disabling the user
                return; // Exit the loop once the update is done
            }
        }
    }
    
    public boolean updateUser(User u){
           for (int i = 0; i < userList.size(); i++) {
            User user = userList.get(i);
            if (user.neuid != null && user.neuid.equals(u.neuid)) {
                if(user.previousPass!= null && user.previousPass.contains(u.password)){
                    return false;
                }
                if(user.previousPass != null){
                    //Adding previous passwords
                    u.previousPass.addAll(user.previousPass);
                }
                
                if(!user.password.equals(u.password)){
                    u.previousPass.add(user.password);
                }
                
                userList.set(i, u);
                return true;
            }
        }
        return false;
    };
    
    public static String HashPassword(String password){
        try {
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(password.getBytes());
                byte[] rbt = md.digest();
                StringBuilder sb = new StringBuilder();
                for(byte b: rbt){
                    sb.append(String.format("%02x", b));
                }
                return sb.toString();
            } catch (Exception ex) {}
        return null;
    }
}
