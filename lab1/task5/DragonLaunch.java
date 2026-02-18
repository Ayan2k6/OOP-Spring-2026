package lab1.task5;

import java.util.Vector;

public class DragonLaunch {
    // Хранилище - Vector [cite: 109]
    private Vector<Person> kidnappedPeople;

    public DragonLaunch() {
        kidnappedPeople = new Vector<>();
    }

    public void kidnap(Person p) { // [cite: 108]
        kidnappedPeople.add(p);
    }

    // Линейное время O(N), без доп. структур 
    public boolean willDragonEatOrNot() {
        int boysPending = 0;
        int peopleUnableToPair = 0;

        for (Person p : kidnappedPeople) {
            if (p.getGender() == Gender.BOY) {
                // Мальчик ждет пару
                boysPending++;
            } else {
                // Девочка
                if (boysPending > 0) {
                    // Образует пару с ближайшим доступным мальчиком (B-G)
                    // Они оба исчезают
                    boysPending--;
                } else {
                    // Нет мальчиков перед ней. Эта девочка никогда не исчезнет.
                    peopleUnableToPair++;
                }
            }
        }
        
        // Оставшиеся мальчики + девочки, которые не нашли пару
        int totalLeft = peopleUnableToPair + boysPending;

        // Если кто-то остался, дракон ест [cite: 104]
        return totalLeft > 0;
    }

    public static void main(String[] args) {
        DragonLaunch launch = new DragonLaunch();
        
        // Пример 1: BBGG -> Должны исчезнуть. Результат: false (не ест)
        launch.kidnap(new Person("B1", Gender.BOY));
        launch.kidnap(new Person("B2", Gender.BOY));
        launch.kidnap(new Person("G1", Gender.GIRL));
        launch.kidnap(new Person("G2", Gender.GIRL));

        System.out.println("Dragon eats? " + launch.willDragonEatOrNot()); // Expect: false

        DragonLaunch launch2 = new DragonLaunch();
        // Пример 2: GBGB -> Остаются 2 человека. Результат: true (ест)
        launch2.kidnap(new Person("G1", Gender.GIRL));
        launch2.kidnap(new Person("B1", Gender.BOY));
        launch2.kidnap(new Person("G2", Gender.GIRL));
        launch2.kidnap(new Person("B2", Gender.BOY));
        
        System.out.println("Dragon eats? " + launch2.willDragonEatOrNot()); // Expect: true
    }
}