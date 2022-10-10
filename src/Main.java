public class Main {
    public static void main(String[] args){

        Cliente papo = new Cliente();
        papo.credito= 12;
        papo.edad=55;
        papo.telefono= 1234556789;
        papo.nombre= "Papolino Cartie";

        System.out.println("Nombre: " + papo.nombre + ", Edad: " + papo.edad + ", Telefono: " + papo.telefono + ", Credito: " + papo.credito );

        Trabajador charly = new Trabajador();

        charly.salario= 2222;
        charly.edad=22;
        charly.telefono= 9874563213L;
        charly.nombre= "Charles Winter";

        System.out.println("Nombre: " + charly.nombre + ", Edad: " + charly.edad + ", Telefono: " + charly.telefono + ", Salario: " + charly.salario );

    }

    public static class Persona {

        int edad;
        String nombre;
        long telefono;

    }

    public static   class Cliente extends Persona{

        double credito;

    }
    public static   class Trabajador extends Persona{

        double salario;

    }
}