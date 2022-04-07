package net.codejava;
import org.springframework.data.jpa.repository.JpaRepository;
public interface RestaurentRepository extends JpaRepository<RestaurentDetails, Long> {
}