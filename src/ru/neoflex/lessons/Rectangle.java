package ru.neoflex.lessons;

public class Rectangle extends Figure {
    private int a;
    private int b;
    private String name = "Прямоугольник";

    @Override
    public String getName() {
        return this.name;
    }

    public Rectangle(int x, int y, int... sizes) {
        super(x, y, sizes);
        this.a = sizes[0];
        this.b = sizes[1];
    }

    @Override
    public double getAreaSquare() {
        return (double)(this.a * this.b);
    }

    @Override
    String getInfo() {
        System.out.println("Фигура добавлена на холст: ");
        return getName() + " с точкой позиционирования [" + this.x + ";" + this.y + "], длинами сторон [" + this.a + ";" + this.b + "] имеет площадь - [" + getAreaSquare() + "]";
    }
    @Override
    public int getSizeX() {
        return this.x + a;
    }

    @Override
    public int getSizeY() {
        return this.y + b;
    }
}
