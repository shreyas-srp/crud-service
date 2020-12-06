package com.example.hotel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "booking")
public class booking {

    @Id
    int id;
    String origin;
    String destination;

}
