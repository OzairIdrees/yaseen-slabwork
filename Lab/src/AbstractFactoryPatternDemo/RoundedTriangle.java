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
public class RoundedTriangle implements Shape {
       @Override
   public void draw() {
      System.out.println("Inside RoundedTriangle::draw() method.");
   }
}