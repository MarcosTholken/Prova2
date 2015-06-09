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
public class PoligonalFechada extends Poligonal{
    public PoligonalFechada(int vertic){
        super(vertic +1);
    }
    
    @Override
    public double getComprimento(){
        double comprimento;
        comprimento = super.getComprimento();
        //comprimento += get(0).dist(get(getN()-1));
        
        return comprimento;
    }

}
