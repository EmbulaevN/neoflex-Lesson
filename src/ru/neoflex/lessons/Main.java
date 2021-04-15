package ru.neoflex.lessons;

import java.util.Map;
import java.lang.reflect.Method;
import java.util.HashMap;


public class Main {

    private static final Map<String, Method> shapes = new HashMap<>();
    private static final User user = new User();

    static {
        for (Method m : user.getClass().getDeclaredMethods()) {
            if (m.isAnnotationPresent(Shape.class)) {
                Shape shape = m.getAnnotation(Shape.class);
                shapes.put(shape.name(), m);
            }
        }
    }


    public static void main(String args[]) {
        GraphicsEditor graphicsEditor = new GraphicsEditor(100, 100);

        /*Method m1 = shapes.get("Круг");
        Shape shape1 = m1.getAnnotation(Shape.class);
        String name1 = shape1.name();
        int x = shape1.pointX();
        int y = shape1.pointY();
        int[] radius = shape1.parametersShape();
        System.out.println(name1);
        System.out.println(x + " " + y + " " + radius[0]);

        Method m2 = shapes.get("Квадрат");
        Shape shape2 = m2.getAnnotation(Shape.class);
        String name2 = shape2.name();
        int x2 = shape2.pointX();
        int y2 = shape2.pointY();
        int[] a2 = shape2.parametersShape();
        System.out.println(name2);
        System.out.println(x2 + " " + y2 + " " + a2[0]);

        Method m3 = shapes.get("Прямоугольник");
        Shape shape3 = m3.getAnnotation(Shape.class);
        String name3 = shape3.name();
        int x3 = shape3.pointX();
        int y3 = shape3.pointY();
        int[] a3 = shape3.parametersShape();
        System.out.println(name3);
        System.out.println(x3 + " " + y3 + " " + a3[0] + " " + a3[1]);*/




        // Пытаемся добавить их на холст
        try {
            graphicsEditor.addFigureToCanvas(new Circle(5,5,1));
        } catch (GraphicEditorException e) {
            e.printStackTrace();
        }

       try {
            graphicsEditor.addFigureToCanvas(new Square(5,5,1));
        } catch (GraphicEditorException e) {
            e.printStackTrace();
        }

        try {
            graphicsEditor.addFigureToCanvas(new Rectangle(5,5,1,5));
        } catch (GraphicEditorException e) {
            e.printStackTrace();
        }

    }
}






