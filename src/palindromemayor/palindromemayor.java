/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromemayor;

/**
 *
 * @author Escuela
 */
public class palindromemayor 
{
    boolean isPalindrome(integer num)
    {
        String reversa = new String();
        String n = num.toString();
        for (int i = n.length()-1; i >= 0; i--;)
        {
            reversa = reversa + n.charAt(i);
        }
        if
        return true;
    }
    
    public static void main(String[] args) {
        PalindromeMayor p = new PalindromeMayor();
        p.isPalindrome (128);
    }
}
