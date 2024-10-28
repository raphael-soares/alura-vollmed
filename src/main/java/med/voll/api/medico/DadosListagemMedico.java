package med.voll.api.medico;

public record DadosListagemMedico(String nome, String email, Especialidade especialidade) {
    public DadosListagemMedico(Medico medico) {
        this(medico.getNome(), medico.getEmail(), medico.getEspecialidade());
    }
}
