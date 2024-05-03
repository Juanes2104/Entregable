public class Vendedor extends empleado{
      private double comision;

    public Vendedor(String nombre, double salario, Integer edad, double comision) {
        super(nombre, salario, edad);
        this.comision = comision;
    }
}
