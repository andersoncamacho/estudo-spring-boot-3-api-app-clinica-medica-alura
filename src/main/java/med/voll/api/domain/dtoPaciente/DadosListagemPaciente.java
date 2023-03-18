package med.voll.api.domain.dtoPaciente;

import med.voll.api.model.Paciente;

public record DadosListagemPaciente(Long id, String nome, String email, String cpf) {
    public DadosListagemPaciente(Paciente paciente) {
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf());
    }
}
