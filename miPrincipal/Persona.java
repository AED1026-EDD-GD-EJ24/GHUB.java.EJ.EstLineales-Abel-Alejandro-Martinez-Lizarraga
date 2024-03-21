public class Persona {
    private String nombre;
    private int edad;
    private String nacionalidad;

    public Persona(String nombre, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;

    }

    //get

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }  
    
    public String getNacionalidad() {
        return nacionalidad;
    }

    //set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

 //set
        public void setEdad(int edad) {
            this.edad = edad;
        }
 //set
public void setNacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
}
    

public String toString(){
    return "Nombre: " + nombre + " Edad: " + edad + " Nacionalidad: " + nacionalidad;
    
    
}
}
