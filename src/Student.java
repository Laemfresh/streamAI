public class Student {
    private Integer id;
    private String FIO;

    public Student(Integer id, String FIO) {
        this.id = id;
        this.FIO = FIO;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", FIO='" + FIO + '\'' +
                '}';
    }
}
