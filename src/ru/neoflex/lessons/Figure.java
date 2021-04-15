package ru.neoflex.lessons;

public abstract class Figure {
    protected int x;
    protected int y;


    public Figure(int x, int y, int... sizes) {
        this.x = x;
        this.y = y;
    }

    public abstract double getAreaSquare();

    public abstract String getName();

    abstract String getInfo();

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public abstract int getSizeX1();
    public abstract int getSizeX2();

    public abstract int getSizeY1();
    public abstract int getSizeY2();

}
