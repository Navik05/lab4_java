import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int type, i;
        double e, s = 0, p = 0;
        double[] sides = new double[3];
        square one = null;
        circle two = null;
        triangle three = null;
        Scanner in = new Scanner(System.in);
        System.out.print("\n1-квадрат\n2-круг\n3-треугольник\nВыберите фигуру:");
        type = in.nextInt();
        //Ввод и обработка
        switch (type) {
            case 1:
                System.out.print("Длина стороны квадрата:");
                e = in.nextDouble();
                one = new square(e);
                one.workSquare();
                break;
            case 2:
                System.out.print("Радиус круга:");
                e = in.nextDouble();
                two = new circle(e);
                two.workCircle();
                break;
            case 3:
                System.out.print("Длина сторон треугольника:");
                for (i = 0; i < 3; i++) {
                    sides[i] = in.nextDouble();
                }
                three = new triangle(sides);
                three.workTriangle();
            default:;
        }
        //Вывод результатов
        System.out.print("Фигура: ");
        switch (type) {
            case 1:
                System.out.print("квадрат");
                e = one.getDiagonal();
                System.out.printf("\nДиагональ: %f", e);
                s = one.getArea();
                p = one.getPerimeter();
                break;
            case 2:
                System.out.println("круг");
                e = two.getD();
                System.out.printf("Диаметр: %f", e);
                s = two.getArea();
                p = two.getPerimeter();
                break;
            case 3:
                i = three.getView();
                switch (i) {
                    case 1:
                        System.out.print("равносторонний ");
                        break;
                    case 2:
                        System.out.print("равнобедренный ");
                        break;
                    case 3:
                        System.out.print("разносторонний ");
                        break;
                    default:
                        ;
                }
                System.out.print("треугольник");
                s = three.getArea();
                p = three.getPerimeter();
                break;
        }
        System.out.printf("\nПлощадь: %f", s);
        System.out.printf("\nПериметр: %f\n", p);
    }
}