package dev.celia.person;

public class PersonID {

    public String name;
    public String surname;
    public String dni;
    public int birthYear;

    PersonID(String nombre, String apellido, String dni, int añoNacimiento){
        this.name = nombre;
        this.surname = apellido;
        this.dni = dni;
        this.birthYear = añoNacimiento;
    }

    public void showInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Surname: " + this.surname);
        System.out.println("DNI: " + this.dni);
        System.out.println("Birth year: " + this.birthYear);
    }
}