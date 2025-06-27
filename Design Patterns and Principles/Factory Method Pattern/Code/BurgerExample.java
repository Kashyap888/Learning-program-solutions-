interface Burger {
    void prepare();
}

class CheeseBurger implements Burger {
    public void prepare() {
        System.out.println("Preparing Cheese Burger");
    }
}

class VegBurger implements Burger {
    public void prepare() {
        System.out.println("Preparing Veg Burger");
    }
}

class BurgerFactory {
    public static Burger createBurger(String type) {
        if (type=="cheese") {
            return new CheeseBurger();
        } else if (type=="veg") {
            return new VegBurger();
        } else {
            throw new IllegalArgumentException("Unknown burger type");
        }
    }
}

// Client
public class BurgerExample {
    public static void main(String[] args) {
        Burger cheeseBurger = BurgerFactory.createBurger("cheese");
        cheeseBurger.prepare();

        Burger vegBurger = BurgerFactory.createBurger("veg");
        vegBurger.prepare();

        Burger unknownBurger = BurgerFactory.createBurger("unknown");
        unknownBurger.prepare();
    }
}
