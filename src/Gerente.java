public class Gerente extends empleado{
    private Double bono;

    public Gerente(String nombre, double salario, Integer edad, Double bono) {
        super(nombre, salario, edad);
        this.bono = bono;
    }
}
