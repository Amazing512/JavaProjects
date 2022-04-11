/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author mathe
 */
public class Ponto3D extends Ponto2D{
    private double z;

    public Ponto3D(double z, double x, double y) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    
    @Override
    public String toString()
    {
        String texto2D = super.toString();
        return (texto2D + ", z = " + z);
        
    }
    
}
