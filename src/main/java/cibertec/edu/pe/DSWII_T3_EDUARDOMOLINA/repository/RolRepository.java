package cibertec.edu.pe.DSWII_T3_EDUARDOMOLINA.repository;

import cibertec.edu.pe.DSWII_T3_EDUARDOMOLINA.model.bd.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends
        JpaRepository<Rol, Integer> {

    Rol findByNomrol(String nombrerol);
}
