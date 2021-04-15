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

        Method m1 = shapes.get("Круг");
        Shape shape1 = m1.getAnnotation(Shape.class);
        String name1 = shape1.name();
        int x1 = shape1.pointX();
        int y1 = shape1.pointY();
        int[] radius = shape1.parametersShape();
        double s1 = Math.pow(radius[0], 2) * Math.PI;


        Method m2 = shapes.get("Квадрат");
        Shape shape2 = m2.getAnnotation(Shape.class);
        String name2 = shape2.name();
        int x2 = shape2.pointX();
        int y2 = shape2.pointY();
        int[] a2 = shape2.parametersShape();
        double s2 = Math.pow(a2[0], 2);


        Method m3 = shapes.get("Прямоугольник");
        Shape shape3 = m3.getAnnotation(Shape.class);
        String name3 = shape3.name();
        int x3 = shape3.pointX();
        int y3 = shape3.pointY();
        int[] a3 = shape3.parametersShape();
        double s3 = a3[0] * a3[1];


        // Пытаемся добавить их на холст
        try {
            graphicsEditor.addFigureToCanvas(shape1, s1);
        } catch (GraphicEditorException e) {
            e.printStackTrace();
        }

       try {
            graphicsEditor.addFigureToCanvas(shape2, s2);
        } catch (GraphicEditorException e) {
            e.printStackTrace();
        }

        try {
            graphicsEditor.addFigureToCanvas(shape3, s3);
        } catch (GraphicEditorException e) {
            e.printStackTrace();
        }

    }
}






