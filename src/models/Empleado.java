package src.models;

public class Empleado {

    private String nombre;
    private String cedula;
    
    Empleado(){
    }

    public Empleado(String nombre, String cedula){
        this.nombre= nombre;
        this.cedula= cedula;
    }

    public void setNombre(String nombre){
        this.nombre= nombre;
    }

    public String getNombre(){
        return nombre;
    }
    
    public void setCedula(String cedula){
        this.cedula =  cedula;
    }

    public String getCedula(){
        return cedula;
    }

}
