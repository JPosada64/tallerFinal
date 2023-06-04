package poli.edu.co.tallerfinal.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import poli.edu.co.tallerfinal.persistence.entity.Users;

@Repository
public interface IUsersRepository extends JpaRepository<Users,Long> {
}
