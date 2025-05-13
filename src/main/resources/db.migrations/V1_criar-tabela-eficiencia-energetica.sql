CREATE SEQUENCE ALERTA_SEQ START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE CADASTRO_ADAPTADORES_SEQ START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE CONSUMO_SEQ START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE PREFERENCIAS_SEQ START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE USUARIO_SEQ START WITH 1 INCREMENT BY 1;

CREATE TABLE usuario (
                         id BIGINT PRIMARY KEY DEFAULT NEXTVAL('USUARIO_SEQ'),
                         nome VARCHAR(255),
                         email VARCHAR(255)
);

CREATE TABLE cadastro_adaptadores (
                                      id BIGINT PRIMARY KEY DEFAULT NEXTVAL('CADASTRO_ADAPTADORES_SEQ'),
                                      nome VARCHAR(255),
                                      tipo_adaptador VARCHAR(255),
                                      modelo VARCHAR(255),
                                      fabricante VARCHAR(255),
                                      versao VARCHAR(255),
                                      protocolo VARCHAR(255),
                                      ip VARCHAR(255),
                                      porta VARCHAR(255)
);

CREATE TABLE preferencia_usuario (
                                     id BIGINT PRIMARY KEY DEFAULT NEXTVAL('PREFERENCIAS_SEQ'),
                                     nome VARCHAR(255),
                                     ambiente VARCHAR(255),
                                     maximo VARCHAR(255),
                                     minimo VARCHAR(255),
                                     inicio TIMESTAMP,
                                     fim TIMESTAMP
);

CREATE TABLE consumo_eletrico (
                                  id BIGINT PRIMARY KEY DEFAULT NEXTVAL('CONSUMO_SEQ'),
                                  usuario_id BIGINT,
                                  consumo_kwh VARCHAR(255),
                                  data_consumo TIMESTAMP,
                                  CONSTRAINT fk_consumo_usuario FOREIGN KEY (usuario_id) REFERENCES usuario(id)
);

CREATE TABLE alerta_de_consumo (
                                   id BIGINT PRIMARY KEY DEFAULT NEXTVAL('ALERTA_SEQ'),
                                   consumo_eletrico_id BIGINT,
                                   data_alerta TIMESTAMP,
                                   CONSTRAINT fk_alerta_consumo FOREIGN KEY (consumo_eletrico_id) REFERENCES consumo_eletrico(id)
);
