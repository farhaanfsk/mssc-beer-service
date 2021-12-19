package comfsk.sfg.msscbeerorderservice.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BeerOrder extends BaseEntity{
    @ManyToOne
    private Customer customer;
    private String customerRef;
    private String orderStatusCallbackUrl;
}
