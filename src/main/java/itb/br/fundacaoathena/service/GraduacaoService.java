package itb.br.fundacaoathena.service;

import java.util.List;

import org.springframework.stereotype.Service;

import itb.br.fundacaoathena.model.Graduacao; // Certifique-se de que a classe Graduacao esteja correta
import itb.br.fundacaoathena.model.GraduacaoRepository; // Certifique-se de que o pacote do repositório esteja correto
import jakarta.transaction.Transactional;

@Service
public class GraduacaoService {

    // Objeto Repository
    final GraduacaoRepository graduacaoRepository;

    // Injeção de dependências
    public GraduacaoService(GraduacaoRepository graduacaoRepository) {
        this.graduacaoRepository = graduacaoRepository;
    }

    // Select * from Graduacao
    public List<Graduacao> findAll() {
        return graduacaoRepository.findAll();
    }

    // Insert into
    @Transactional
    public Graduacao save(Graduacao graduacao) {
        return graduacaoRepository.save(graduacao);
    }
}
