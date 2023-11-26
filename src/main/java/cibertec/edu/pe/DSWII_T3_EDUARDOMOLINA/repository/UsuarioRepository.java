package cibertec.edu.pe.DSWII_T3_EDUARDOMOLINA.repository;

import cibertec.edu.pe.DSWII_T3_EDUARDOMOLINA.model.bd.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends
        JpaRepository<Usuario, Integer> {

    Usuario findByNomusuario(String nomusuario);

}
