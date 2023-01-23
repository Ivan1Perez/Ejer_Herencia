package Ejer5;

public class EmpleadoTester {

    public static void main(String[] args) {

        Secretario s1 = new Secretario("Ivan", "Perez", "48711123K",
                "Calle Los Pinos 7", 20, 666777999, 1500,
                1, 666777988);
        System.out.println(s1);
        s1.incremSalario();
        System.out.println(s1);

        Vendedor v1 = new Vendedor("Pepe", "Ramirez", "44455533J",
                "Calle Maimona 26", 5, 778884494, 1500, 622333999);

        v1.darAlta("Pepito López");
        v1.darAlta("Juan Garcia");
        System.out.println(v1);

    }

}
