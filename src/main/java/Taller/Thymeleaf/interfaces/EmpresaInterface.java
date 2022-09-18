package Taller.Thymeleaf.interfaces;

import Taller.Thymeleaf.models.Empresa;

import java.util.List;

public interface EmpresaInterface {

    public List<Empresa> mostrarem();

    public Empresa mostrarId(Integer id) throws Exception;

    public String agregarEmpresas(Empresa empresa);

    public String actualizarEmpresas(Integer id, Empresa empresa);

    public String eliminarEmpresa(Integer id);

}
