public class Circulo implements Prototype {

    private int x;
    private int y;
    private int raio;
    /**
     * @param x
     * @param y
     * @param raio
     */
    public Circulo(int x, int y, int raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public Circulo(Circulo source){

        this.x = source.x;
        this.y = source.y;
        this.raio = source.raio;

    }

    public Prototype clonar(){

        return new Circulo(this);


    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "Circulo [raio=" + raio + ", x=" + x + ", y=" + y + "]";
    }

    
    
}
