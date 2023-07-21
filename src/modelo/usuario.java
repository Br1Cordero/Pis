
package modelo;

public class usuario {
    
    private int ID_USUARIO;
    private String NOMBRE;
    private String APELLIDO;
    private String CELULAR;
    private String CORREO;
    private String USUARIO;
    private String PASWORD;
    private String PASWORD_VEREFICACION;

    public int getIDUSUARIO() {
        return ID_USUARIO;
    }

    public void setIDUSUARIO(int ID_USUARIO) {
        this.ID_USUARIO = ID_USUARIO;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getAPELLIDO() {
        return APELLIDO;
    }

    public void setAPELLIDO(String APELLIDO) {
        this.APELLIDO = APELLIDO;
    }

    public String getCELULAR() {
        return CELULAR;
    }

    public void setCELULAR(String CELULAR) {
        this.CELULAR = CELULAR;
    }

    public String getCORREO() {
        return CORREO;
    }

    public void setCORREO(String CORREO) {
        this.CORREO = CORREO;
    }

    public String getUSUARIO() {
        return USUARIO;
    }

    public void setUSUARIO(String USUARIO) {
        this.USUARIO = USUARIO;
    }

    public String getPASWORD() {
        return PASWORD;
    }

    public void setPASWORD(String PASWORD) {
        this.PASWORD = PASWORD;
    }

    public String getPASWORD_VEREFICACION() {
        return PASWORD_VEREFICACION;
    }

    public void setPASWORD_VEREFICACION(String PASWORD_VEREFICACION) {
        this.PASWORD_VEREFICACION = PASWORD_VEREFICACION;
    }
}  