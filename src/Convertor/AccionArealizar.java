package Convertor;

public class AccionArealizar implements Runnable{
    Conversion c1;
            @Override
            public void run() {
               System.out.println("De decimal a binario"); 
                System.out.println((c1.resultado));
            }
            public void sett1(Conversion c1){
                this.c1 = c1;
            }   

    
}