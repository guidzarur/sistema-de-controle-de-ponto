package com.dio.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class HourBank {

    @EqualsAndHashCode
    @Embeddable
    @Getter
    @Setter
    public class HourBankId implements Serializable{
        private Long IdHourBank;
        private Long IdMovimentation;
        private Long IdUser;

    }
    @EmbeddedId
    private HourBankId id;
    private LocalDateTime dataTrabalhada;
    private BigDecimal quantidadeHoras;
    private BigDecimal saldoHoras;
}
