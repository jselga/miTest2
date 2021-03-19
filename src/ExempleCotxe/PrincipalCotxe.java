/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExempleCotxe;

/**
 *
 * @author alfredo & jordi
 */
public class PrincipalCotxe {
       
    public static void main(String[] args) {
        Cotxe cot = new Cotxe("Seat", 1500, 12000);

        cot.mostra();
    
        cot.setPreu(1324.34);
        cot.mostra();
        
        System.out.println("");
        cot.mostra();
      System.out.println("La cilindrada del cotxe 1 és: " + cot.getCilindrada());
//        System.out.println("Cotxe Nou:");
        Cotxe cot2 = new Cotxe("Ford",-100);
        cot2.mostra();
        System.out.println("Salta!");
//        System.out.println(cot2);
//        System.out.println(cot.toString());
        Cotxe cot3 = new Cotxe("F",100);
        cot.mostra();
       
       cot2.setCilindrada(200);
     cot2.mostra(true);
       cot2.setMarca("Ford");
//        cot2.setPreu(1234);
//        cot2.mostra();
//        System.out.println("Salta!");
//        System.out.println(cot.toString());
//        System.out.println(cot2.toString());
//        Cotxe cot3 = new Cotxe("Nose", 2000);

    }
   
}
