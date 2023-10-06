package CRUD;

import java.io.Serializable;

public class CentroComercialDTO implements Serializable {
    public Integer Id;
    private String nombreCentro;
    private String ciudad;
    private String direcciom;

    public CentroComercialDTO(Integer id, String nombreCentro, String ciudad, String direcciom) {
        Id = id;
        this.nombreCentro = nombreCentro;
        this.ciudad = ciudad;
        this.direcciom = direcciom;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNombreCentro() {
        return nombreCentro;
    }

    public void setNombreCentro(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDirecciom() {
        return direcciom;
    }

    public void setDirecciom(String direcciom) {
        this.direcciom = direcciom;
    }
}
