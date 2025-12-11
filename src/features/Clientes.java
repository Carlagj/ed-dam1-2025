package features;

import java.util.List;

public class Clientes {

    private String nombre;
    private String apellido;
    private String NIF;
    private String direccion;
    private String localidad;
    private String provincia;
    private String telefono;
    private String email;
    private List<facturas> facturas;

    public Clientes(String nombre, String apellido, String NIF, String direccion,
                    String localidad, String provincia,String telefono, String email, List<facturas> facturas){

        this.nombre = nombre;
        this.apellido = apellido;
        this.NIF = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.provincia = provincia;
        this.telefono = telefono;
        this.email = email;
        this.facturas = facturas;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<facturas> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<facturas> facturas) {
        this.facturas = facturas;
    }




}
