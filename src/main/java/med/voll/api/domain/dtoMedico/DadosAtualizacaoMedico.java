package med.voll.api.domain.dtoMedico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.dtoEndereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
