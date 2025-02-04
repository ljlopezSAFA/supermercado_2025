package com.sl.modelos;

import java.util.List;
import java.util.Objects;

public class Empresa {

    private Integer identificador;
    private String codigo;
    private List<Empleado> empleados;
    private TipoEmpresa tipoEmpresa;

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public TipoEmpresa getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(TipoEmpresa tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    public Empresa(Integer identificador, String codigo, List<Empleado> empleados, TipoEmpresa tipoEmpresa) {
        this.identificador = identificador;
        this.codigo = codigo;
        this.empleados = empleados;
        this.tipoEmpresa = tipoEmpresa;
    }

    public Empresa(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa = (Empresa) o;
        return Objects.equals(identificador, empresa.identificador) && Objects.equals(codigo, empresa.codigo) && Objects.equals(empleados, empresa.empleados) && tipoEmpresa == empresa.tipoEmpresa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, codigo, empleados, tipoEmpresa);
    }

    @Override
    public String
    toString() {
        return "Empresa{" +
                "identificador=" + identificador +
                ", codigo='" + codigo + '\'' +
                ", empleados=" + empleados +
                ", tipoEmpresa=" + tipoEmpresa +
                '}';
    }
}
