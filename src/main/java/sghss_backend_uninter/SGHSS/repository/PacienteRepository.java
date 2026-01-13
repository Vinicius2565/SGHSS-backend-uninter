package sghss_backend_uninter.SGHSS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sghss_backend_uninter.SGHSS.entity.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
