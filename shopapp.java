import java.lang.reflect.Array;
import java.util.ArrayList;

public class ShopApp {
    public static void main(String [] args){
        double tax = 0.2;
        double total = 0.0;
        int measurement=3;


        System.out.println("Welcome to Duke Choice shop");

        customer c1=new customer("Pinky","S");
        System.out.println("El nombre del customer es:" + c1.name);

        clothing item1 = new clothing("Campera Azul",20.9,"M");
        clothing item2 = new clothing("Remera naranja", 10.5, "S");
        clothing item3 = new clothing("Remera azul", 10.5, "S");
        clothing item4 = new clothing("Bufanda verde", 5.0, "S");

       // System.out.println("La primera prenda es: "+item1);
       // System.out.println("La segunda prenda es: "+item2);

        ArrayList<clothing>items = new ArrayList<clothing>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);

        //total = (item1.precio + item2.precio * 2) * 1+tax;
        //System.out.println("Total= " +total);

        c1.setSize(measurement);
        c1.agregar(items);

        for (clothing item : c1.getItems()) {
            System.out.println("El cliente: " + c1.name + ", su talle: " + c1.talla +
                    ", El total:" + c1.totalDelaCompra());
        }
    }
}
