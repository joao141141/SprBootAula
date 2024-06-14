package jpaexemplo.aula7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import jpaexemplo.aula7.model.User;
import jpaexemplo.aula7.repository.UserRepository;


@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository  userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setNome("João");
        user.setUsername("joao");
        user.setPassword("123");
        userRepository.save(user);


        for(User u: userRepository.findAll()){
            System.out.println(u.getNome());
        }
    }

}
