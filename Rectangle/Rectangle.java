package Rectangle;
public class Rectangle {
    public int width;
    public int height;

    public void setWidth(int width){
        this.width = width;
    }
    public int getWidth(){
        return this.width;
    }
    public int getArea(){
        return (this.width * this.height);
    }
    public int getPerimeter(){
        return ((this.width + this.height) * 2);
    }
    public String display(){
       return "Rectangle ={" + width + " " + height + "}";
    }

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
}
