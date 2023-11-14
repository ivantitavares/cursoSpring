package med.voll.api.pacientes;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    @PostMapping
    public void Cadastrar(@RequestBody DadosCadastroPaciente dadosPaciente){
        System.out.println(dadosPaciente);
    }
}
