package nl.hollander.simplerestapp.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
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
