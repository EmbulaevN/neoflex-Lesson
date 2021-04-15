package ru.neoflex.lessons;

public class Circle extends Figure {
    private int radius;
    private String name = "Круг";

    public Circle(int x, int y, int... sizes) {
        super(x, y);
        this.radius = sizes[0];
    }

    @Override
    public double getAreaSquare() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    @Override
    String getInfo() {
        System.out.println("Фигура добавлена на холст: ");
        return getName() + " с центром в точке [" + this.x + ";" + this.y + "], радиусом [" + this.radius + "] имеет площадь - [" + getAreaSquare() + "]";
    }

    @Override
    public String getName() {
        return this.name;
    }

    public int getRadius() {
        return this.radius;
    }

    @Override
    public int getSizeX1() {
        return this.x + radius;
    }
    @Override
    public int getSizeX2() {
        return this.x - radius;
    }

    @Override
    public int getSizeY1() {
        return this.y + radius;
    }
    @Override
    public int getSizeY2() {
        return this.y - radius;
    }

}

