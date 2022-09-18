package Taller.Thymeleaf.controllers;
 /*
import Taller.Thymeleaf.interfaces.EmpresaInterface;
import Taller.Thymeleaf.models.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpresaController {
    @Autowired
    private EmpresaInterface controller;

    @GetMapping("/index")
    public ResponseEntity<List<Empresa>> mostrarEmpresas(){
        return new ResponseEntity<>(controller.mostrarem(), HttpStatus.OK);
    }

    @GetMapping("/index/{id}")
    public ResponseEntity<Object> mostrarUnaEmpresa(@PathVariable Integer id){
        try {
            Empresa em = controller.mostrarId(id);
            return new ResponseEntity<>(em, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.OK);
        }

    }

    @PostMapping("/index")
    public ResponseEntity<String> agregarEmpresa(@RequestBody Empresa empresa){
        try {
            String mensaje = controller.agregarEmpresas(empresa);
            return new ResponseEntity<>(mensaje, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("La empresa ya existe", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PatchMapping("/index/{id}")
    public ResponseEntity<String> actualizarEmpresa(@PathVariable Integer id, @RequestBody Empresa empresa){
        try {
            String r = controller.actualizarEmpresas(id, empresa);
            return new ResponseEntity<>(r, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/index/{id}")
    public ResponseEntity<String> eliminarDatos(@PathVariable Integer id){
        try {
            String s = controller.eliminarEmpresa(id);
            return new ResponseEntity<>(s, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}*/
