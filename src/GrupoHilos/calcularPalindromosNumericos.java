/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GrupoHilos;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Escuela
 */
public class calcularPalindromosNumericos 
{
    public Set calcularPalindromosNumerico(Integer min, Integer max){
        Set <Integer>listaPalindromos = new HashSet<>();
        for(int i = min; i <= max; i++ ){
            for(int j = min; j <= max; j++){
                Integer res = j*i;
                if(isPalindromo(res))
                    listaPalindromos.add(res);
            }
        }
        return listaPalindromos;
    }
    
    
    public boolean isPalindromo(int numero){
        String palindromo = ReverseString.reverseIt(
                String.valueOf(numero));
 
        if(numero == Integer.parseInt(palindromo))
            return true;
        else
            return false;
    }
   public static void main(String []args){
        Palindromo palindromo = new Palindromo();
        Object[] listaPalindromos = palindromo.calcularPalindromosNumerico
                                (100,999).toArray();
 
        Arrays.sort(listaPalindromos);
        for(Object i : listaPalindromos){
            System.out.println(i);
        }
    } 
    
    
    
    
}
