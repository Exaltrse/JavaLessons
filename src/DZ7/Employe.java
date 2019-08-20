package DZ7;

import java.util.List;
import java.util.Objects;

public class Employe {
    private Long id;
    private List<QuestionType> supportedQuestionType;
    private Object employeInfo;
    private boolean free;

    public Employe(Long id, List<QuestionType> supportedQuestionType, Object employeInfo, boolean free) {
        this.id = id;
        this.supportedQuestionType = supportedQuestionType;
        this.employeInfo = employeInfo;
        this.free = free;
    }

    public boolean getFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<QuestionType> getSupportedQuestionType() {
        return supportedQuestionType;
    }

    public void setSupportedQuestionType(List<QuestionType> supportedQuestionType) {
        this.supportedQuestionType = supportedQuestionType;
    }

    public Object getEmployeInfo() {
        return employeInfo;
    }

    public void setEmployeInfo(Object employeInfo) {
        this.employeInfo = employeInfo;
    }

    public boolean isCompetent (QuestionType questionType){
        for(QuestionType q:supportedQuestionType){
            if(q==questionType) return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employe)) return false;
        Employe employe = (Employe) o;
        return Objects.equals(getId(), employe.getId()) &&
                Objects.equals(getSupportedQuestionType(), employe.getSupportedQuestionType()) &&
                Objects.equals(getEmployeInfo(), employe.getEmployeInfo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSupportedQuestionType(), getEmployeInfo());
    }

    @Override
    public String toString() {
        return "Employe " +
                "id " + id +
                ", supportedQuestionType " + supportedQuestionType +
                ", employeInfo " + employeInfo;
    }
}
