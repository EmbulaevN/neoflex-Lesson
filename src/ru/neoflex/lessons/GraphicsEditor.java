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

    public void addFigureToCanvas(Shape figure, double s) throws GraphicEditorException {

        if (checkAdding(figure)) {
            StringBuilder str = new StringBuilder()
                   .append("Фигура добавлена на холст: ")
                   .append(figure.name())
                   .append(" с центром в точке [")
                   .append(figure.pointX())
                   .append(";")
                   .append(figure.pointY());
            if ("Круг".equals(figure.name())) {
                str.append("], радиусом [");
            } else if  ("Квадрат".equals(figure.name())){
                str.append("], стороной [");
            }  else {
                str.append("], со сторонами [");
                str.append(figure.parametersShape()[1])



            }

                   str.append(figure.parametersShape()[0])
                   .append("] имеет площадь - [")
                   .append(s)
                   .append("]"));
        } else {
            throw new GraphicEditorException("Невозможно добавить фигуру " + figure.name() + " на холст. Проверьте размеры фигуры и ее расположение на холсте.");

        }
    }

    private boolean checkAdding(Shape figure) {
        return checkPoint(figure.pointX(), figure.pointY()) && checkFigureSizeRB(figure) && checkFigureSizeTL(figure);
    }


    private boolean checkPoint(int x, int y) {
        return (x <= canvas.length) && (y <= canvas[0].length);
    }

    private boolean checkFigureSizeRB(Shape figure) {
        return ((figure.pointX() + figure.parametersShape()[0] <= canvas.length) && ((figure.pointY() + figure.parametersShape()[0]) <= canvas[0].length));
    }

    private boolean checkFigureSizeTL(Shape figure) {
        if ("Круг".equals(figure.name())){
            return ((figure.pointX() - figure.parametersShape()[0] >= 0) && ((figure.pointY() - figure.parametersShape()[0]) >= 0));
        }
        return true;
    }

}
