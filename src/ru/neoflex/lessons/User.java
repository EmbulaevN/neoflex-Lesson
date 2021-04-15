package ru.neoflex.lessons;

class User {
    @Shape(name = "Круг",
            pointX = 5,
            pointY = 5,
            parametersShape = 100)

    public static void getFigureCircle() {

    }

    @Shape(name = "Прямоугольник",
            pointX = 5,
            pointY = 5,
            parametersShape = {10, 10})

    public static void getFigureRectangle() {

    }

    @Shape(name = "Квадрат",
            pointX = 5,
            pointY = 5,
            parametersShape = 15)

    public static void getFigureSquare() {
    }

}
