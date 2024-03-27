/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author DELL
 */
public class Tables {
    public static void main(String[] args){
        try{
            Connection con= Connect.getCon();
            Statement st= con.createStatement();
//                  st.executeUpdate("Create Table user(user_pk int AUTO_INCREMENT primary key,userRole varchar(200),name varchar(100),dob varchar(50),mobileNumber varchar(30),email varchar(200),username varchar(200),password varchar(50),address varchar(200))");
//                  st.executeUpdate("INSERT INTO user (userRole,name,dob,mobileNumber,email,username,password,address) values('Admin','Admin','16-12-1990','9860117819','admin@email.com','admin','admin','Kathmandu')");
//                    st.executeUpdate("create table product(product_pk int AUTO_INCREMENT primary key,uniqueID varchar(200),name varchar(200),quantity bigint,price bigint,Manufacturing_date varchar(200),expiry_date varchar(200))");
st.executeUpdate("create table bill(bill_pk int AUTO_INCREMENT primary key, billId varchar(200),billDate varchar(51),totalPaid bigint)");
            JOptionPane.showMessageDialog(null, "Table Created Successfully");
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
    }    
}
