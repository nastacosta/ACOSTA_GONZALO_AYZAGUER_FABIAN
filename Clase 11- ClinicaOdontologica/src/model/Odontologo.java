package model;

public class Odontologo {
    private Integer ID;
    private String Matricula;
    private String Nombre;
    private String Apellido;

    public Odontologo(Integer ID, String matricula, String nombre, String apellido) {
        this.ID = ID;
        Matricula = matricula;
        Nombre = nombre;
        Apellido = apellido;
    }

    public Integer getID() {
        return ID;
    }

    public String getMatricula() {
        return Matricula;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }
}

