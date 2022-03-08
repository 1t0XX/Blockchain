import java.util.Locale;

class TestDrive {
    public static void main(String[] args) {
        Pizza simpleVeganPizza = new Vegan();
        System.out.println(simpleVeganPizza.getDescription() + " $" + formatSum(simpleVeganPizza.cost()));

        Pizza veganPizzaDecor = new Vegan();
        veganPizzaDecor = new Broccoli(veganPizzaDecor);
        veganPizzaDecor = new Tomato(veganPizzaDecor);
        veganPizzaDecor = new Spinach(veganPizzaDecor);
        System.out.println(veganPizzaDecor.getDescription() + " $" + formatSum(veganPizzaDecor.cost()));

        Pizza meatPizzaDecor = new MeatHeaven();
        meatPizzaDecor = new Ham(meatPizzaDecor);
        meatPizzaDecor = new Chicken(meatPizzaDecor);
        meatPizzaDecor = new Cheese(meatPizzaDecor);
        System.out.println(meatPizzaDecor.getDescription() + " $" + formatSum(meatPizzaDecor.cost()));

    }

    private static String formatSum(double sum) {
        return String.format(Locale.ROOT, "%.2f", sum);
    }
}

abstract class Pizza {
    String description;

    String getDescription() {
        return description;
    }

    abstract double cost();
}

class Vegan extends Pizza {

    public static final double VEGAN_COST = 4.99;

    Vegan() {
        super();
        description = "Vegan";
    }

    @Override
    double cost() {
        return VEGAN_COST;
    }
}

class MeatHeaven extends Pizza {

    public static final double MEAT_HEAVEN_COST = 4.0;

    MeatHeaven() {
        super();
        description = "MeatHeaven";
    }

    @Override
    double cost() {
        return MEAT_HEAVEN_COST;
    }
}

abstract class Decorator extends Pizza {
    abstract String getDescription();
}

class Ham extends Decorator {
    public static final double HAM_COST = 1.0;
    private final Pizza pizza;

    Ham(Pizza pizza) {
        super();
        this.pizza = pizza;
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", Ham";
    }

    @Override
    double cost() {
        return HAM_COST + pizza.cost();
    }
}

class Chicken extends Decorator {

    public static final double CHICKEN_COST = 1.5;
    private final Pizza pizza;

    Chicken(Pizza pizza) {
        super();
        this.pizza = pizza;
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", Chicken";
    }

    @Override
    double cost() {
        return CHICKEN_COST + pizza.cost();
    }
}

class Cheese extends Decorator {

    public static final double CHEESE_COST = .20;
    private final Pizza pizza;

    Cheese(Pizza pizza) {
        super();
        this.pizza = pizza;
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    @Override
    double cost() {
        return CHEESE_COST + pizza.cost();
    }
}

class Broccoli extends Decorator {

    public static final double BROCCOLI_COST = .10;
    private final Pizza pizza;

    Broccoli(Pizza pizza) {
        super();
        this.pizza = pizza;
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", Broccoli";
    }

    @Override
    double cost() {
        return BROCCOLI_COST + pizza.cost();
    }
}

class Tomato extends Decorator {

    public static final double TOMATO_COST = .09;
    private final Pizza pizza;

    Tomato(Pizza pizza) {
        super();
        this.pizza = pizza;
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", Tomato";
    }

    @Override
    double cost() {
        return TOMATO_COST + pizza.cost();
    }
}

class Spinach extends Decorator {

    public static final double SPINACH_COST = .09;
    private final Pizza pizza;

    Spinach(Pizza pizza) {
        super();
        this.pizza = pizza;
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", Spinach";
    }

    @Override
    double cost() {
        return SPINACH_COST + pizza.cost();
    }
}