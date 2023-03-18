package med.voll.api.domain.dtoConsulta.validacoes.agendamento;

import med.voll.api.domain.dtoConsulta.DadosAgendamentoConsulta;

public interface ValidadorAgendamentoDeConsulta {
    void validar(DadosAgendamentoConsulta dados);
}
