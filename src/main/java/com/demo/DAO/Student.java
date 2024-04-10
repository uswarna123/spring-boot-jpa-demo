package com.demo.DAO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@EqualsAndHashCode
@Table(name = "student")
public class Student {
    @Id
    private Long id;
    @Column
    private String FirstName;
    @Column
    private String LastName;

}

