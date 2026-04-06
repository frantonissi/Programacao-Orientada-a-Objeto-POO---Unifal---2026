package VeiculoCarga;

public class Veiculo {
    private double carga;
    private double cargaMaxima;

    public Veiculo(double carga, double cargaMaxima) {
        this.carga = carga;
        this.cargaMaxima = cargaMaxima;
    }



    public void setCarga(double carga) {
        if (carga > this.getCargaMaxima()) {
            System.out.println("Erro, carga máxima excedida!");
            System.exit(1); // Encerra todo o programa
            this.carga = 0.0;
        }else {
            this.carga = carga;
        }
    }

    public double getCarga() {
        return this.carga;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

//    public void setCargaMaxima(double cargaMaxima) {
//        this.cargaMaxima = cargaMaxima;
//    }

    public void Veiculo(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public boolean adicionarCaixa(double peso) {
        if (this.getCarga() < this.getCargaMaxima()) {
            return true;
        } else {
            return false;
        }
    }

    private double newtonsQuilos(double peso) {
        return peso * 9.81;
    }

    private double quilosNewton(double peso) {
        return peso / 9.81;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "carga=" + carga +
                ", cargaMaxima=" + cargaMaxima +
                '}';
    }

}
