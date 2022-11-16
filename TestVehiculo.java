public class TestVehiculo {
    public static void main(String[] args) {
        // Vehiculo carro1 = new Vehiculo();
        // carro1.anio=2001;
        // carro1.marca="Honda";
        // carro1.modelo="Civic";
        // carro1.color="blanco";
        // carro1.ruedas=4;

        // Vehiculo carro2 = new Vehiculo("red");
        // carro2.anio=2020;
        // carro2.marca="Mazda";
        // carro2.modelo="CX-3";
        // carro2.ruedas=4;

        // Vehiculo carro3 = new Vehiculo("green", 6);
        // carro3.anio=2020;
        // carro3.marca="Mazda";
        // carro3.modelo="CX-3";

        // Vehiculo carro4 = new Vehiculo("white", "Honda", "Model");
        // carro4.anio=2020;
        // carro4.ruedas=4;


        // System.out.println("Marca carro1 "+carro1.marca);
        // System.out.println("Marca carro2 "+carro2.marca);
        // System.out.println("Color carro1 "+carro1.color);
        // System.out.println("Marca carro2 "+carro2.color);
        // System.out.println("Color carro3 "+carro3.color+" Ruedas carro3 "+carro3.ruedas);
        // System.out.println("Color carro4 "+carro4.color+" Marca carro4 "+carro4.marca+" Modelo carro4 "+carro4.modelo);

        Vehiculo bicicleta=new Vehiculo();
        Vehiculo auto = new Vehiculo();

        bicicleta.setruedas(2);
        bicicleta.setcolor("negro");
        int biciRuedas=bicicleta.getruedas();
        String bicolor= bicicleta.getcolor();

        System.out.println(biciRuedas+bicolor);

        auto.setruedas(4);
        auto.setcolor("azul");
        int autoRuedas=auto.getruedas();
        String autocolor= auto.getcolor();

        System.out.println(autoRuedas+autocolor);

        Vehiculo auto2 = new Vehiculo("red", "honda", "nis");


    }
}
