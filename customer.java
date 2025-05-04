import java.lang.reflect.Array;
import java.util.ArrayList;

public class customer {
    String name;
    String talla;
    private ArrayList<clothing>items;

    public void agregar(ArrayList<clothing> itemsito) {
        items = itemsito;
    }
    public ArrayList<clothing> getItems() {
        return items;
    }

    public double totalDelaCompra(){
        double total = 0.0;
        for (clothing item : items){
  //          if (c1.talla.equals(item.talle)){
                //total = total + item.precio;
                System.out.println("Descripcion:" + item.descripcion + ", Talle:" + item.talle
                        + ", Precio:" + item.precio);
      //          total= total + total * tax;
      //          if (total > 15){
        //            break;
          //      }
            }
        //}
        return total;
    }

    public customer(String name, String talla) {
        this.name = name;
        this.talla = talla;
    }

    public customer(){
        this.name = "Pepo";
        this.talla = "S";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public void setSize(int measurement){
        switch (measurement){
            case 1, 2, 3:
                setTalla("S");
                break;
            case 4, 5, 6:
                setTalla("M");
                break;
            case 7, 8, 9:
                setTalla("L");
                break;
            default:
                setTalla("X");
        }
    }
}
