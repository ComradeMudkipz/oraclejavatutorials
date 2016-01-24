class Cat {

    int hunger = 0;
    int thirst = 0;

    void hungerState(int newValue) {
        hunger = newValue;
    }

    void thirstState(int newValue) {
        thirst = newValue;
    }

    void eatFood(int food) {
        hunger = hunger - food;
    }

    void drinkWater(int water) {
        thirst = thirst - water;
    }

    void printStates() {
        System.out.println("Hunger:" + hunger +
                " Thirst:" + thirst);
    }
}

class CatDemo {
    public static void main(String[] args) {
        // Create 3 cats
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        // Feed the cats via methods
        cat1.hungerState(100);
        cat1.thirstState(100);
        cat1.eatFood(90);
        cat1.drinkWater(100);
        cat1.printStates();

        cat2.hungerState(100);
        cat2.thirstState(100);
        cat2.eatFood(100);
        cat2.drinkWater(90);
        cat2.printStates();

        cat3.hungerState(100);
        cat3.thirstState(100);
        cat3.eatFood(100);
        cat3.drinkWater(100);
        cat3.printStates();
    }
}
