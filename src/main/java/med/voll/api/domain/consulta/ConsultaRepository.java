package med.voll.api.domain.consulta;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

    Boolean existsByPacienteIdAndDataBetween(@NotNull Long idPaciente, LocalDateTime primeiroHorario,
            LocalDateTime ultimoHorario);

    Boolean existsByMedicoIdAndData(Long idMedico, @NotNull @Future LocalDateTime data);
}
