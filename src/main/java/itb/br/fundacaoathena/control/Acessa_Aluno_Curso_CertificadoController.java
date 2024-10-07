package itb.br.fundacaoathena.control;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import itb.br.fundacaoathena.model.Acessa_Aluno_Curso_Certificado; // Certifique-se de que a classe Acessa_Aluno_Curso_Certificado esteja correta
import itb.br.fundacaoathena.service.Acessa_Aluno_Curso_CertificadoService; // Certifique-se de que o pacote do serviço esteja correto

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/acessa-aluno-curso-certificado")
public class Acessa_Aluno_Curso_CertificadoController {

    final Acessa_Aluno_Curso_CertificadoService acessaAlunoCursoCertificadoService;

    public Acessa_Aluno_Curso_CertificadoController(Acessa_Aluno_Curso_CertificadoService acessaAlunoCursoCertificadoService) {
        this.acessaAlunoCursoCertificadoService = acessaAlunoCursoCertificadoService;
    }

    // GET
    @GetMapping()
    public ResponseEntity<List<Acessa_Aluno_Curso_Certificado>> getAllAcessaAlunoCursoCertificado() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(acessaAlunoCursoCertificadoService.findAll());
    }

    // POST
    @PostMapping()
    public ResponseEntity<Object> saveAcessaAlunoCursoCertificado(Acessa_Aluno_Curso_Certificado acessaAlunoCursoCertificado) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(acessaAlunoCursoCertificadoService.save(acessaAlunoCursoCertificado));
    }
}
