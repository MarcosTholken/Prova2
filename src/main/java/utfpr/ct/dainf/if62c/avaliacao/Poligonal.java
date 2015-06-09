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
public class Poligonal {
    private int vertic = 0;
    private Ponto2D vertices[];
    
    public Poligonal(){
        
    }
    
    public Poligonal(int v){
        if(v <= 2){
            throw new RuntimeException("Poligonal deve ter ao menos 2 vértices");
        }
        Ponto2D[] vertices = new Ponto2D[v];
        vertic = v;

    }
    
    public int getN(){
        return vertic;
    }
    
    public Ponto2D get(int indice){
        if(indice <0 || indice >= getN()){
            return null;
        }
        else
            return vertices[indice];
    }
    
    public double getComprimento(){
        double comprimento = 0;
        
        for(int i=0; i< vertic -1; i++){
            comprimento += vertices[i].dist(vertices[i+1]);
        }
        return comprimento;
    }
}
