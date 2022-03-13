package com.bus.entity;

import lombok.Data;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "admin")
@Repository
public class Admin {

    @Id
    private Integer adminId;
    private String adminName;
    private String adminPassword;
}
