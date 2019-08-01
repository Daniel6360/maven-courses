package ro.itschool.homework17;

public class DocumentAlreadyFinishedException extends Exception {
    public DocumentAlreadyFinishedException(){
        super("Document already finished");
    }
}
