public class Vendedor extends empleado implements Calcular{
      private double comision;
      private Double salario_base;

    public Vendedor(String nombre, double salario, Integer edad, double comision) {
        super(nombre, salario, edad);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public Double getSalario_base() {
        return salario_base;
    }

    public void setSalario_base(Double salario_base) {
        this.salario_base = salario_base;
    }

    public double calcular_salario(){
        return comision+salario_base;
    }
}
