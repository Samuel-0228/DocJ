public class Binding {
    // Added static here
    public static class Animal {
        void makeNoise() {
            System.out.println("Generic animal noise");
        }

    }

    // Added static here
    public static class Dog extends Animal {
        @Override
        void makeNoise() {
            System.out.println("Bark!");
        }

        void fetch() {
            System.out.println("Fetching the ball!");
        }
    }

    public static void main(String[] args) {
        Animal myPet = new Dog();
        myPet.makeNoise(); // this don't need downcasting, because makeNoise is overridden in Dog class

        if (myPet instanceof Dog myDog) {
            myDog.fetch(); // downcasting to access Dog-specific method
        }
    }
}
