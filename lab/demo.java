// File: demo/AccessDemo.java
package demo;

class Base {            // default (package‑private) class
    public int pub = 1;        // public
    protected int pro = 2;     // protected
    int def = 3;               // default (no keyword)
    private int pri = 4;       // private

    public void showInBase() {
        // Inside same class: can access all 4
        System.out.println("Base.pub = " + pub);
        System.out.println("Base.pro = " + pro);
        System.out.println("Base.def = " + def);
        System.out.println("Base.pri = " + pri);
    }
}

class SubSamePackage extends Base {   // subclass in same package
    public void showInSubSame() {
        // Can access: public, protected, default (same package), NOT private
        System.out.println("SubSamePackage.pub = " + pub);   // OK
        System.out.println("SubSamePackage.pro = " + pro);   // OK
        System.out.println("SubSamePackage.def = " + def);   // OK
        // System.out.println("SubSamePackage.pri = " + pri); // ERROR
    }
}

class OtherSamePackage {
    public void showInOtherSame() {
        Base b = new Base();
        // Can access: public, protected, default (same package), NOT private
        System.out.println("OtherSamePackage.pub = " + b.pub);  // OK
        System.out.println("OtherSamePackage.pro = " + b.pro);  // OK
        System.out.println("OtherSamePackage.def = " + b.def);  // OK
        // System.out.println("OtherSamePackage.pri = " + b.pri); // ERROR
    }
}

public class AccessDemo {
    public static void main(String[] args) {
        Base base = new Base();
        base.showInBase();

        SubSamePackage sub = new SubSamePackage();
        sub.showInSubSame();

        OtherSamePackage other = new OtherSamePackage();
        other.showInOtherSame();
    }
}
