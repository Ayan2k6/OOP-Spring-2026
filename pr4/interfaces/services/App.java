package pr4.interfaces.services;

import pr4.interfaces.model.Game;
import pr4.interfaces.model.IGame;

public class App {
    public void getStatistics(Game g) {
        System.out.println("--- App: Game Statistics ---");
        // Так как g имеет тип Game, мы можем вызывать только методы интерфейса Game
        g.a();
        g.b();
        g.c();
        
        // Но если под маской Game прячется IGame, мы можем это проверить и вызвать метод d()
        if (g instanceof IGame) {
            ((IGame) g).d();
        }
    }
}