package dio.aula;

import dio.aula.model.Usuario;
import dio.aula.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UsuarioRepository repository;
    @Override
    public void run(String... args) throws Exception {

        List<Usuario> usuarios = repository.findByNameContaining("teste");
        for(Usuario u: usuarios){
            System.out.println(u);
        }

    }

    private void insertUsers(){
        Usuario newUser = new Usuario();
        newUser.setName("Murilo");
        newUser.setUserName("murilousername");
        newUser.setPassword("123");

        repository.save(newUser);

        Usuario newUser2 = new Usuario();
        newUser2.setName("teste");
        newUser2.setUserName("teste");
        newUser2.setPassword("teste");

        repository.save(newUser2);


        for(Usuario u : repository.findAll()){
            System.out.println(u);
        }
    }
}
