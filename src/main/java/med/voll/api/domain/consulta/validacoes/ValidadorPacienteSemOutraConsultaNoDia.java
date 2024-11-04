package med.voll.api.domain.consulta.validacoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.ConsultaRepository;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;

@Component
public class ValidadorPacienteSemOutraConsultaNoDia implements ValidadorAgendamentoConsultas {
    @Autowired
    private ConsultaRepository consultaRepository;

    public void validar(DadosAgendamentoConsulta dados) {
        var primeiroHorario = dados.data().withHour(7);
        var ultimoHOrario = dados.data().withHour(18);

        var pacientePossuiOutraConsultaNoDia = consultaRepository.existsByPacienteIdAndDataBetween(dados.idPaciente(),
                primeiroHorario, ultimoHOrario);

        if (pacientePossuiOutraConsultaNoDia) {
            throw new ValidacaoException("Paciente ja possui  uma consulta agendada para esse dia.");
        }
    }

}
