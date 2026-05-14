public class Persona {
    private String nombres;
    private String Apaterno;
    private String Amaterno;
    private int edad;

    public Persona (String nombres, String Apaterno, String Amaterno){ 
    this.nombres = nombres;
    this.Apaterno = Apaterno;
    this.Amaterno = Amaterno;
    }
    public String getApaterno() {
        return Apaterno;
    }

    public void setApaterno(String apaterno) {
        Apaterno = apaterno;
    }

    public String getAmaterno() {
        return Amaterno;
    }
    public void setAmaterno(String amaterno) {
        Amaterno = amaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString(){
    return "Nombre: " + this.nombres + "\n Apellido Paterno: " + this.Apaterno + "\n Apaterno Materno: " + this.Amaterno + "\n Edad: " + this.edad;
    }
}
