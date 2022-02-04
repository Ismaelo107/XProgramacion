package Actividad4.Ejercicio1;

public class Pato extends Ave{
    private String volar;
    private String nadar;
    private String pescar;

    public Pato(int patas,String color, String pico, String volar, String nadar, String pescar){
        super(patas, color, pico);
        this.volar = volar;
        this.nadar = nadar;
        this.pescar = pescar;
    }

    public void setVolar(String volar) {
        this.volar = volar;
    }

    public void setNadar(String nadar) {
        this.nadar = nadar;
    }

    public void setPescar(String pescar) {
        this.pescar = pescar;
    }

    public String getVolar(){
        return volar;
    }
    public String getNadar(){
        return nadar;
    }
    public String getPescar(){
        return pescar;
    }
}
