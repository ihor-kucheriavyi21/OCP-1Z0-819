package org.example.constructor;

public class Dinosaur {
    class Pterodactyl extends Dinosaur {
    }
    static { System.out.println("static");
    }
    public void roar() {
        /* static initializer available only on class level
        static { System.out.println("static");
        }*/
        var dino = new Dinosaur();
        Pterodactyl pterodactyl = dino.new Pterodactyl();
        Pterodactyl pterodactyl1 = new Dinosaur.Pterodactyl();
    }
}
