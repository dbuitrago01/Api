package back.backend.Models;


public class UsuarioModel {

    private String tipoDocu;
    private String cedula ;
    private String pnombre ;
    private String snombre;
    private String papellido;
    private String sapellido;
    private String telefono;
    private String direccion;
    private String residencia;

    private String httpCode;


    public UsuarioModel(){
        this.tipoDocu = "C";
        this.cedula  = "23445322";
        this.pnombre =  "Daniel";
        this.snombre =  "Giancarlo";
        this.papellido = "Buitrago";
        this.sapellido = "Velasco";
        this.telefono =  "321334433";
        this.direccion = "callee 5taa";
        this.residencia = "residencia";
        this.httpCode = "200";
    }

    public String getHttpCode() {
        return this.httpCode;
    }

    public String getTipoDocu() {
        return this.tipoDocu;
    }

    public String getCedula() {
        return this.cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public String getPnombre() {
        return this.pnombre;
    }

    public void setPnombre(String pnombre) {
        this.pnombre = pnombre;
    }
    public String getSnombre() {
        return snombre;
    }
    public void setSnombre(String snombre) {
        this.snombre = snombre;
    }
    public String getPapellido() {
        return this.papellido;
    }
    public void setPapellido(String papellido) {
        this.papellido = papellido;
    }
    public String getSapellido() {
        return this.sapellido;
    }
    public void setSapellido(String sapellido) {
        this.sapellido = sapellido;
    }
    public String getTelefono() {
        return this.telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return this.direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getResidencia() {
        return this.residencia;
    }
    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public void setTipoDocu(String tipoDocu) {
        this.tipoDocu = tipoDocu;
    }

    public void setHttpCode(String httpCode) {
        this.httpCode = httpCode;
    }

}