package protosingle.aula3.PP;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
@Configuration
public class Beans {
    @Bean
    @Scope("prototype")
    public Remetente remetente(){
        System.out.println("Criando um Objeto Remetente");
        Remetente remetente = new Remetente();
        remetente.setEmail("carlos131@gmail.com");
        remetente.setNome("Carlos");
        return remetente;
    }
}
