package aula4.exemplosaula.App;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "remetente")

public class Remetente {

    @Value("${nome}")
    private String nome;

    @Value("${email}")
    private String email;
    
    @Value("${telefones}")
    private List<Long> telefones;


    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }
    public List<Long> getTelefones(){
        return telefones;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setTelefones(List<Long> telefones){
        this.telefones = telefones;

}}
