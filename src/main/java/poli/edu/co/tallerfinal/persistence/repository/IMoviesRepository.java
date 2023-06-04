package poli.edu.co.tallerfinal.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import poli.edu.co.tallerfinal.persistence.entity.Movies;

@Repository
public interface IMoviesRepository extends JpaRepository<Movies,Long> {
}
