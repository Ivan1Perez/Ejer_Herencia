package Ejer5;

public class EmpleadoTester {

    public static void main(String[] args) {

        Secretario s1 = new Secretario("Ivan", "Perez", "48711123K",
                "Calle Los Pinos 7", 20, 666777999, 1500,
                1, 666777988);
        System.out.println(s1);
        System.out.println();
        s1.incremSalario();
        System.out.println(s1);

        Vendedor v1 = new Vendedor("Pepe", "Ramirez", "44455533J",
                "Calle Maimona 26", 5, 778884494, 1500, 622333999);

        v1.darAlta("Pepito López");
        v1.darAlta("Juan Garcia");
        v1.darAlta("Ana Perez");
        System.out.println();
        System.out.println(v1);
        v1.incremSalario();
        System.out.println();
        System.out.println(v1);

        v1.setCocheEmpresa(new CocheEmpresa("4488-HXW", "Seat", "Leon"));
        System.out.println();
        System.out.println(v1);
        v1.setAreaVentas(AreaVentas.ADOMICILIO);
        System.out.println();
        System.out.println(v1);
        v1.darBaja("Juan Garcia");
        v1.comisionPorVenta();
        v1.comisionPorVenta();
        v1.comisionPorVenta();
        v1.comisionPorVenta();
        v1.comisionPorVenta();
        System.out.println();
        System.out.println(v1);


        JefeZona j1 = new JefeZona("Alberto", "Ramirez", "44477711J",
                "La Masia 123", 14, 667788999, 1800);
        System.out.println();
        System.out.println(j1);
    }

}
