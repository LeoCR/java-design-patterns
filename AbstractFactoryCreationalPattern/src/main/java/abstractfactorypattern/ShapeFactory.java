package abstractfactorypattern;
import abstractf.factorypattern.color.Color;
import abstractf.factorypattern.shape.Circle;
import abstractf.factorypattern.shape.Rectangle;
import abstractf.factorypattern.shape.Shape;
import abstractf.factorypattern.shape.Square;

public class ShapeFactory extends AbstractFactory {	
   @Override
   public Shape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }
      if(shapeType.equalsIgnoreCase("CIRCLE")){
         return new Circle();        
      }
      else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
      }
      else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }
      return null;
   }
   
   @Override
   Color getColor(String color) {
      return null;
   }
    
}
