/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tmh.sevices;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author admin
 */
public class Category {

    public List<Category> getCates() throws SQLException {
        //B3 -> Thuc thi truy van
        String sql = "Select * From category";
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        
        List<Category> cates= new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");

            cates.add(new Category(id, name));
            
            return cates;
        }
    }
