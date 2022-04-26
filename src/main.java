import java.net.SocketOption;

public class main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setEdad(25);
        cliente.setTelefono(320797413);
        cliente.setNombre("Carlos");
        cliente.setCredito(20000000);
        int edadCliente= cliente.getEdad();
        int telefonoCliente=cliente.getTelefono();
        String nombreCliente=cliente.getNombre();
        int creditoCliente=cliente.getCredito();
        System.out.println("Edad:" + edadCliente);
        System.out.println("Telefono: " + telefonoCliente);
        System.out.println("Nombre: " + nombreCliente);
        System.out.println("Credito: " + creditoCliente);


        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(20);
        trabajador.setTelefono(310797413);
        trabajador.setNombre("Ana");
        trabajador.setSalario(4000000);
        int edadTrabajador= trabajador.getEdad();
        int telefonoTrabajador=trabajador.getTelefono();
        String nombreTrabajador=trabajador.getNombre();
        int salarioTrabajador=trabajador.getSalario();
        System.out.println("Edad:" + edadTrabajador);
        System.out.println("Telefono: " + telefonoTrabajador);
        System.out.println("Nombre: " + nombreTrabajador);
        System.out.println("Salario: " + salarioTrabajador);

    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setTelefono(int telefono){
        this.telefono=telefono;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getTelefono(){
        return this.telefono;
    }
}

class Cliente extends Persona{
    private int credito;

    public int getCredito() {
        return credito;
    }
    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona{
    private int salario;
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
}
