package abstractfactorypattern;

import abstractf.factorypattern.color.Color;
import abstractf.factorypattern.shape.Shape;

public abstract class AbstractFactory {
   abstract Color getColor(String color);
   abstract Shape getShape(String shape) ;
}