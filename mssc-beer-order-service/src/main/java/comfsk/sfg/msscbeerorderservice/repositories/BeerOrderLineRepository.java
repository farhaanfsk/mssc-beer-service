package comfsk.sfg.msscbeerorderservice.repositories;

import comfsk.sfg.msscbeerorderservice.domain.BeerOrderLine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BeerOrderLineRepository extends JpaRepository<BeerOrderLine, UUID> {
}
