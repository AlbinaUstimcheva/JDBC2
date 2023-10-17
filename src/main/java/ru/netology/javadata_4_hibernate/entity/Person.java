package ru.netology.javadata_4_hibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "persons")
@IdClass(PersonId.class)
@Entity
public class Person {
    @Id
    private String name;
    @Id
    private String surname;
    @Id
    private int age;
    private int phone_number;
    @Column(name = "city_of_living")
    private String city;
}
