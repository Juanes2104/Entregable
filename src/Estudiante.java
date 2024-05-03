public class Estudiante extends Persona {
    private Integer grado;

    public Estudiante(String fecha_nacimiento, String nombre, Integer edad, Integer año_actual, Integer grado) {
        super(fecha_nacimiento, nombre, edad, año_actual);
        this.grado = grado;
    }

    public Integer getGrado() {
        return grado;
    }

    public void setGrado(Integer grado) {
        this.grado = grado;
    }
}

