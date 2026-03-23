class Animal {
    public void eat() {
        System.out.println("I can eat");
    }
}

class Dog extends Animal {       // Dog inherits from Animal
    public void bark() {
        System.out.println("Woof!");
    }
}


class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}



class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // inherited from Animal
        d.bark();  // defined in Dog


     Shape s1 = new Circle();  // reference type = Shape
        Shape s2 = new Square();

        s1.draw();   // prints "Drawing a circle"
        s2.draw();   // prints "Drawing a square"

        
    }
}
