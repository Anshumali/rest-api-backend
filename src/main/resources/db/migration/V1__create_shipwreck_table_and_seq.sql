CREATE SEQUENCE shipwreck_id_seq;

CREATE TABLE public.shipwreck
(
    id bigint NOT NULL DEFAULT nextval('shipwreck_id_seq'::regclass),
    condition varchar(255),
    depth integer,
    description varchar(255) COLLATE pg_catalog."default",
    latitude double precision,
    longitude double precision,
    name varchar(255) COLLATE pg_catalog."default",
    year_discovered integer,
    CONSTRAINT shipwreck_pkey PRIMARY KEY (id)
)

