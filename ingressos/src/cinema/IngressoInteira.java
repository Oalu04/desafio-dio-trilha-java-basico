package cinema;

public non-sealed class IngressoInteira extends Ingresso{

    @Override
    public double getPrice() {
        return price * person;
    }

    
    

}
