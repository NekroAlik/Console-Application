package basis;

public class Person {
    private String name; //Поле не может быть null, Строка не может быть пустой
    private float height; //Значение поля должно быть больше 0
    private Color eyeColor; //Поле может быть null
    private Color hairColor; //Поле не может быть null
    private Country nationality; //Поле может быть null
    private Location location; //Поле может быть null

    public void setName(String name) {
        if (name != "" && name != null) {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setHeight(float height) {
        if (height > 0) {
            this.height = height;
        }
    }

    public float getHeight() {
        return height;
    }

    public void setEyeColor(Color eyeColor) {
        this.eyeColor = eyeColor;
    }

    public Color getEyeColor() {
        return eyeColor;
    }

    public void setHairColor(Color hairColor) {
        if (hairColor != null) {
            this.hairColor = hairColor;
        }
    }

    public Color getHairColor() {
        return hairColor;
    }

    public void setNationality(Country nationality) {
        this.nationality = nationality;
    }

    public Country getNationality() {
        return nationality;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }
}