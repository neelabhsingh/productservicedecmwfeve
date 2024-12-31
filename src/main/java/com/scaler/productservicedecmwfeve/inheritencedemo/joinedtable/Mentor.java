package com.scaler.productservicedecmwfeve.inheritencedemo.joinedtable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="jt_mentor")
@PrimaryKeyJoinColumn(name = "user_id")
public class Mentor extends User{
//    @Id
//    private long id;
    private double averageRating;
}

