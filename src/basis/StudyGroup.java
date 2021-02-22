package basis;

import java.time.LocalDate;

public class StudyGroup {
    private Long id = 1L; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDate creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private int studentsCount; //Значение поля должно быть больше 0
    private int shouldBeExpelled; //Значение поля должно быть больше 0
    private FormOfEducation formOfEducation; //Поле не может быть null
    private Semester semesterEnum; //Поле не может быть null
    private Person groupAdmin; //Поле может быть null


    public void setId(Long id) {
        if (id > 0 && id != null) {
            this.id = id;
            ++id;
        }
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        if (name == null && name != "") {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setCoordinates(Coordinates coordinates) {
        if (coordinates != null) {
            this.coordinates = coordinates;
        }
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCreationDate(LocalDate creationDate) {
        if (creationDate != null) {
            this.creationDate = creationDate;
        }
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setStudentsCount(int studentsCount) {
        if (studentsCount > 0) {
            this.studentsCount = studentsCount;
        }
    }

    public int getStudentsCount() {
        return studentsCount;
    }

    public void setShouldBeExpelled(int shouldBeExpelled) {
        if (shouldBeExpelled > 0) {
            this.shouldBeExpelled = shouldBeExpelled;
        }
    }

    public int getShouldBeExpelled() {
        return shouldBeExpelled;
    }

    public void setFormOfEducation(FormOfEducation formOfEducation) {
        if (formOfEducation != null) {
            this.formOfEducation = formOfEducation;
        }
    }

    public FormOfEducation getFormOfEducation() {
        return formOfEducation;
    }

    public void setSemesterEnum(Semester semesterEnum) {
        if (semesterEnum != null) {
            this.semesterEnum = semesterEnum;
        }
    }

    public Semester getSemesterEnum() {
        return semesterEnum;
    }

    public void setGroupAdmin(Person groupAdmin) {
        this.groupAdmin = groupAdmin;
    }

    public Person getGroupAdmin() {
        return groupAdmin;
    }
}