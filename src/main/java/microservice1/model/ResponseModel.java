package microservice1.model;

public class ResponseModel {
    private long id;
    private String greeting;

    public ResponseModel(long id, String greeting) {
        this.id = id;
        this.greeting = greeting;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
