package aula4.exemplosaula.App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner{
    
    @Autowired
    private Remetente remetente;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem Enviada por: " + remetente.getNome() + "\nEmail: " + remetente.getEmail()+ "\nCom telefones para contato: " + remetente.getTelefones());
        System.out.println("Seu cadastro foi aprovado");
    }
}
