package protosingle.aula3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import protosingle.aula3.PP.SistemaMensagem;

@SpringBootApplication
public class Aula3Application {

	public static void main(String[] args) {
		SpringApplication.run(Aula3Application.class, args);
	}

	@Bean
	public CommandLineRunner run(SistemaMensagem sistema) throws Exception {
		return args -> {
			sistema.enviarConfirmacaoCadastro();
			sistema.enviarMensagemBoasVindas();

		};
	}

}
