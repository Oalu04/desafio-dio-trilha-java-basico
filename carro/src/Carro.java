public class Carro {
    private int march = 0;

    private int speed = 0;

    private boolean carState = false;

    public int getMarch() {
        return march;
    }

    public void setMarch(int march) {
        this.march = march;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isCarState() {
        return carState;
    }

    public void setCarState(boolean carState) {
        this.carState = carState;
        if (carState) {
            System.out.println("Carro ligado");
        }
    }

    public void accelerate() {
        if (march != 0) {
            if(this.speed >= 0 && this.speed < 20 && this.march != 1) {
                System.out.println("Engate a 1° para prosseguir nessa velocidade");
            }
            else if (this.speed >= 20 && this.speed < 40 && this.march != 2) {
                System.out.println("Mude para 2° marcha para prosseguir nessa velocidade");
            } else if (this.speed >= 40 && this.speed < 60 && this.march != 3) {
                System.out.println("Mude para 3° marcha para prosseguir nessa velocidade");
            } else if (this.speed >= 60 && this.speed < 80 && this.march != 4) {
                System.out.println("Mude para 4° marcha para prosseguir nessa velocidade");
            } else if (this.speed >= 80 && this.speed < 100 && this.march != 5) {
                System.out.println("Mude para 5° marcha para prosseguir nessa velocidade");
            } else if (this.speed >= 100 && this.speed < 400 && this.march != 6) {
                System.out.println("Mude para 6° marcha para prosseguir nessa velocidade");
            } else if (this.speed == 400) {
                System.out.println("Velocidade maxima atingida");
            } else {
                this.speed += 5;
            }

        }
        if (!carState) {
            System.out.println("O carro está desligado, ligue-o primeiro.");
            return;
        } if(this.march == 0) {
            System.out.println("Marcha em ponto morto, engate a primeira para se mover.");
            return;
        }

    }

    public void decelerate() {
        if (!carState) {
            System.out.println("O carro está parado");
            return;
        } else if (this.speed == 0) {
            System.out.println("O carro está parado");
        }

        if (this.speed < 40 && this.speed > 20 && this.march != 2) {
            System.out.println("Mude para 2° marcha para prosseguir nessa velocidade");
        } else if (this.speed <= 60 && this.speed > 40 && this.march != 3) {
            System.out.println("Mude para 3° marcha para prosseguir nessa velocidade");
        } else if (this.speed <= 80 && this.speed > 60 && this.march != 4) {
            System.out.println("Mude para 4° marcha para prosseguir nessa velocidade");
        } else if (this.speed <= 100 && this.speed > 80 && this.march != 5) {
            System.out.println("Mude para 5° marcha para prosseguir nessa velocidade");
        } else if (this.speed <= 120 && this.speed > 100 && this.march != 6) {
            System.out.println("Mude para 6° marcha para prosseguir nessa velocidade");
        } else {
            this.speed -= 5;
        }
    }

    public boolean verifyTurnLeftRight() {
        if (carState) {
            return true;
        } else if (speed > 40) {
            System.out.println("Não será possivel virar para esta direção nessa velocidade, diminua primeiro.");
            return false;
        } else {
            System.out.println("O carro esta parado, acelere primeiro.");
            return false;
        }
    }

    public void upgradeMarch() {
        if (this.march == 6) {
            System.out.println("Não é possivel ir além da sexta marcha.");
            return;
        } else {
            this.march += 1;
            System.out.println(this.march + " marcha");
        }
    }

    public void downGradeMarch() {

        if (this.march == 0) {
            System.out.println("A marcha está em neutra");
            return;
        } else {
            this.march -= 1;
            System.out.println(this.march + " marcha");
        }
    }

}
