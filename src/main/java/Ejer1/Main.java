package Ejer1;

public class Main {
    public static void main(String[] args) {

        Multimedia m1 = new Multimedia("Fiti", "Paldi", Formato.AVI, 8.3);
        System.out.println(m1);
        Multimedia m2 = new Multimedia("Fito", "Paldi", Formato.CDAUDIO, 5);

        System.out.println(m1.equals(m2));

    }
}