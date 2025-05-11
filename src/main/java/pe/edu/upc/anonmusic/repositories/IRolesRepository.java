package pe.edu.upc.anonmusic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.anonmusic.entities.Roles;

import java.util.List;

@Repository
public interface IRolesRepository extends JpaRepository<Roles, Integer> {


}
