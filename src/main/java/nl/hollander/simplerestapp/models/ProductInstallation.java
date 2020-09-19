package nl.hollander.simplerestapp.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import java.math.BigDecimal;

@Entity
@Data
public class ProductInstallation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @ManyToOne
    private ContactPerson contactPerson;

    @Column
    @DecimalMin(value = "0.0001")
    @DecimalMax(value = "999999")
    @Digits(integer=6, fraction=4)
    private BigDecimal outPower;

}
