package ru.neoflex.lessons;

public class Square extends Figure {
    private int a;
    private String name = "Квадрат";

    @Override
    public String getName() {
        return this.name;
    }

    public Square(int x, int y, int... sizes) {
        super(x, y, sizes);
        this.a = sizes[0];
    }

    @Override
    public double getAreaSquare() {
        return Math.pow(this.a, 2);
    }

    @Override
    String getInfo() {
        System.out.println("Фигура добавлена на холст: ");
        return getName() + " с точкой позиционирования [" + this.x + ";" + this.y + "], длиной стороны [" + this.a + "] имеет площадь - [" + getAreaSquare() + "]";
    }

    @Override
    public int getSizeX() {
        int tmpX = this.x + a;
        return tmpX;
    }

    @Override
    public int getSizeY() {
        int tmpY = this.y + a;
        return tmpY;
    }
}
