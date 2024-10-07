package itb.br.fundacaoathena.control;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import itb.br.fundacaoathena.model.Graduacao; // Certifique-se de que a classe Graduacao esteja correta
import itb.br.fundacaoathena.service.GraduacaoService; // Certifique-se de que o pacote do serviço esteja correto

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/graduacao")
public class GraduacaoController {

    final GraduacaoService graduacaoService;

    public GraduacaoController(GraduacaoService graduacaoService) {
        this.graduacaoService = graduacaoService;
    }

    // GET
    @GetMapping()
    public ResponseEntity<List<Graduacao>> getAllGraduacoes() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(graduacaoService.findAll());
    }

    // POST
    @PostMapping()
    public ResponseEntity<Object> saveGraduacao(Graduacao graduacao) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(graduacaoService.save(graduacao));
    }
}
