/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.avaliacao;

/**
 *
 * @author a1656899
 */
abstract class Ponto2D extends Ponto {
    protected Ponto2D(){
        x=0;
        y=0;
        z=0;
        
    }
    
    protected Ponto2D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    
}
