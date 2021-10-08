package com.java.designpatterns;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
       Singleton instance1 = Singleton.getInstance();
       System.out.println(instance1);
       
       Singleton instance2 = Singleton.getInstance();
       System.out.println(instance2);
       
       if(instance1.equals(instance2)){
    	   System.out.println("instance1 and instance2 are same objects\n\n");
       }
       
       
       //Thread Safe: ThreadSafeMethod
       
       SingletonSynchronizedMethod instance3  = SingletonSynchronizedMethod.getInstance();
       SingletonSynchronizedMethod instance4  = SingletonSynchronizedMethod.getInstance();
       
       System.out.println(instance3);
       System.out.println(instance4);
       
       if(instance4.equals(instance3)){
    	   System.out.println("instance3 and instance4 are same objects\n\n");
       }
       
       
       //Thread Safe: ThreadSafeBlock
       
       SingletonSynchronizedBlock instance5  = SingletonSynchronizedBlock.getInstance();
       SingletonSynchronizedBlock instance6  = SingletonSynchronizedBlock.getInstance();
       
       System.out.println(instance5);
       System.out.println(instance6);
       
       if(instance6.equals(instance5)){
    	   System.out.println("instance5 and instance6 are same objects\n\n");
       }
       
       
       // Factory Design Pattern:
       Vehicle car = VehicleFactory.getInstance("car", 4);
       Vehicle bike =  VehicleFactory.getInstance("bike", 2);
       
       System.out.println("Car: " + car + "Bike: " + bike);
       
       String sql = " SELECT A, B ,C FROM ABCD";
       String prefix = "select";
       sql = sql.trim();
       
       if(sql.startsWith("select") || sql.startsWith("SELECT")){
    	   sql = sql.substring(prefix.length());
       }
       
       String[] arr = sql.split(",");
       for(int i=0; i<arr.length; i++){
    	   arr[i] = arr[i].trim();
    	   System.out.println(arr[i]);
       }
       
       String[] arr2 = arr[arr.length-1].split(" ");
       System.out.println("---");
       for(int i=0; i<arr2.length; i++){
    	   System.out.println(arr2[i]);
       }
       
       
    }
}
