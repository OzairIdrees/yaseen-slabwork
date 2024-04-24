/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryPatternDemo;

/**
 *
 * @author SP21-BSE-029
 */
public class ShapeFactory extends AbstractFactory {

    public ShapeFactory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   @Override
   public Shape getShape(String shapeType){    
      if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return (Shape) new Rectangle();         
      }else if(shapeType.equalsIgnoreCase("SQUARE")){
         return (Shape) new Square();
      }	 
      return null;
   }
}
