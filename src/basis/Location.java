package basis;

public class Location {
    private Long x; //Поле не может быть null
    private float y;
    private Float z; //Поле не может быть null
    private String name; //Длина строки не должна быть больше 286, Поле не может быть null


    public void setX(Long x) {
        if (x != null) {
            this.x = x;
        }
    }

    public Long getX() {
        return x;
    }

    public void setZ(Float z) {
        if (z != null) {
            this.z = z;
        }
    }

    public Float getZ() {
        return z;
    }

    public void setName(String name) {
        if (name != null && name.length() < 286) {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }
}