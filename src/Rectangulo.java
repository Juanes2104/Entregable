public class Rectangulo extends Figuras_geometricas implements Metodo{
    private float Longitud;
    private Double Area;
    private double perimetro;

    public Rectangulo(String nombre, String color, float longitud) {
        super(nombre, color);
        Longitud = longitud;

    }

    public float getLongitud() {
        return Longitud;
    }

    public void setLongitud(float longitud) {
        Longitud = longitud;
    }

    public Double getArea() {
        return Area;
    }

    public void setArea(Double area) {
        Area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    public double calcularArea(){
        return Area;
    };
    public double calcularPerimetro(){
        return perimetro;
    };
}
