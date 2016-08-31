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

  public abstract class Factory 
  {
     protected abstract AppFactory factoryMethod(String tipoCompu);
   
   public AppFactory createApp(String tipoApp)
   {
       AppFactory a = factoryMethod(tipoApp);
       a.concepcion();
       a.diseño();
       a.planificacion();
       a.produccion();
       a.pruebas();
       return a;
   }
   
    
 static Factory getInstance()
    {
        if(singleton== null)
        {
            singleton =new Factory() {
                 @Override
                  protected AppFactory factoryMethod(String tipoApp) {
                    AppFactory a;
        switch (tipoApp)
                {
                case "Juegos":
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
            };
     
        }
         return singleton;
    }
 
        private static Factory singleton;
}

