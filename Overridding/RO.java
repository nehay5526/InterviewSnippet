package Overridding;

public class Animal {
 
    public void move() {
        // animal moving code...
    }
 
    protected void eat() {
        // animal eating code...
    }
}

public class Dog extends Animal {
 
    public void move() {
        // dog moving code...
    }
 
    protected void eat() {
        // dog eating code...
    }
}
/**
 * 1. Only inherited methods can be overridden.
 */

public class RO {
    
}
