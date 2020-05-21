package com.fzzf.demo.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private String userName;

    private String passWord;

}
