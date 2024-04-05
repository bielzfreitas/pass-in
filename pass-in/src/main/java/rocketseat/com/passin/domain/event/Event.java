package rocketseat.com.passin.domain.event;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "events")
//get e set
@Getter
@Setter
//Construtores (recebe/não argumento)
@AllArgsConstructor
@NoArgsConstructor
public class Event {
    
    //Declarando colunas
    //mostando que vai ser um ID | coluna não pode ser nula | valor gerado automaticamente
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String details;

    //indice de busca unico | não pode ter slug duplicado | padrão entre banco - codigo
    @Column(nullable = false, unique = true)
    private String slug;

    @Column(nullable = false, name = "maximum_attendees")
    private Integer maximumAttendees;


}
