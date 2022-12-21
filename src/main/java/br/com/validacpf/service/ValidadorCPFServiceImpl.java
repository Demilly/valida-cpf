package br.com.validacpf.service;

import br.com.validacpf.service.validador.ValidaCPF;
import org.springframework.stereotype.Service;

@Service
public class ValidadorCPFServiceImpl implements ValidadorCPFService {

    @Override
    public Boolean verificaCPFValido(String cpf) {
        return ValidaCPF.isCPF(cpf);
    }

}
