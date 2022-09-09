package Rectangle;
public class Main {
   public static void main(String[] args){
      Rectangle rectangle = new Rectangle(10, 5);

      rectangle.getArea();
      rectangle.getPerimeter();
      System.out.println(rectangle.getArea());

      rectangle.setWidth(100);
   }
}
