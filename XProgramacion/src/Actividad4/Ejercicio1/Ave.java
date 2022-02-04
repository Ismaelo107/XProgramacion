package Actividad4.Ejercicio1;

public class Ave {

    private int patas;
    private String color;
    private String pico;

    public Ave(int patas, String color, String pico) {
        this.patas = patas;
        this.color = color;
        this.pico = pico;

    }

    public int getPatas() {
        return patas;
    }

    public String getColor() {
        return color;
    }

    public String getPico() {
        return pico;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPico(String pico) {
        this.pico = pico;
    }

    public String imprimirAve() {
        return this.patas + " " + this.color + " " + this.pico;
    }
}


