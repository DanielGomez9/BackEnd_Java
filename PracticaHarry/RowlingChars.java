package PracticaHarry;

public class RowlingChars {

    public static void main(String[] args) {
        harry();
        ron();
        hermione();
        cho();
        cedric();



    }

    private static void harry(){
        PersonajeHP harry = new PersonajeHP();
        harry.setNombre ("Harry Potter");
        harry.setGenero ("Masculino");
        harry.setCasa ("Gryffindor");
        harry.setBoggart ("Demenotor");
        harry.setPatronus ("Ciervo");
        System.out.println(harry.showMessage());


    }

    private static void ron (){
        PersonajeHP ron = new PersonajeHP();
        ron.setNombre ("Ron Weasley");
        ron.setGenero ("Masculino");
        ron.setCasa ("Gryffindor");
        ron.setBoggart ("Acromantula");
        ron.setPatronus ("Jack Russell terrier");
        System.out.println(ron.showMessage());
    }

    private static void hermione () {
        PersonajeHP hermione = new PersonajeHP();
        hermione.setNombre("Hermione Granger");
        hermione.setGenero("Femenino");
        hermione.setCasa("Gryffindor");
        hermione.setBoggart("La profesora McGonagall diciéndole que reprobó todo");
        hermione.setPatronus("Nutria");
        System.out.println(hermione.showMessage());
    }

    private static void cho () {
        PersonajeHP cho = new PersonajeHP();
        cho.setNombre("Cho Chang");
        cho.setGenero("Femenino");
        cho.setCasa("Ravenclaw");
        cho.setBoggart("Lord Voldemort");
        cho.setPatronus("Cisne");
        System.out.println(cho.showMessage());
    }


    private static void cedric () {
        PersonajeHP cedric = new PersonajeHP();
        cedric.setNombre("Cedric Diggory");
        cedric.setGenero("Masculino");
        cedric.setCasa("Hufflepuff");
        cedric.setBoggart("Lord Voldemort");
        cedric.setPatronus("No tiene");
        System.out.println(cedric.showMessage());
    }


}
