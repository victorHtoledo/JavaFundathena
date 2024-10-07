package itb.br.fundacaoathena.control;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import itb.br.fundacaoathena.model.Aluno;
import itb.br.fundacaoathena.service.AlunoService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600) // Permitir todas as origens
@RequestMapping("/aluno")
public class AlunoController { // Corrigido o nome da classe

    final AlunoService alunoService;

    // Corrigido o nome do parâmetro
    public AlunoController(AlunoService alunoService) { 
        this.alunoService = alunoService;
    }

    //GET
    @GetMapping()
    public ResponseEntity<List<Aluno>> getAllAluno() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(alunoService.findAll());
    }
    
    //Post
    @PostMapping()
   
   public ResponseEntity<Object> saveAluno(Aluno aluno){
    return ResponseEntity.status(HttpStatus.CREATED)
    		.body(alunoService.save(aluno));
    }
}
