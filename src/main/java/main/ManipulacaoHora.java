/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import java.util.Scanner;
import model.Relogio;

/**
 *
 * @author guilh
 */
public class ManipulacaoHora {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Relogio relogio = new Relogio();
         
        /*System.out.println("Digite a hora");
        relogio.setHora(Integer.parseInt(sc.nextLine()));
        
        System.out.println("Digite os minutos");
        relogio.setMinuto(Integer.parseInt(sc.nextLine()));
        
        System.out.println("Digite os segundos");
        relogio.setSegundo(Integer.parseInt(sc.nextLine()));
        
        System.out.println(relogio.tempoSegundos());*/
        
        System.out.println("Digite os segundos");
        relogio.setSegundo(Integer.parseInt(sc.nextLine()));
        
        System.out.println("Tempo: " + relogio.incrementaSegundo());
    }
}
