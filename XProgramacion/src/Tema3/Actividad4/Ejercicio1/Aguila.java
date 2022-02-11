package Tema3.Actividad4.Ejercicio1;

public class Aguila extends Ave{
    private String volar;
    private String nadar;
    private String pescar;
    private String cazar;

    public Aguila(String patas,String color, String pico, String volar, String nadar, String pescar,String cazar){
        super(patas, color, pico);
        this.volar = volar;
        this.nadar = nadar;
        this.pescar = pescar;
        this.cazar = cazar;
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

    public void setVolar(String volar) {
        this.volar = volar;
    }

    public void setNadar(String nadar) {
        this.nadar = nadar;
    }

    public void setPescar(String pescar) {
        this.pescar = pescar;
    }

    public void setCazar(String cazar) {
        this.cazar = cazar;
    }

    public String getCazar(){
        return pescar;
    }
}

