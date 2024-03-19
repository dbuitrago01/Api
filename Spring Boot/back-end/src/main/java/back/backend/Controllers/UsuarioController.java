package back.backend.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import back.backend.Models.UsuarioModel;


@RestController
@RequestMapping("api/v1/")
@CrossOrigin(origins = "http://localhost:4200") //url del frontend angular
public class UsuarioController {

  //metodo para obtener el detalle de un empleado consultado por id
  @GetMapping("/usuario/{ref}")
  public ResponseEntity<UsuarioModel> getUsuarioPorId(@PathVariable String ref){

      String tipoDocu = String.valueOf(ref.charAt(0));
      String numDocu = ref.substring(1,ref.length());


      UsuarioModel usuario = new UsuarioModel();

      System.out.println(tipoDocu);
      if(!(tipoDocu.equals("C") ||  tipoDocu.equals("P"))){

           usuario.setTipoDocu("");
           usuario.setTelefono("");
           usuario.setResidencia("");
           usuario.setPnombre("");
           usuario.setSnombre("");
           usuario.setPapellido("");
           usuario.setSapellido("");
           usuario.setDireccion("");
           usuario.setCedula("");
           usuario.setHttpCode("404");
           return ResponseEntity.ok(usuario);

      }

      if(usuario.getCedula().equals(numDocu) && usuario.getTipoDocu().equals(tipoDocu) ){
        return ResponseEntity.ok(usuario);
      }else{
          usuario.setTipoDocu("");
          usuario.setTelefono("");
          usuario.setResidencia("");
          usuario.setPnombre("");
          usuario.setSnombre("");
          usuario.setPapellido("");
          usuario.setSapellido("");
          usuario.setCedula("");
          usuario.setDireccion("");
          usuario.setHttpCode("204");
          return ResponseEntity.ok(usuario);
      }

  }

}
