package basis;

public class Coordinates {
    private Double x; //Поле не может быть null
    private Float y; //Максимальное значение поля: 330, Поле не может быть null


    public void setX(Double x) {
        if (x != null) {
            this.x = x;
        }
    }

    public Double getX() {
        return x;
    }

    public void setY(Float y) {
        if (y < 331 && y != null) {
            this.y = y;
        }
    }

    public Float getY() {
        return y;
    }
}
