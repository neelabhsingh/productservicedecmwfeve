package com.scaler.productservicedecmwfeve.inheritencedemo.joinedtable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.PutMapping;

@Getter
@Setter
@Entity(name="jt_instructor")
@PrimaryKeyJoinColumn(name = "user_id")
public class Instructor extends User{
    private String favouriteStudent;
}
