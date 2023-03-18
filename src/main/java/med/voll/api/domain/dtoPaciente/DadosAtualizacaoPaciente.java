package med.voll.api.domain.dtoPaciente;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.dtoEndereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        String cpf,
        DadosEndereco endereco) {

}
