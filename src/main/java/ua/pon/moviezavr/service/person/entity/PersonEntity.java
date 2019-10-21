package ua.pon.moviezavr.service.person.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "PERSON", schema = "moviezavr")
@Data
public class PersonEntity {
    @Id
    @GeneratedValue
    @Column(name = "id", unique = true, nullable = false, insertable = false, updatable = false)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
}
