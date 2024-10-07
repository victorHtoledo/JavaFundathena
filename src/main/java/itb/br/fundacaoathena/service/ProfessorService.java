package itb.br.fundacaoathena.service;

import java.util.List;

import org.springframework.stereotype.Service;

import itb.br.fundacaoathena.model.Professor; // Certifique-se de que a classe Professor esteja correta
import itb.br.fundacaoathena.model.ProfessorRepository; // Certifique-se de que o pacote do repositório esteja correto
import jakarta.transaction.Transactional;

@Service
public class ProfessorService {

    // Objeto Repository
    final ProfessorRepository professorRepository;

    // Injeção de dependências
    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    // Select * from Professor
    public List<Professor> findAll() {
        return professorRepository.findAll();
    }

    // Insert into
    @Transactional
    public Professor save(Professor professor) {
        return professorRepository.save(professor);
    }
}
