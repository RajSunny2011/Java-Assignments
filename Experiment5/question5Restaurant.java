class Chef {
    public void makeSpecialDish() {
        System.out.println("The chef is making a special dish.");
    }
}

class ItalianChef extends Chef {
    @Override
    public void makeSpecialDish() {
        System.out.println("Making pasta.");
    }
}

class ChineseChef extends Chef {
    @Override
    public void makeSpecialDish() {
        System.out.println("Making dumplings.");
    }
}

class MexicanChef extends Chef {
    @Override
    public void makeSpecialDish() {
        System.out.println("Making tacos.");
    }
}

public class question5Restaurant {
    public static void main(String[] args) {
        Chef[] chefs = {new ItalianChef(), new ChineseChef(), new MexicanChef()};
        for (Chef chef : chefs) {
            chef.makeSpecialDish();
        }
    }
}
