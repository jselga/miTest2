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
public class Cotxe {

    private String marca;
    private int cilindrada;
    private double preu;
    public static int cont=10;
/**
 *Constructor buit, deixa crear un cotxe sense inicialitzar parametres    
 **/
    public Cotxe(){
    cont++;
    }
    public Cotxe (String marca, int cilindrada){
        this.marca=marca;
        setCilindrada(cilindrada);
        this.preu=-1.56;
        cont++;
    }
    public Cotxe(String marca, int cilindrada, double preu) {
        
        this.marca = marca;
        setCilindrada(cilindrada);
        this.preu = preu;
        cont++;
    }
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        if(cilindrada>0){
        this.cilindrada = cilindrada;
        }else {
            this.cilindrada=-1;
        }
        
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public void mostra() {
        System.out.printf("Cotxe:\nMarca=%s\nCilindrada=%d\nPreu=%.2f\n",
                marca, cilindrada, preu);
        System.out.println("Nombre d'instancies creades: " + cont);
    }

    public void mostra(boolean llista) {
        if (llista) {
            System.out.printf("%-20s %10d %10.2f\n",
                    marca, cilindrada, preu);
        } else {
            mostra();
        }
    }

}
