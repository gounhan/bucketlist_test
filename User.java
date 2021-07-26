package com.IT.bucketlist;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String user_id;
    private String birth_year;
    private String city;
    private String country;
    private String gender;
    private String nickname;
    private String password;
}
