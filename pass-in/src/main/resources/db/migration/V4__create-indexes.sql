# criando indices para otimizar consultas no BD
# cada evento tem um "slug" (uma url) / não expoe o id do usuario, mas sim o slug
# dois eventos não podem ter o mesmo slug (INDEX)
# usuário não pode se cadastrar no mesmo evento mais de uma vez (email)
# o mesmo participante não pode fazer o checkin mais de uma vez
# criar indices facilita as buscas e respeita as regras de negócio
# declarando a regra no banco

CREATE UNIQUE INDEX events_slug_key ON events(slug);
CREATE UNIQUE INDEX attendees_event_id_email_key ON attendees(event_id, email);
CREATE UNIQUE INDEX check_ins_attendee_id_key ON check_ins(attendee_id);