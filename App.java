public class App {
    public static void main(String[] args) {
        Ponto ponto1 = new Ponto(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
        Ponto ponto2 = new Ponto(Double.parseDouble(args[2]), Double.parseDouble(args[3]));
        Ponto ponto3 = new Ponto(Double.parseDouble(args[4]), Double.parseDouble(args[5]));
    
        Triangulo triangulo = new Triangulo(ponto1, ponto2, ponto3);

        // System.out.println(triangulo.distanciaLado1());
        // System.out.println(triangulo.distanciaLado2());
        System.out.println(triangulo.perimetro());
    }   
}
