CREATE TABLE attendees (
    id VARCHAR(255) NOT NULL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    #fazendo referência a tabela event (mesmo tipo do id da tabela eventos)
    event_id VARCHAR(255) NOT NULL,
    #saber quando essa participação foi criada
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    #relacao entre tabelas (events -> attendees)
    #caso alguem tente apagar um evento na tabela de eventos que tenha registros na tabela attendees, restringe o delete (não deixa deletar)
    #caso tneha algum update na tabela de eventos, colocar o cascade atualizando a attendees também
    CONSTRAINT attendees_event_id_fkey FOREIGN KEY (event_id) REFERENCES events (id) ON DELETE RESTRICT ON UPDATE CASCADE
);