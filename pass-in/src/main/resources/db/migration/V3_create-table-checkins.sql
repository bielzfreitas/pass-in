CREATE TABEL check_ins (
    # tabela gera primary key para cada entrada (sem repetição)
    id INTEGER NOT NULL PRIMARY KEY IDENTITY,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    # id do participante / valor externo -> mesmo tipo que está na outra tabela
    attendee_id VARCHAR(255) NOT NULL,
    # relação entre as tabelas
    CONSTRAINT check_ins_attendee_id_fkey FOREIGN KEY (attendee_id) REFERENCES attendee (id) ON DELETE RESTRICT ON UPDATE CASCADE
);