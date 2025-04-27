package controller;

import manager.PersonajeManager;
import model.Personaje;

import java.util.List;

public class PersonajeController {
    public void run() {
        PersonajeManager manager = new PersonajeManager();
        List<Personaje> heroes = manager.obtenerHeroes("resources/heroes.json");

        if (heroes != null && !heroes.isEmpty()) {
            System.out.println("Héroes cargados desde el archivo JSON:");
            for (Personaje heroe : heroes) {
                System.out.println(heroe);
                System.out.println("-------------");
                heroe.levelUp();
            }
        } else {
            System.out.println("No se pudieron cargar los héroes.");
        }

        manager.guardarHeroes("resources/heroes.save.json", heroes);
    }
}
