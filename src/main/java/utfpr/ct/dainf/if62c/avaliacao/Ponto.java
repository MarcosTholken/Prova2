package utfpr.ct.dainf.if62c.avaliacao;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Segunda avaliação parcial 2014/2.
 * @author 
 */
public class Ponto {
    public double x, y, z;

    /**
     * Retorna no nome não-qualificado da classe.
     * @return O nome não qualificado da classe.
     */
    

    
    public String getNome() {
        return getClass().getSimpleName();
    }

    public double getX() {
        x= 0;
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        y = 0;
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        z = 0;
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.x) ^ (Double.doubleToLongBits(this.x) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.y) ^ (Double.doubleToLongBits(this.y) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.z) ^ (Double.doubleToLongBits(this.z) >>> 32));
        return hash;
    }
    
    public Ponto(){
    }
    
    public Ponto(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    @Override
     public String toString() {
        return String.format("%f, %f, %f", x, y, z);
    }
     
    
     
     public double dist(Ponto p){
         double dist;
         double xt, yt, zt;
         double soma;
         
         xt = p.x - x;
         yt = p.y - y;
         zt = p.z - z;
         
         soma = Math.pow(xt, 2) + Math.pow(yt, 2) + Math.pow(zt, 2);
         
         dist = Math.sqrt(soma);
         
         return dist;   
         
     }

}
