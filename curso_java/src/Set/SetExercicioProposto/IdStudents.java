package Set.SetExercicioProposto;

import java.util.Objects;

public class IdStudents {
    private Integer num;

    public IdStudents(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdStudents that = (IdStudents) o;
        return Objects.equals(num, that.num);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(num);
    }
}
