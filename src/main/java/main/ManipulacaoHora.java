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

        System.out.println("Digite os segundos");
        relogio.setSegundo(Integer.parseInt(sc.nextLine()));

        System.out.println("Digite os minutos");
        relogio.setMinuto(Integer.parseInt(sc.nextLine()));

        System.out.println("Digite as horas");
        relogio.setHora(Integer.parseInt(sc.nextLine()));

        relogio.incrementaTempo();

        System.out.println(relogio.formato());

        System.out.println("Digite as horas que você quer decrementar:");
        relogio.setDecrementaHora(Integer.parseInt(sc.nextLine()));

        System.out.println("Digite os minutos que você quer decrementar:");
        relogio.setDecrementaMinuto(Integer.parseInt(sc.nextLine()));

        System.out.println("Digite os segundos que você quer decrementar:");
        relogio.setDecrementaSegundo(Integer.parseInt(sc.nextLine()));

        
        relogio.decrementaTempo();

        System.out.println(relogio.formato());
    }
}
