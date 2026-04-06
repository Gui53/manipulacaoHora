package model;

public class Relogio {

    private int hora;
    private int decrementaHora;
    private int minuto;
    private int decrementaMinuto;
    private int segundo;
    private int decrementaSegundo;

    public Relogio() {
        this(0, 0, 0, 0, 0, 0);
    }

    public Relogio(int hora, int decrementaHora, int minuto, int decrementaMinuto, int segundo, int decrementaSegundo) {
        this.hora = hora;
        this.decrementaHora = decrementaHora;
        this.minuto = minuto;
        this.decrementaMinuto = decrementaMinuto;
        this.segundo = segundo;
        this.decrementaSegundo = decrementaSegundo;
    }

    public int getDecrementaHora() {
        return decrementaHora;
    }

    public void setDecrementaHora(int decrementaHora) {
        this.decrementaHora = decrementaHora;
    }

    public int getDecrementaMinuto() {
        return decrementaMinuto;
    }

    public void setDecrementaMinuto(int decrementaMinuto) {
        this.decrementaMinuto = decrementaMinuto;
    }

    public int getDecrementaSegundo() {
        return decrementaSegundo;
    }

    public void setDecrementaSegundo(int decrementaSegundo) {
        this.decrementaSegundo = decrementaSegundo;
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

    public void incrementaTempo() {
        
        minuto += segundo / 60;
        segundo = segundo % 60;

        hora += minuto / 60;
        minuto = minuto % 60;

        hora = hora % 24;

    }

    public void decrementaTempo() {
        hora = (hora - decrementaHora) % 24;

        if (hora < 0) {
            hora += 24;
        }

        minuto = (minuto - decrementaMinuto) % 60;

        if (minuto < 0) {
            minuto += 60;
        }

        segundo = (segundo - decrementaSegundo) % 60;

        if (segundo < 0) {
            segundo += 60;
        }
    }

    public String formato() {
        if (segundo < 10 && segundo >= 0 && minuto < 10 && minuto >= 0 && hora < 10 && hora >= 0) {
            return "Tempo: 0" + hora + ":0" + minuto + ":0" + segundo;

        } else {
            if (segundo < 10 && segundo >= 0 && minuto < 10 && minuto >= 0) {
                return "Tempo: " + hora + ":0" + minuto + ":0" + segundo;
            } else {
                if (minuto < 10 && minuto >= 0 && hora < 10 && hora >= 0) {
                    return "Tempo: 0" + hora + ":0" + minuto + ":" + segundo;

                } else {
                    if (hora < 10 && hora >= 0 && segundo < 10 && segundo >= 0) {
                        return "Tempo: 0" + hora + ":" + minuto + ":0" + segundo;

                    } else {
                        if (hora < 10 && hora >= 0) {
                            return "Tempo: 0" + hora + ":" + minuto + ":" + segundo;

                        } else {
                            if (minuto < 10 && minuto >= 0) {
                                return "Tempo: " + hora + ":0" + minuto + ":" + segundo;

                            } else {
                                if (segundo >= 0 && segundo < 10) {
                                    return "Tempo: " + hora + ":" + minuto + ":0" + segundo;

                                } else {
                                    return "Tempo: " + hora + ":" + minuto + ":" + segundo;

                                }

                            }

                        }
                    }
                }
            }
        }
    }
}
