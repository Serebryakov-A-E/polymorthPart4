public enum LoadType {
    N1(null, 3.5f),
    N2(3.5f, 12.0f),
    N3(12.0f, null);

    final Float low;
    final Float high;


    LoadType(Float low, Float high) {
        this.low = low;
        this.high = high;
    }

    @Override
    public String toString() {
        return "Грузоподъемность: " + (low == null ? "" : "от " + low + " тонн ")
                + (high == null ? "" : "до " + high + " тонн ");
    }
}
