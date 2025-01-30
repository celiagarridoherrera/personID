package dev.celia.person;

public final class App {
    private App() {
    }

    /**
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        PersonID person1 = new PersonID("Celia", "Garrido", "12345678A", 2001);

        System.out.println("Details of the person:");
        person1.showInfo();
    }
}
