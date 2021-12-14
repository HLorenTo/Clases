package clases;
public class Automovil {
    private String marca;
    private String color;
    private int modeloanio;

    public String getMarca() { //obtiene un tipo string de automovil creado
       
        return marca; // retornar la marca
    }

    public void setMarca(String marca) { // asigna el valor a la marca de tipo string
        this.marca = marca; // auto1.setMarca (asignacion de un valor== mazda ford, toyota)
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModeloanio() {
        return modeloanio;
    }

    public void setModeloanio(int modeloanio) {
        this.modeloanio = modeloanio;
    }
    
}
