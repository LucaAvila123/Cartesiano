public class Triangulo {
    private Ponto ponto1;
    private Ponto ponto2;
    private Ponto ponto3;

    public Triangulo(Ponto ponto1, Ponto ponto2, Ponto ponto3){
        this.ponto1 = ponto1;
        this.ponto2 = ponto2;
        this.ponto3 = ponto3;
    }

    // public double distanciaLado1(){
    //     return Math.sqrt(Math.pow(ponto2.getAbscissa() - ponto1.getAbscissa(), 2) + Math.pow(ponto2.getOrdenada() - ponto1.getOrdenada(), 2));
    // }
    // public double distanciaLado2(){
    //     return Math.sqrt(Math.pow(ponto3.getAbscissa() - ponto2.getAbscissa(), 2) + Math.pow(ponto3.getOrdenada() - ponto2.getOrdenada(), 2));
    // }
    public double perimetro(){
        double lado1 = Math.sqrt(Math.pow(ponto2.getAbscissa() - ponto1.getAbscissa(), 2) + Math.pow(ponto2.getOrdenada() - ponto1.getOrdenada(), 2));
        double lado2 = Math.sqrt(Math.pow(ponto3.getAbscissa() - ponto2.getAbscissa(), 2) + Math.pow(ponto3.getOrdenada() - ponto2.getOrdenada(), 2));
        double lado3 = Math.sqrt(Math.pow(ponto1.getAbscissa() - ponto3.getAbscissa(), 2) + Math.pow(ponto1.getOrdenada() - ponto3.getOrdenada(), 2));
        
        return lado1 + lado2 + lado3;
    }
}
