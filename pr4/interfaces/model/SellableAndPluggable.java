package pr4.interfaces.model;

public interface SellableAndPluggable extends Sellable, Pluggable {
    // Он объединяет в себе методы sell() и plugIn(), свои добавлять не обязательно
}