package itb.br.fundacaoathena.control;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import itb.br.fundacaoathena.model.Curso; // Certifique-se de que a classe Curso esteja correta
import itb.br.fundacaoathena.service.CursoService; // Certifique-se de que o pacote do serviço esteja correto

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/curso")
public class CursoController {

    final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    // GET
    @GetMapping()
    public ResponseEntity<List<Curso>> getAllCursos() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(cursoService.findAll());
    }

    // POST
    @PostMapping()
    public ResponseEntity<Object> saveCurso(Curso curso) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(cursoService.save(curso));
    }
}
