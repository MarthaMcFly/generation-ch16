package EjemplosResumen;

//primero declaro la variable
public class Animal {

    //le doy atributos:
    private String raza;
    private String nombre;
    private int edad;

    //constructor con el mismo nombre de la clase

    public Animal(String nuevoNombre){
        nombre = nuevoNombre;
    }
    //Para obtener la edad del animal
    public int getEdad(){
        return edad;
    }
    //para modificar la edad del animal
    public void setEdad(int nuevaEdad){
        edad = nuevaEdad;
    }
    //Para obtener el nombre del animal
    public String getNombre(){
        return nombre;
    }




}
