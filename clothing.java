public class clothing {
    String descripcion;
    Double precio;
    String talle;

    private double maximo = 10.0;
    private double minimo = 0.2;

    public clothing(String descripcion, Double precio, String talle) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.talle = talle;
    }

    public clothing(){
        this.descripcion = "Remera";
        this.precio = 11.2;
        this.talle = "M";
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio + (precio * minimo);
    }

    public void setPrecio(Double precio) {
        this.precio = (precio > minimo) ? precio : minimo;
    }

    public String getTalle() {
        return talle;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }
}
