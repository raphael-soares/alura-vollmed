package med.voll.api.domain.paciente;

/**
 * DadosListagemPaciente
 */
public record DadosListagemPaciente(String nome,
        String cpf, String email) {
    public DadosListagemPaciente(Paciente paciente) {
        this(
                paciente.getNome(),
                paciente.getCpf(),
                paciente.getEmail());
    }
}
