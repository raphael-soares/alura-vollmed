package med.voll.api.endereco;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    private String complemento;
    private String numero;

    public Endereco(DadosEndereco endereco) {
        this.logradouro = endereco.logradouro();
        this.bairro = endereco.bairro();
        this.cep = endereco.cep();
        this.cidade = endereco.cidade();
        this.uf = endereco.uf();
        this.complemento = endereco.uf();
        this.numero = endereco.numero();
    }

    public void atualizarDados(DadosEndereco dados) {
        if (logradouro != null) {
            this.logradouro = dados.logradouro();
        }
        if (bairro != null) {
            this.bairro = dados.bairro();
        }
        if (cep != null) {
            this.cep = dados.cep();
        }
        if (cidade != null) {
            this.cidade = dados.cidade();
        }
        if (uf != null) {
            this.uf = dados.uf();
        }
        if (complemento != null) {
            this.complemento = dados.complemento();
        }
        if (numero != null) {
            this.numero = dados.numero();
        }
    }
}
