package rocketseat.com.passin.domain.event.exceptions;

public class EventFullException extends RuntimeException{
    //lancando exception para evento cheio.
    public EventFullException (String message){
        super(message);
    }
}
