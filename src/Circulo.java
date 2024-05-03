public class Circulo extends Figuras_geometricas implements Metodo {
    private float radio;
    private double Area;
    private float Perimetro;

    public Circulo(String nombre, String color, float radio) {
        super(nombre, color);
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double area) {
        Area = area;
    }

    public float getPerimetro() {
        return Perimetro;
    }

    public void setPerimetro(float perimetro) {
        Perimetro = perimetro;
    }
    public double calcularArea(){
        return Area;
    };
    public double calcularPerimetro(){
        return Perimetro;
    };
}
