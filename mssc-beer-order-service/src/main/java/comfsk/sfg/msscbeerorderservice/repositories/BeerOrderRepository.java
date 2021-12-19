package comfsk.sfg.msscbeerorderservice.repositories;

import comfsk.sfg.msscbeerorderservice.domain.BeerOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BeerOrderRepository extends JpaRepository<BeerOrder, UUID> {
}
