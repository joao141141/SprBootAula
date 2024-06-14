package protosingle.aula3.PP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {


    @Autowired
    private Remetente noreply;

    @Autowired
    private Remetente tech;

    public void enviarConfirmacaoCadastro(){
        System.out.println(noreply);
        System.out.println("Seu cadstro foi aprovado");
    }

    public void enviarMensagemBoasVindas(){
        tech.setEmail("jose1234@gmail.com");
        System.out.println(tech);
        System.out.println("Bem-Vindo a tech");
    }
}
