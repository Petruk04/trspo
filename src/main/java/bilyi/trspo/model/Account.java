package bilyi.trspo.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity

public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal balance;
    private boolean isBlocked;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    // getters and setters
}