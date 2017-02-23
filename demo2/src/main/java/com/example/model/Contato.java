/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ffmas
 */
@Getter
@Setter
public class Contato {
    private String name;
    private String endereco;
    private String telefone;
    private Date date;
}
