package DZ7_Multithreading;

import java.util.Objects;

public class Client {

    private Long id;
    private QuestionType questionType;
    private Object clientInfo;

    public Client(Long id, QuestionType questionType, Object clientInfo) {
        this.id = id;
        this.questionType = questionType;
        this.clientInfo = clientInfo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public Object getClientInfo() {
        return clientInfo;
    }

    public void setClientInfo(Object clientInfo) {
        this.clientInfo = clientInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return Objects.equals(getId(), client.getId()) &&
                Objects.equals(getQuestionType(), client.getQuestionType()) &&
                Objects.equals(getClientInfo(), client.getClientInfo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getQuestionType(), getClientInfo());
    }

    @Override
    public String toString() {
        return "Client " +
                "id " + id +
                ", questionType " + questionType +
                ", clientInfo " + clientInfo;
    }
}
