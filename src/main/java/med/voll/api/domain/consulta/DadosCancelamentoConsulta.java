package med.voll.api.domain.consulta;

import jakarta.validation.constraints.NotBlank;

/**
 * DadosCancelamentoConsulta
 */
public record DadosCancelamentoConsulta(

        @NotBlank Long idConsulta,
        @NotBlank MotivoCancelamento motivo) {
}
