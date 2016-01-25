interface Pet {

    void hungerState(int newValue);

    void thirstState(int newValue);

    void eatFood(int food);

    void drinkWater(int water);

}

class Dog implements Pet {

    int hunger = 0;
    int thirst = 0;

    public void hungerState(int newValue) {
        hunger = newValue;
    }

    public void thirstState(int newValue) {
        thirst = newValue;
    }

    public void eatFood(int food) {
        hunger = hunger - food;
    }

    public void drinkWater(int water) {
        thirst = thirst - water;
    }

    public void printStates() {
        System.out.println("Hunger: " + hunger +
                " Thirst: " + thirst);
    }
}

class Cat implements Pet {

    int hunger = 0;
    int thirst = 0;

    public void hungerState(int newValue) {
        hunger = newValue;
    }

    public void thirstState(int newValue) {
        thirst = newValue;
    }

    public void eatFood(int food) {
        hunger = hunger - food;
    }

    public void drinkWater(int water) {
        thirst = thirst - water;
    }

    public void printStates() {
        System.out.println("Hunger: " + hunger +
                " Thirst: " + thirst);
    }
}

class PetsDemo {
    public static void main(String[] args) {

        Dog mojo = new Dog();
        Cat sally = new Cat();

        mojo.hungerState(100);
        mojo.thirstState(100);
        mojo.eatFood(80);
        mojo.drinkWater(100);
        mojo.printStates();

        sally.hungerState(50);
        sally.thirstState(100);
        sally.eatFood(100);
        sally.drinkWater(100);
        sally.printStates();

    }
}
