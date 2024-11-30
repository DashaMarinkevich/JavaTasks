public class Wheels {
    private double dia;
    private String kind;
    private TypeTires typeTires;

    public Wheels(double dia, String kind, TypeTires typeTires) {
        this.dia = dia;
        this.kind = kind;
        this.typeTires = typeTires;
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "dia=" + dia +
                ", kind='" + kind + '\'' +
                ", typeTires=" + typeTires +
                '}';
    }
}
