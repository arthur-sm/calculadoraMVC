package calculadora;

import calculadora.view.menu;

public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        menu m = new menu();

        m.mostrarMenu();
    }
}
