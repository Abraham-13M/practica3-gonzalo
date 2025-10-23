public class TrianguloEquilatero {
    
    // Método para calcular el perímetro de un triángulo equilátero
    public static double calcularPerimetro(double lado) {
        return 3 * lado;
    }

    // Método para calcular el área de un triángulo equilátero
    public static double calcularArea(double lado) {
        return (Math.sqrt(3) / 4) * Math.pow(lado, 2);
    }

    // Método principal
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la longitud del lado del triángulo equilátero: ");
        double lado = entrada.nextDouble();

        double perimetro = calcularPerimetro(lado);
        double area = calcularArea(lado);

        System.out.println("\nResultados:");
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Área: " + area);

        entrada.close();
    }
}
