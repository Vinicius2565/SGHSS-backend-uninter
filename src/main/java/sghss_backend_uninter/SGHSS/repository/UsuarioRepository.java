package sghss_backend_uninter.SGHSS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sghss_backend_uninter.SGHSS.entity.Usuario;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);
}
