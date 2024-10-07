package itb.br.fundacaoathena.service;

import java.util.List;

import org.springframework.stereotype.Service;

import itb.br.fundacaoathena.model.Aluno;
import itb.br.fundacaoathena.model.AlunoRepository;
import jakarta.transaction.Transactional;

@Service
public class AlunoService {

    // Objeto Repository
    final AlunoRepository alunoRepository;

    // Injeção de dependências
    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    //Select * Aluno
    
    public List<Aluno> findAll(){
    	
    	return alunoRepository.findAll();
    }
    
    //insert into
    @Transactional
    public Aluno save(Aluno aluno) {
    	
    	return alunoRepository.save(aluno);
    }
}
