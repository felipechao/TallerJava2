/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryMethod;

/**
 *
 * @author Carlos
 */
public class ConcreteFactory extends Factory
{

    public Computer factoryMethod(String tipoCompu)
    {
        Computer c;
        switch (tipoCompu)
        {
                case "Laptop":
                    c = new Laptop();
                    break;
                case "Netbook":
                    c = new Netbook();
                    break;
                case "Desktop":
                    c = new Desktop();
                    break;
                default:
                    c = null;
                    break;
        }
        return c;
    }
    
}
