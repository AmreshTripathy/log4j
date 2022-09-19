package com.practice.java_practice;
/*
 * @Amresh Tripathy
 */
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodDemo {
   public static void main(String[] args) 
      throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

      Method[] methods = SampleClass.class.getMethods();
      SampleClass sampleObject = new SampleClass();
      System.out.println(methods[1].getName());
      methods[1].invoke(sampleObject, "data");
      System.out.println(methods[0].invoke(sampleObject));
   }
}

class SampleClass {
   private String sampleField;

   public String getSampleField() {
      return sampleField;
   }

   public void setSampleField(String sampleField) {
      this.sampleField = sampleField;
   } 
}
