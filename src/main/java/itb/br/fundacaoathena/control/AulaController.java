package itb.br.fundacaoathena.control;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import itb.br.fundacaoathena.model.Aula; // Certifique-se de que a classe Aula esteja correta
import itb.br.fundacaoathena.service.AulaService; // Certifique-se de que o pacote do serviço esteja correto

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/aula")
public class AulaController {

    final AulaService aulaService;

    public AulaController(AulaService aulaService) {
        this.aulaService = aulaService;
    }

    // GET
    @GetMapping()
    public ResponseEntity<List<Aula>> getAllAulas() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(aulaService.findAll());
    }

    // POST
    @PostMapping()
    public ResponseEntity<Object> saveAula(Aula aula) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(aulaService.save(aula));
    }
}
