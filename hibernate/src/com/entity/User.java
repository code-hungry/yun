package com.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private String id;
    private String name;
    private int age;
    private String sex;
    private String address;
}
