package microservice1.model;

public class ResponseModel {
    private long id;
    private String greeting;

    public ResponseModel(long id, String greeting) {
        this.id = id;
        this.greeting = greeting;
    }
}
