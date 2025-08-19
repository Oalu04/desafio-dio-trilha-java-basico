package cinema;

public non-sealed class IngressoFamilia extends Ingresso {

    @Override
    public double getPrice() {
        double total = price * person;

        if (person >= 3) {
            total = total - (total * 0.05);
        }

        return total;
    }

    
}
