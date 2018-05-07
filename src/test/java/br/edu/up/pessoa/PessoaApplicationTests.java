package br.edu.up.pessoa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.edu.up.pessoa.model.Pessoa;
import br.edu.up.pessoa.repository.PessoaRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PessoaApplicationTests {
	@Autowired
	private PessoaRepository pessoaRepository;

	@Test
	public void contextLoads() {
		Pessoa pessoa = new Pessoa();
		pessoa.setPrimeiroNome("Getúlio");
		pessoa.setSegundoNome("Dorneles");
		pessoa.setSobreNome("Vagas");
		pessoa.setEmailPromocional("getulio.vargas@gov.br");

		pessoaRepository.save(pessoa);
		pessoaRepository.flush();
		
		pessoa = new Pessoa();
		pessoa.setPrimeiroNome("Fernando");
		pessoa.setSegundoNome("Henrique");
		pessoa.setSobreNome("Cardoso");
		pessoa.setEmailPromocional("fernando.cardoso@gov.br");

		pessoaRepository.save(pessoa);
		pessoaRepository.flush();
		
		
		for (Pessoa registro : pessoaRepository.findAll()) {
			System.out.println( "\n" +
					"Nome: " + registro.getPrimeiroNome() + " " + registro.getSegundoNome()  + " " + registro.getSobreNome() + "\n" +
					"Email: " + registro.getEmailPromocional());
		}
    }

    @Before
    @After
    public void banner() {
        System.out.println("\n\n----------------------------------------------------------------\n");
    }

}
