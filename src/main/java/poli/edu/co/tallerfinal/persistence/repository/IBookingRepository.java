package poli.edu.co.tallerfinal.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import poli.edu.co.tallerfinal.persistence.entity.Bookings;

@Repository
public interface IBookingRepository extends JpaRepository<Bookings,Long> {
}
