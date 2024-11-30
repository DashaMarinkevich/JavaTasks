import java.util.EnumSet;
import java.util.Set;

public enum Petrol {
    TYPE1 ("AИ-80"),
    TYPE2 ("AИ-90"),
    TYPE3 ("AИ-92"),
    TYPE4("AИ-95"),
    TYPE5 ("AИ-98"),
    TYPE6 ("Гибрид"),
    TYPE7 ("Электро");
    private String title;

    Petrol(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Petrol{" +
                "title='" + title + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
