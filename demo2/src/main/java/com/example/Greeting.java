/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import lombok.Getter;

/**
 *
 * @author ffmas
 */
@Getter
public class Greeting {

    private final long id;
    private final String content; 

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
    
}
