public class question1Private {
    public static void main(String[] args) {
        SubClass aSubClass = new SubClass();
        aSubClass.displayPrivateNumber();
    }
}

class SuperClass {
    private final int privateNumber = 42;
    public int getPrivateNumber() {
        return privateNumber;
    }
}

class SubClass extends SuperClass {
    public void displayPrivateNumber() {
        System.out.println(getPrivateNumber());
    }
}