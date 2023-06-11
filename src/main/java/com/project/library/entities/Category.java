package com.project.library.entities;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CATEGORY")
@Data
public class Category {

    @Id
    @Column(name = "CODE")
    private String code;

    @Column(name = "LABEL", nullable = false)
    private String label;
}
