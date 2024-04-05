package rocketseat.com.passin.dto.event;

//tipo de objeto para transferencia de dados | não mutável
public record EventDetailDTO (
    String id, 
    String title, 
    String details, 
    String slug, 
    Integer maximumAttendees, 
    Integer attendeesAmount ) {
    
}
