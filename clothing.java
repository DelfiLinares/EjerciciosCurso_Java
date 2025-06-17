public class clothing {
    String descripcion;
    Double precio;
    String talle;

    public double static min_precio = 10.0;
    public double static min_tax = 0.2;

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
        return precio + (precio * min_tax);
    }

    public void setPrecio(Double precio) {
        this.precio = (precio > min_tax) ? precio : minimo; //? if, : else
    }

    public String getTalle() {
        return talle;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }

    @Override
    public String toString(){
        return item.descripcion + ", Talle:" + item.talle
                        + ", Precio:" + item.precio;
    }
}
