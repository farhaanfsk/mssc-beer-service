package comfsk.sfg.msscbeerorderservice.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.UUID;
@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BeerOrderLine extends BaseEntity{

    @ManyToOne
    private BeerOrder beerOrder;

    private UUID beerId;
    private Integer orderQuantity = 0;
    private Integer quantityAllocated = 0;
}
