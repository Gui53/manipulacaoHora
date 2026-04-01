package model;

public class Relogio {

    private int hora;
    private int minuto;
    private int segundo;

    public Relogio() {
        this(0, 0, 0);
    }

    public Relogio(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int tempoSegundos() {
        return ((hora * 60 * 60) + (minuto * 60) + segundo);
    }

    public String incrementaSegundo() {
        int hora = 0;
        int minS = 0;
        
        while (minuto > 59){
            minuto = minuto - 60;
            hora += 1;
        }
        
        while (segundo > 59) {
            segundo = segundo - 60;
            minuto+=1;
        }
        
        return hora + ":"+minuto + ":" + segundo;

    }
}
