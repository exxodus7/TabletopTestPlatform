/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.schroetech.game;

/**
 *
 * @author lauren
 */
public abstract class AbstractPlayer implements IPlayer {

    private String name = "";
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String newName) {
        name = newName;
    }
}
