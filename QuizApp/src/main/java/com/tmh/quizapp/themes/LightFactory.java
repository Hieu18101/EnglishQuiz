/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tmh.quizapp.themes;

import com.tmh.quizapp.App;

/**
 *
 * @author minhh
 */
public class LightFactory  extends ThemeAbstractFactory{

    @Override
    public String getStyleSheet() {
        return App.class.getResource("Light.css").toExternalForm();
    }
    
}
