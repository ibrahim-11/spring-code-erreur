package com.evaluation.symbol.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name="excuses")
public class Excuse {
    @Id
    private  Integer http_code;
    @Column(unique = false)
    private String tag;
    @Column(unique = false)
    private String message;



}
