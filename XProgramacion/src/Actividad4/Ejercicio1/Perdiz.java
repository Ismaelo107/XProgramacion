package Actividad4.Ejercicio1;

public class Perdiz extends Ave{
    private String volar;
    private String nadar;
    private String cantar;


    public Perdiz(int patas,String color, String pico, String volar, String nadar, String cantar){
        super(patas, color, pico);
        this.volar = volar;
        this.nadar = nadar;
        this.cantar = cantar;
    }

    public void setVolar(String volar) {
        this.volar = volar;
    }

    public void setNadar(String nadar) {
        this.nadar = nadar;
    }

    public void setCantar(String cantar) {
        this.cantar = cantar;
    }

    public String getVolar(){
        return volar;
    }
    public String getNadar(){
        return nadar;
    }
    public String getCantar(){
        return cantar;
    }
}

