package MétodosAbstratos;

import java.lang.annotation.Retention;

public class Rectangle extends Shape{

    private Double width;
    private Double height;

    public Rectangle(){
        super();
    }

    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWidth(){
        return width;
    }

    public void setHeight(){
        this.height = height;
    }

    public void setWidth(Double width) {
        this.width = width;
    }


    @Override
    public double area(){
        return width * height;
    }

}
