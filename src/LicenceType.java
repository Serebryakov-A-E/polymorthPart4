public enum LicenceType {
    B("B"),
    C("C"),
    D("D");

    private final String category;

    LicenceType(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
