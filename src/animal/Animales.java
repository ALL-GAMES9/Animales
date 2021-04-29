
/**
 *
 * @author ricas
 */
public abstract class Animales {

    private String nacen;
    private String tamaño;
    private String color;

    public Animales(String nacen, String tamaño, String color) {
        this.nacen = nacen;
        this.tamaño = tamaño;
        this.color = color;
    }

    public String getNacen() {
        return nacen;
    }

    public void setNacen(String nacen) {
        this.nacen = nacen;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
