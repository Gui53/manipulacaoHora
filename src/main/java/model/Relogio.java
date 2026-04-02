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
        int minS = 0;

        while (hora > 23) {
            hora = hora - 24;
        }

        while (minuto > 59) {
            minuto = minuto - 60;
            hora += 1;
        }
        while (segundo > 59) {
            segundo = segundo - 60;
            minuto += 1;
        }

        if (segundo < 10 && segundo >= 0 && minuto < 10 && minuto >= 0 && hora < 10 && hora >= 0) {
            return "Tempo: 0" + hora + ":0" + minuto + ":0" + segundo;

        } else {
            if (segundo < 10 && segundo >= 0 && minuto < 10 && minuto >= 10) {
                return "Tempo: " + hora + ":0" + minuto + ":0" + segundo;
            } else {
                if (minuto < 10 && minuto >= 0 && hora < 10 && hora <= 0) {
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
