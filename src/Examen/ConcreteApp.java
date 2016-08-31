/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

/**
 *
 * @author Carlos
 */
public class ConcreteApp extends Factory
{
   @Override
    protected AppFactory factoryMethod(String tipoApp) {
        AppFactory a;
        switch (tipoApp)
                {
                case "juegos":
                        a = new Juegos();
                        break;
                case  "fitness":   
                    a= new Fitness();
                    break;
                case "idiomas":
                    a= new Idiomas();
                    break;
                case "Musica":
                    a=new Musica();
                    break;
                    default :
                        a = null;
                        break;
                    }      
                 return a;
                }
}
