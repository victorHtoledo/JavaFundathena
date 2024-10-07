package itb.br.fundacaoathena.service;

import java.util.List;

import org.springframework.stereotype.Service;

import itb.br.fundacaoathena.model.Certificado; // Certifique-se de que a classe Certificado esteja correta
import itb.br.fundacaoathena.model.CertificadoRepository; // Certifique-se de que o pacote do repositório esteja correto
import jakarta.transaction.Transactional;

@Service
public class CertificadoService {

    // Objeto Repository
    final CertificadoRepository certificadoRepository;

    // Injeção de dependências
    public CertificadoService(CertificadoRepository certificadoRepository) {
        this.certificadoRepository = certificadoRepository;
    }

    // Select * from Certificado
    public List<Certificado> findAll() {
        return certificadoRepository.findAll();
    }

    // Insert into
    @Transactional
    public Certificado save(Certificado certificado) {
        return certificadoRepository.save(certificado);
    }
}
