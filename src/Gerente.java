public class Gerente extends empleado implements Calcular{
    private Double bono;
    private Double salario_natural;

    public Gerente(String nombre, double salario, Integer edad, Double bono) {
        super(nombre, salario, edad);
        this.bono = bono;
    }

    public Double getBono() {
        return bono;
    }

    public void setBono(Double bono) {
        this.bono = bono;
    }

    public Double getSalario_natural() {
        return salario_natural;
    }

    public void setSalario_natural(Double salario_natural) {
        this.salario_natural = salario_natural;
    }
    public double calcular_salario(){
        return salario_natural+bono;
    }
}
