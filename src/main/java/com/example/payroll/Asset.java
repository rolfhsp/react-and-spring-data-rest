package com.example.payroll;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Asset {
    private @Id @GeneratedValue Long id;
    private String type;
    private String name;

    private Asset() {}

    public Asset(String type, String name) {
        this.type = type;
        this.name = name;
    }
}
