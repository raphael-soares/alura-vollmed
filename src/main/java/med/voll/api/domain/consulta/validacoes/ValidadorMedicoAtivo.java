package med.voll.api.domain.consulta.validacoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import med.voll.api.domain.medico.MedicoRepository;

@Component
public class ValidadorMedicoAtivo implements ValidadorAgendamentoConsultas {

    @Autowired
    private MedicoRepository medicoRepository;

    public void validar(DadosAgendamentoConsulta dados) {

        if (dados.idMedico() == null) {
            return;
        }

        var medicoAtivo = medicoRepository.findAtivoById(dados.idMedico());

        if (!medicoAtivo) {
            throw new ValidacaoException("Consulta nao pode ser agendada com um medico excluido");
        }

    }

}
