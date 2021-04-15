package ru.neoflex.lessons;

public class GraphicsEditor {
    private int x;
    private int y;
    private boolean[][] canvas;

    public GraphicsEditor(int x, int y) {
        this.x = x;
        this.y = y;
        this.canvas = new boolean[x][y];
    }

    public void addFigureToCanvas(Figure figure) throws GraphicEditorException {

        if (checkAdding(figure)) {
            System.out.println(figure.getInfo());
        } else {
            throw new GraphicEditorException("Невозможно добавить фигуру " + figure.getName() + " на холст. Проверьте размеры фигуры и ее расположение на холсте.");

        }
    }

    private boolean checkAdding(Figure figure) {
        return checkPoint(figure.getX(), figure.getY()) && checkFigureSizeRB(figure) && checkFigureSizeTL(figure);
    }


    private boolean checkPoint(int x, int y) {
        return (x <= canvas.length) && (y <= canvas[0].length);
    }

    private boolean checkFigureSizeRB(Figure figure) {
        return ((figure.getSizeX1() <= canvas.length) && (figure.getSizeY1() <= canvas[0].length));
    }

    private boolean checkFigureSizeTL(Figure figure) {
        return ((figure.getSizeX2() >= 0) && (figure.getSizeY2() >= 0));
    }

}
