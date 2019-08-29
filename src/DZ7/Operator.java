package DZ7;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Operator {
    private Long id;
    private List<QuestionType> supportedQuestionType;
    private Object operatorInfo;
    private boolean free;


    public Operator() {
        this.id = 0L;
        this.supportedQuestionType = new ArrayList<>();
        this.operatorInfo = null;
        this.free = true;
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

    public Object getOperatorInfo() {
        return operatorInfo;
    }

    public void setOperatorInfo(Object employeInfo) {
        this.operatorInfo = employeInfo;
    }

    public boolean isCompetent(QuestionType questionType) {
        for (QuestionType q : supportedQuestionType) {
            if (q == questionType) return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Operator)) return false;
        Operator employe = (Operator) o;
        return Objects.equals(getId(), employe.getId()) &&
                Objects.equals(getSupportedQuestionType(), employe.getSupportedQuestionType()) &&
                Objects.equals(getOperatorInfo(), employe.getOperatorInfo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSupportedQuestionType(), getOperatorInfo());
    }

    @Override
    public String toString() {
        return "Employe " +
                "id " + id +
                ", supportedQuestionType " + supportedQuestionType.toString() +
                ", employeInfo " + operatorInfo;
    }
}
