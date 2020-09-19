package nl.hollander.simplerestapp.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ContactPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Column
    private String zipCode;

    @Column
    private String city;

    @Column
    private String number;

}
