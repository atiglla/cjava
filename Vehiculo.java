class Vehiculo{
    public int anio;
    public String marca;
    public String modelo;
    public String color;
    public int ruedas;

    public Vehiculo(){
    };

    public Vehiculo(String color_nuevo){
        this.color =color_nuevo;
    };

    public Vehiculo(String color, int ruedas){
        this.color=color;
        this.ruedas=ruedas;
    };

    public Vehiculo(String color, String marca, String modelo){
        this.color=color;
        this.marca=marca;
        this.modelo=modelo;
    };
}