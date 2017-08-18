/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_edelangelt_a04;


/**
 *
 * @author LuisGuillermo
 */
public class Secuencial extends Fetch{
    int Fecth(int n){
            for(int i=0;i<v.length;i++){
                if(v[i] == n){
                    return n;
                }
            }
            return -1;
        }
    }
