package itb.br.fundacaoathena.control;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import itb.br.fundacaoathena.model.Conversa; // Certifique-se de que a classe Conversa esteja correta
import itb.br.fundacaoathena.service.ConversaService; // Certifique-se de que o pacote do serviço esteja correto

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/conversa")
public class ConversaController {

    final ConversaService conversaService;

    public ConversaController(ConversaService conversaService) {
        this.conversaService = conversaService;
    }

    // GET
    @GetMapping()
    public ResponseEntity<List<Conversa>> getAllConversas() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(conversaService.findAll());
    }

    // POST
    @PostMapping()
    public ResponseEntity<Object> saveConversa(Conversa conversa) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(conversaService.save(conversa));
    }
}
