package itb.br.fundacaoathena.service;

import java.util.List;

import org.springframework.stereotype.Service;

import itb.br.fundacaoathena.model.Aula; // Certifique-se de que a classe Aula esteja correta
import itb.br.fundacaoathena.model.AulaRepository; // Certifique-se de que o pacote do repositório esteja correto
import jakarta.transaction.Transactional;

@Service
public class AulaService {

    // Objeto Repository
    final AulaRepository aulaRepository;

    // Injeção de dependências
    public AulaService(AulaRepository aulaRepository) {
        this.aulaRepository = aulaRepository;
    }

    // Select * from Aula
    public List<Aula> findAll() {
        return aulaRepository.findAll();
    }

    // Insert into
    @Transactional
    public Aula save(Aula aula) {
        return aulaRepository.save(aula);
    }
}
