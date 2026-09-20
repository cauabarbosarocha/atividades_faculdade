-- Exemplo da criação de uma tabela CLIENTE:
CREATE TABLE T_TSB_CLIENTE (
    cs_cliente  NUMBER(5)     NOT NULL,
    nm_cliente  VARCHAR2(50)  NOT NULL,
    nr_cpf      VARCHAR2(11)  NOT NULL,
    ds_genero   CHAR(2)       NOT NULL,
    ds_email    VARCHAR2(80)  NOT NULL,
    nr_telefone NUMBER(9)         NULL,
    ds_endereco VARCHAR(200)  NOT NULL,
    dt_cadastro DATE          NOT NULL
);

-- Exemplo de operações ALTER TABLE:
-- Adicionar CHECK CONSTRAINT
ALTER TABLE T_TSB_CLIENTE
    ADD CONSTRAINT CK_T_TSB_CLIENTE_EMAIL
    CHECK (ds_email LIKE '%@%.%');

-- Adicionar PRIMARY KEY
ALTER TABLE T_TSB_CLIENTE
    ADD CONSTRAINT PK_T_TSB_CLIENTE PRIMARY KEY (cs_cliente);

-- Adicionar UNIQUE CONSTRAINT
ALTER TABLE T_TSB_CLIENTE
    ADD CONSTRAINT UN_T_TSB_CLIENTE_CPF UNIQUE (nr_cpf);

ALTER TABLE T_TSB_CLIENTE
    ADD CONSTRAINT UN_T_TSB_CLIENTE_EMAIL UNIQUE (ds_email);

-- Exemplo: Adicionar coluna de pontos de fidelidade
ALTER TABLE T_TSB_CLIENTE
    ADD pontos_fidelidade NUMBER(10) DEFAULT 0;

-- Exemplo: Adicionar múltiplas colunas
ALTER TABLE T_TSB_CLIENTE
    ADD (
        dt_ultima_compra DATE   NULL,
        status_cliente   VARCHAR2(20) DEFAULT 'ATIVO'
    );

-- Exemplo: Aumentar o tamanho de um campo de nome
ALTER TABLE T_TSB_CLIENTE
    MODIFY nm_cliente VARCHAR2(100);

-- Exemplo: Tornando uma coluna obrigatória
ALTER TABLE T_TSB_CLIENTE
    MODIFY pontos_fidelidade NOT NULL;

-- Exemplo; Tornando uma coluna opcional
ALTER TABLE T_TSB_CLIENTE
    MODIFY ds_email VARCHAR2(100) NULL;

-- Exemplo: Modificando o tipo de uma coluna
ALTER TABLE T_TSB_CLIENTE
    MODIFY nr_telefone VARCHAR2(15);