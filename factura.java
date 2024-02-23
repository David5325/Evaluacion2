interface animal {
    void hacerSonido();
}

class animalPadre implements animal {
    public void hacerSonido() {
        System.out.println("haciendo un sonido unico");
    }
}

class perro extends animalPadre {
    public void hacerSonido(String sonido) {
        System.out.println("el perro hace: " + sonido);
    }
}

class gato extends animalPadre implements animal {
    public void hacerSonido() {
        System.out.println("el gato hace miau");
    }
}

public class main {
    public static void main(String[] args) {
        perro miPerro = new perro();
        gato miGato = new gato();

        miPerro.hacerSonido("ladrido");
        miGato.hacerSonido();

        animal animal = new perro();
        animal.hacerSonido();

        animal = new gato();
        animal.hacerSonido();
    }
}
