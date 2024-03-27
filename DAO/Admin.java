/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import inventory.Dashboard;
import java.sql.*;


/**
 *
 * @author DELL
 */
public class Admin {

    private static Admin instance;

    private Admin() {
    }

    public static Admin getInstance() {
        if (instance == null) {
            instance = new Admin();
        }

        return instance;
    }

    public boolean getLogin(String username, String password) {
        boolean check = false;
        try {            
            String q="select username, password from `user` where `username`=?  and `password`=?"; // There was '' inside ?
            Connection con = Connect.getCon();
            PreparedStatement ps = con.prepareStatement(q);
            
            
            ps.setString(1,username);
            ps.setString(2, password);
            
            ResultSet rs =ps.executeQuery();
            
            if (rs.next()) { // it was while
            check = true;
            }
            
            return check;

        } catch (Exception e) {
            System.err.println(e.getMessage());
            return false;
        }
    }
}
