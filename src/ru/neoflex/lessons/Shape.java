package ru.neoflex.lessons;

/*TODO:Добавить аннотацию, для каждой фигуры (методы с параметрами).
 общие параметры для всех фигур. При создании определенной фигуры, указываются параметры, относящиеся к ней.*/
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //Указывает, что наша Аннотация может быть использована во время выполнения через Reflection (нам как раз это нужно).
@Target(ElementType.METHOD) //Указывает, что целью нашей Аннотации является метод (не класс, не переменная, не поле, а именно метод).


public @interface Shape
{
    String name(); //имя фигуры

    int pointX(); //точка привязки по Х

    int pointY(); //точка привязки по Y

    int[] parametersShape(); // Массив параметров фигур. Для круга 0й элемент - радиус, для кадрата сторона, для прямоугольника сторона А, сторона Б - 1й элемент.

}



