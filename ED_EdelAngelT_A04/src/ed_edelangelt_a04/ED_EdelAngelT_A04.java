/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_edelangelt_a04;

import java.util.*;

/**
 *
 * @author LuisGuillermo
 */
public class ED_EdelAngelT_A04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner size = new Scanner(System.in);
        int n=size.nextInt();
        Binaria main = new Binaria();
        main.setV(main.Random(n));
        main.seleccion();
System.out.println(main.showV());
    }
    
}
