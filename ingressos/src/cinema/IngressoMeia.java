package cinema;

public non-sealed class IngressoMeia extends Ingresso {

    @Override
    public double getPrice() {
        return (price / 2) * person; 
    }

    

}
