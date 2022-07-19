public class GorillaClass extends MammalClass {
    public void throwSomething() {
        setEnergyLevel(getEnergyLevel() - 5);
        System.out.println("monkey throw");
    }

    public void eatBanana() {
        setEnergyLevel(getEnergyLevel() + 10);
        System.out.println("monkey eat banana!");
    }

    public void climb() {
        setEnergyLevel(getEnergyLevel() - 6);
        System.out.println("monkey climb");
    }
}
