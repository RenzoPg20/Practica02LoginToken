package pe.edu.cibertec.Practica02.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.Practica02.Entity.Usuario;
import pe.edu.cibertec.Practica02.Repository.UserRepository;
import pe.edu.cibertec.Practica02.Response.LoginResponse;
import pe.edu.cibertec.Practica02.Security.JWTAuthenticationConfig;

@RestController
@RequestMapping("/usuario")
public class UsuarioService {


    @Autowired
    UserRepository userRepository;

    @Autowired
    JWTAuthenticationConfig jwtAuthenticationConfig;


    @PostMapping("/login")
    public LoginResponse logea(@RequestBody Usuario usuario){


        Usuario userResult=userRepository.findByusername(usuario.getUsername());



        if (userResult==null){
            return new LoginResponse("99","Error establecido",null);
        }


        if (!new BCryptPasswordEncoder().matches(usuario.getPassword(), userResult.getPassword())){

            return new LoginResponse("99","Error establecido",null);

        }



        String token= jwtAuthenticationConfig.getJWTToken(usuario.getUsername());

        return new LoginResponse("01","Genial Acceso Otorgado :)",token);



    }





}
