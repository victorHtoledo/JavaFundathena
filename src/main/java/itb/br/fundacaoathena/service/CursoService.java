package itb.br.fundacaoathena.service;

import java.util.List;

import org.springframework.stereotype.Service;

import itb.br.fundacaoathena.model.Curso; // Certifique-se de que a classe Curso esteja correta
import itb.br.fundacaoathena.model.CursoRepository; // Certifique-se de que o pacote do repositório esteja correto
import jakarta.transaction.Transactional;

@Service
public class CursoService {

    // Objeto Repository
    final CursoRepository cursoRepository;

    // Injeção de dependências
    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    // Select * from Curso
    public List<Curso> findAll() {
        return cursoRepository.findAll();
    }

    // Insert into
    @Transactional
    public Curso save(Curso curso) {
        return cursoRepository.save(curso);
    }
}
