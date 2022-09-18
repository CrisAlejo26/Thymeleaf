package Taller.Thymeleaf.services;

import Taller.Thymeleaf.interfaces.EmpresaInterface;
import Taller.Thymeleaf.models.Empresa;
import Taller.Thymeleaf.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService implements EmpresaInterface {
    @Autowired
    EmpresaRepository servicios;

    // MOSTRAR EMPRESAS
    @Override
    public List<Empresa> mostrarem() {
        return servicios.findAll();
    }

    // MOSTRAR UNA EMPRESA
    @Override
    public Empresa mostrarId(Integer id) throws Exception {
        Optional<Empresa> s = servicios.findById(id);
        if (s.isPresent()) {
            return s.get();
        }

        throw new Exception("La empresa no se encuentra");
    }

    @Override
    public String agregarEmpresas(Empresa empresa) {
        try {
            mostrarId(empresa.getNit());
            return "La empresa ya existe";
        }catch (Exception e){
            servicios.save(empresa);
            return "La empresa se agrego con exito";
        }
    }

    @Override
    public String actualizarEmpresas(Integer id, Empresa empresa){
        try {
            Empresa x = mostrarId(id);
            x.setNit(empresa.getNit());
            x.setNombre(empresa.getNombre());
            x.setDireccion(empresa.getDireccion());
            x.setTelefono(empresa.getTelefono());
            servicios.save(x);
            return "La Actualizacion se hizo con exito";
        }catch (Exception e){
            return "El nit de la empresa no se encontro";
        }
    }

    @Override
    public String eliminarEmpresa(Integer id){
        try {
            servicios.deleteById(id);
            return "La empresa se elimino con exito";
        }catch (Exception e){
            return "El nit de la empresa no se encuentra";
        }
    }

}


