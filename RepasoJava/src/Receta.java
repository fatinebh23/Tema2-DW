public class Receta {
    private String nombre;
    private double calorias;
    private String categorias;


    public Receta(String nombre,double calorias, String categorias) {
        this.calorias = calorias;
        this.categorias = categorias;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public String getCategorias() {
        return categorias;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }

}
