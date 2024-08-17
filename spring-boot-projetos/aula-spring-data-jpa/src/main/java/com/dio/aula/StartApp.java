package com.dio.aula;

import com.dio.aula.model.User;
import com.dio.aula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {

        List<User> users = repository.filtrarPorNome("Lucas");

        for(User u: users){
            System.out.println(u);
        }

        }
        private void insertUser(){
            User user = new User();
            user.setName("Cesar");
            user.setUsername("s");
            user.setPassword("123456");

            repository.save(user);

            for (User u: repository.findAll()){
                System.out.println(u);
            }
        }


}
