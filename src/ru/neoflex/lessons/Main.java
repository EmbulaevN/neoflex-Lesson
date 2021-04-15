package ru.neoflex.lessons;

public class Main {

    public static void main(String args[]) {
        GraphicsEditor graphicsEditor = new GraphicsEditor(100, 100);

        // С помощью рефлексии получаем экземпляры классов фигур Круг, Квадрат, Прямоугольник

        User circle = User.getFigureCircle();

       /* final Method method = Z.class.getMethod("something");
        if (method.isAnnotationPresent(Name.class)) {
            final Annotation annotation = method.getAnnotation(Name.class);
            final Name name = (Name) annotation;
            System.out.println(name.myName()); // Prints George
        }*/
        Circle circle = User.getFigureCircle();
        Square square = User.getFigureSquare();
        Rectangle rectangle = User.getFigureRectangle();

        // Пытаемся добавить их на холст
        try {
            graphicsEditor.addFigureToCanvas(circle);
        } catch (GraphicEditorException e) {
            e.printStackTrace();
        }

        try {
            graphicsEditor.addFigureToCanvas(square);
        } catch (GraphicEditorException e) {
            e.printStackTrace();
        }

        try {
            graphicsEditor.addFigureToCanvas(rectangle);
        } catch (GraphicEditorException e) {
            e.printStackTrace();
        }

    }
}






