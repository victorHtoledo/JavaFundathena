package itb.br.fundacaoathena.control;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import itb.br.fundacaoathena.model.Professor; // Certifique-se de que a classe Professor esteja correta
import itb.br.fundacaoathena.service.ProfessorService; // Certifique-se de que o pacote do serviço esteja correto

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/professor")
public class ProfessorController {

    final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    // GET
    @GetMapping()
    public ResponseEntity<List<Professor>> getAllProfessores() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(professorService.findAll());
    }

    // POST
    @PostMapping()
    public ResponseEntity<Object> saveProfessor(Professor professor) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(professorService.save(professor));
    }
}
