class Vehiculo{

    //variables mienbro, atributos en python
    
    private int anio;
    private String marca;
    private String modelo;
    private String color;
    private int ruedas;

    public Vehiculo(){
        cantidadVehiculo++;
    };

    private static int cantidadVehiculo=0;//Static-- pertenece a la clase


    public Vehiculo(String color_nuevo){
        this.color =color_nuevo;
        cantidadVehiculo++;
    };

    public Vehiculo(String color, int ruedas){
        this.color=color;
        this.ruedas=ruedas;
        cantidadVehiculo++;
    };

    public Vehiculo(String color, String marca, String modelo){
        this.color=color;
        this.marca=marca;
        this.modelo=modelo;
        cantidadVehiculo++;
    };

    public int getanio(){
        return anio;
    }
    public void setanio(int anio){
        this.anio=anio;
    }

    public String getmarca(){
        return marca;
    }
    public void setmarca(String marca){
        this.marca=marca;
    }

    public String getmodelo(){
        return modelo;
    }
    public void setmodelo(String modelo){
        this.modelo=modelo;
    }

    public String getcolor(){
        return color;
    }
    public void setcolor(String color){
        this.color=color;
    }

    public int getruedas(){
        return ruedas;
    }
    public void setruedas(int ruedas){
        this.ruedas=ruedas;
    }

    public static int getCandidadVehiculo() {
        return cantidadVehiculo;
    }

}