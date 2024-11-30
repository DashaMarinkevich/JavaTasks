public class Motor {
    private double volume;
    private String kind;
    private Petrol kindPetrol;

    public Motor(double volume, String kind, Petrol kindPetrol) {
        this.volume = volume;
        this.kind = kind;
        this.kindPetrol = kindPetrol;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "volume=" + volume +
                ", kind='" + kind + '\'' +
                ", kindPetrol=" + kindPetrol +
                '}';
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Petrol getKindPetrol() {
        return kindPetrol;
    }

    public void setKindPetrol(Petrol kindPetrol) {
        this.kindPetrol = kindPetrol;
    }
}
