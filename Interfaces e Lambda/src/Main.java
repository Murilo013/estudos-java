import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int option = 0;
        GeometricForm geometricForm = null;

        while(true){
            System.out.println("---- Escolha a forma geometrica para calcular a área ----");
            System.out.println("1 - QUADRADO");
            System.out.println("2 - RETÂNGULO");
            System.out.println("3 - CIRCULO");
            System.out.println("4 - FECHAR PROGRAMA");

            option = scanner.nextInt();

            if(option == 1){
                geometricForm = createSquare();
            }else if(option == 2){
                geometricForm = createRectangle();
            }
            else if(option == 3){
                geometricForm = createCircle();
            }else if(option == 4){
                break;
            }
            else{
                System.out.println("Opção inválida");
                continue;
            }

            System.out.println("Resultado - > " + geometricForm.getArea());
        }
    }

    private static GeometricForm createSquare(){
        System.out.println("Infome o tamanho dos lados:");
        var side = scanner.nextDouble();

        return new Square(side);
    }

    private static GeometricForm createRectangle(){
        System.out.println("Infome a altura do retangulo");
        var altura = scanner.nextDouble();
        System.out.println("Infome a base do retangulo");
        var base = scanner.nextDouble();

        return new Rectangle(altura, base);
    }

    private static GeometricForm createCircle(){
        System.out.println("Infome o valor do raio");
        var raio = scanner.nextDouble();

        return new Circle(raio);
    }
}