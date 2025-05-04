public class clothing {
    String descripcion;
    Double precio;
    String talle;

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
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getTalle() {
        return talle;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }
}
