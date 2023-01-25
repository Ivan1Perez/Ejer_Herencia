package Ejer5;

public enum AreaVentas {

    ADOMICILIO ("A Domicilio"),
    ONLINE ("Online");

    private String area;

    AreaVentas(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return area;
    }
}
