public enum BodyType {
    SEDAN("Седан"),
    HATCHBACK("Хетчбэк"),
    COUPE("Купе"),
    UNIVERSAL("Универсал"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минимэн");

    final String name;

    BodyType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Тип кузова: " + name;
    }
}
