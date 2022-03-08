class TestDrive {
    public static void main(String[] args) {
        Bread bagel = new Bagel();

        bagel = new Butter(bagel);
        bagel = new Butter(bagel);
        bagel = new Ham(bagel);
        bagel = new Cheese(bagel);

        System.out.println(bagel);

        Bread bun = new Bun();
        bun = new Butter(bun);
        bun = new Jam(bun);
        bun = new Jam(bun);

        System.out.println(bun);
    }
}

abstract class Bread {
    String description;
    int kcal;

    String getDescription() {
        return description;
    }

    int getKcal() {
        return kcal;
    }

    @Override
    public String toString() {
        return getDescription() + ". kCal: " + getKcal();
    }
}

class Bagel extends Bread {

    public static final int BAGEL_KCAL = 250;

    Bagel() {
        super();
        description = "Bagel";
        kcal = BAGEL_KCAL;
    }
}

class Bun extends Bread {

    public static final int BUN_KCAL = 150;

    Bun() {
        super();
        description = "Bun";
        kcal = BUN_KCAL;
    }
}

abstract class Decorator extends Bread {
    abstract String getDescription();

    abstract int getKcal();
}

class Butter extends Decorator {
    public static final int BREAD_KCAL = 50;
    private final Bread bread;

    Butter(Bread bread) {
        super();
        this.bread = bread;
    }

    @Override
    String getDescription() {
        return bread.getDescription() + ", Butter";
    }

    @Override
    int getKcal() {
        return bread.getKcal() + BREAD_KCAL;
    }
}

class Jam extends Decorator {

    public static final int JAM_KCAL = 120;
    private final Bread bread;

    Jam(Bread bread) {
        super();
        this.bread = bread;
    }

    @Override
    String getDescription() {
        return bread.getDescription() + ", Jam";
    }

    @Override
    int getKcal() {
        return bread.getKcal() + JAM_KCAL;
    }
}

class Cheese extends Decorator {

    public static final int CHEESE_KCAL = 40;
    private final Bread bread;

    Cheese(Bread bread) {
        super();
        this.bread = bread;
    }

    @Override
    String getDescription() {
        return bread.getDescription() + ", Cheese";
    }

    @Override
    int getKcal() {
        return bread.getKcal() + CHEESE_KCAL;
    }
}

class Ham extends Decorator {

    public static final int HAM_KCAL = 2500;
    private final Bread bread;

    Ham(Bread bread) {
        super();
        this.bread = bread;
    }

    @Override
    String getDescription() {
        return bread.getDescription() + ", Ham";
    }

    @Override
    int getKcal() {
        return bread.getKcal() + HAM_KCAL;
    }
}