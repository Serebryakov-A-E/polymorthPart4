public enum CapacityType {
    VERY_LOW(0, 10),
    LOW(0, 25),
    MIDDLE(40, 50),
    BIG(60, 80),
    LARGE(100, 120);

    final int low;
    final int high;


    CapacityType(int low, int high) {
        this.low = low;
        this.high = high;
    }

    @Override
    public String toString() {
        return "Вместимость: " + (low == 0 ? "" : low + " - ") + high + " мест ";
    }
}
