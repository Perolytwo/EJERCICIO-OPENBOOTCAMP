package tema_8;

public class tema8 {
    public static void main (String [] args){
        Persona hombre = new Persona();
        hombre.setNombre("Iker");
        hombre.setTelefono(555555555);
        hombre.setEdad(30);
        System.out.println("Sus nombre es:  " +hombre.getNombre());
        System.out.println("Su número de telefono es: " +hombre.getTelefono());
        System.out.println("Su edad es:  "+hombre.getEdad());
    }
}
class Persona{
    private String nombre;
    private int telefono;

    private int edad;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }


    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
         return this.telefono ;

    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
}