package itb.br.fundacaoathena.service;

import java.util.List;

import org.springframework.stereotype.Service;

import itb.br.fundacaoathena.model.Conversa; // Certifique-se de que a classe Conversa esteja correta
import itb.br.fundacaoathena.model.ConversaRepository; // Certifique-se de que o pacote do repositório esteja correto
import jakarta.transaction.Transactional;

@Service
public class ConversaService {

    // Objeto Repository
    final ConversaRepository conversaRepository;

    // Injeção de dependências
    public ConversaService(ConversaRepository conversaRepository) {
        this.conversaRepository = conversaRepository;
    }

    // Select * from Conversa
    public List<Conversa> findAll() {
        return conversaRepository.findAll();
    }

    // Insert into
    @Transactional
    
    public Conversa save(Conversa conversa) {
        return conversaRepository.save(conversa);
    }
}
