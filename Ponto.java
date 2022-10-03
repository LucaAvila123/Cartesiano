public class Ponto {
    private double abscissa;
    private double ordenada;
    
    //construtor implícito
    public Ponto(double abscissa, double ordenada){
        this.abscissa = abscissa;
        this.ordenada = ordenada;
    }
    //calcula a distância do ponto para com a origem
    public double moduloOrigem(){
        return Math.sqrt(Math.pow(abscissa, 2) + Math.pow(ordenada, 2));
    }

    public double getAbscissa() {
        return abscissa;
    }
    public double getOrdenada() {
        return ordenada;
    }
}
