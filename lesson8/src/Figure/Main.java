package Figure;
//Написать иерархию классов «Фигуры».
//Фигура -> Треугольник -> Прямоугольник -> Круг.
//Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет
//периметра.
//Создать массив из 5 фигур.
//Вывести на экран сумму периметра всех фигур в массиве.

public class Main {

    public static void main(String[] args) {
        double all_perimeter = 0;
        Figure[] figure = {new Rectangle(8, 12),
                new Triangle(5, 8, 5),
                new Circle(10)};

        for (Figure fig : figure) {
            System.out.println(fig.getName() + ": area = " + fig.getArea());
            all_perimeter += fig.getPerimeter();
        }

        System.out.println("Общий периметр равен " + all_perimeter);
    }
}