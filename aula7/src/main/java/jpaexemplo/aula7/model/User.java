package jpaexemplo.aula7.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="user_id")
    private Integer id;
    @Column(length=50, nullable=false)
    private String nome;
    @Column(length=50, nullable=false)
    private String username;
    @Column(length=100, nullable=false)
    private String password;


    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString(){
        return "Nome: "+nome+" Username: "+username+" Password: "+password;
    }
}
