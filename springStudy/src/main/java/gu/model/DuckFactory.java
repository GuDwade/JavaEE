package gu.model;

public class DuckFactory {

    //静态工厂
    public static Duck create(){
        return new Duck("唐老鸭",12);
    }

    //s实例工厂

    public Duck createDuck(){
        return new Duck("丑小鸭",11);
    }
}