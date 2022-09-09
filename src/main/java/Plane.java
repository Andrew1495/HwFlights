public enum Plane {
    TESTPLANE(2, 400),
    BOEING747(40, 500),
    BOEING101(30, 400),
    BOEING222(10,800),
    BOEING303(100, 1000);


    private final int capacity;
    private final double weight;

    Plane(int capacity, double weight){
        this.capacity = capacity;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public int getCapacity() {
        return capacity;
    }


}
