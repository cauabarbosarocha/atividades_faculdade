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
ALTER TABLE T_TSB_CLIENTE RENAME TO T_TSB_CLIENTE_NEW;
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

-- Exemplo: Modifiacando o valor DEFAULTA de uma coluna
ALTER TABLE T_TSB_CLIENTE
    MODIFY status_cliente DEFAULT 'INATIVO';

-- Exemplo: Remocendo o valor DEFAULT de uma coluna
ALTER TABLE T_TSB_CLIENTE
    MODIFY status_cliente DEFAULT NULL;

--  Exemplo: Removendo uma coluna
ALTER TABLE T_TSB_CLIENTE
    DROP  COLUMN pontos_fidelidade;

-- Exemplo: Renomeando uma coluna
ALTER TABLE T_TSB_CLIENTE
    RENAME COLUMN ds_genero TO genero;

-- Exemplo: Adicionando uma constraint UNIQUE
ALTER TABLE T_TSB_CLIENTE
    ADD CONSTRAINT UN_T_TSB_CLIENTE_EMAIL UNIQUE (ds_email);

-- Exemplo: Adiconando constraint CHECK
ALTER TABLE T_TSB_CLIENTE
    ADD CONSTRAINT CK_T_TSB_CLIENTE_GENERO
    CHECK (UPPER(genero) IN ('M', 'H', 'NB'));
    -- Garante que será preenchido apenas com uma das opções, se houver gênero diferente das opções, o registro não será inserido

-- Adicionando uma constriant FOREIGN KEY
ALTER TABLE T_TSB_CLIENTE
    ADD CONSTRAINT FK_T_TSB_CLIENTE_DS_ENDERECO
    FOREIGN KEY (ds_endereco)
    REFERENCES T_TSB_CIDADE (ds_endereco);

-- Removendo uma constriant PRAIMAY KEY
ALTER TABLE T_TSB_CLIENTE
    DROP CONSTRAINT PK_T_TSB_CLIENTE CASCADE;

-- Renomeando uma tabela
ALTER TABLE T_TSB_CLIENTE RENAME TO T_TSB_CLIENTE_NEW;

-- Desabilitanndo uma constraind
ALTER TABLE T_TSB_CLIENTE
    DISABLE CONSTRAINT PK_T_TSB_CLIENTE;

-- Habilitando uma constraind
ALTER TABLE T_TSB_CLIENTE
    ENABLE CONSTRAINT PK_T_TSB_CLIENTE;

-- Excluindo uma tabela
DROP TABLE T_TSB_CLIENTE CASCADE CONSTRAINTS; -- ou DROP TABLE T_TSB_CLIENTE PURGE; -- para excluir a tabela e todos os dados contidos nela sem ir para a lixeira do banco de dados
-- DROP TABLE T_TSB_CLIENTE CASCADE CONSTRAINTS; -- para excluir a tabela e todas as constraints relacionadas a ela

-- Exemplo de operações TRUNCATE TABLE:
TRUNCATE TABLE T_TSB_CLIENTE; -- Remove todos os registros da tabela, mas mantém a estrutura da tabela e suas constraints. Não pode ser revertido.

-- Comentario sobre a tabela e campos
-- Exemplo: COMENTÁRIO SOBRE TABELA E CAMPOS
COMMENT ON TABLE T_TSB_CLIENTE IS 'EXEMPLO DE COMENTÁRIO PARA A TABELA';

COMMENT ON COLUMN T_TSB_CLIENTE.NM_CLIENTE IS 'EXEMPLO DE COMENTÁRIO DE COLUNA';

-- Visualizar os comentários de tabelas e colunas
-- Visualizar comentários de tabelas
SELECT * FROM USER_TAB_COMMENTS
WHERE TABLE_NAME = 'T_TSB_CLIENTE';
-- Visualizar comentários de colunas
SELECT * FROM USER_COL_COMMENTS
WHERE TABLE_NAME = 'T_TSB_CLIENTE';