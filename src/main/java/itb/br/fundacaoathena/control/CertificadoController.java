package itb.br.fundacaoathena.control;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import itb.br.fundacaoathena.model.Certificado; // Certifique-se de que a classe Certificado esteja correta
import itb.br.fundacaoathena.service.CertificadoService; // Certifique-se de que o pacote do serviço esteja correto

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/certificado")
public class CertificadoController {

    final CertificadoService certificadoService;

    public CertificadoController(CertificadoService certificadoService) {
        this.certificadoService = certificadoService;
    }

    // GET
    @GetMapping()
    public ResponseEntity<List<Certificado>> getAllCertificados() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(certificadoService.findAll());
    }

    // POST
    @PostMapping()
    public ResponseEntity<Object> saveCertificado(Certificado certificado) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(certificadoService.save(certificado));
    }
}
