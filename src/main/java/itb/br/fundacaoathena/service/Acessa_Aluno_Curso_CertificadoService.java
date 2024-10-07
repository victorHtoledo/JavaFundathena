package itb.br.fundacaoathena.service;

import java.util.List;

import org.springframework.stereotype.Service;

import itb.br.fundacaoathena.model.Acessa_Aluno_Curso_Certificado; // Certifique-se de que a classe Acessa_Aluno_Curso_Certificado esteja correta
import itb.br.fundacaoathena.model.Acessa_Aluno_Curso_CertificadoRepository; // Certifique-se de que o pacote do repositório esteja correto
import jakarta.transaction.Transactional;

@Service
public class Acessa_Aluno_Curso_CertificadoService {

    // Objeto Repository
    final Acessa_Aluno_Curso_CertificadoRepository acessaAlunoCursoCertificadoRepository;

    // Injeção de dependências
    public Acessa_Aluno_Curso_CertificadoService(Acessa_Aluno_Curso_CertificadoRepository acessaAlunoCursoCertificadoRepository) {
        this.acessaAlunoCursoCertificadoRepository = acessaAlunoCursoCertificadoRepository;
    }

    // Select * from Acessa_Aluno_Curso_Certificado
    public List<Acessa_Aluno_Curso_Certificado> findAll() {
        return acessaAlunoCursoCertificadoRepository.findAll();
    }

    // Insert into
    @Transactional
    public Acessa_Aluno_Curso_Certificado save(Acessa_Aluno_Curso_Certificado acessaAlunoCursoCertificado) {
        return acessaAlunoCursoCertificadoRepository.save(acessaAlunoCursoCertificado);
    }
}
