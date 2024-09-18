DROP TABLE IF EXISTS [Conferencia_Artigos_Cientificos];
DROP TABLE IF EXISTS [Conferencia_Autores];
DROP TABLE IF EXISTS [Conferencia_Conferencia];
DROP TABLE IF EXISTS [Conferencia_Estudante];
DROP TABLE IF EXISTS [Conferencia_Nao_Estudante];
DROP TABLE IF EXISTS [Conferencia_Participantes];
DROP TABLE IF EXISTS [Conferencia_Instituicao];

CREATE TABLE [Conferencia_Participantes] (
    [ID] [int] NOT NULL,
    [Nome] [varchar](128) NOT NULL,
    [Morada] [varchar](256) NOT NULL,
    [Email] [varchar](128) NOT NULL,
    [Instituicao] [varchar](128) NOT NULL,
    [data] [date] NOT NULL,
    PRIMARY KEY ( [ID] )
)
GO

CREATE TABLE [Conferencia_Estudante] (
    [Comprovativo] [int] NOT NULL,
    [ID] [int] NOT NULL REFERENCES [Conferencia_Participantes]([ID]),
    PRIMARY KEY ( [ID] )
)

CREATE TABLE [Conferencia_Nao_Estudante] (
    [Registo_Transacao_Bancaria] [int] NOT NULL,
    [ID] [int] NOT NULL REFERENCES [Conferencia_Participantes]([ID]),
    PRIMARY KEY ( [ID] )
)
GO

CREATE TABLE [Conferencia_Conferencia] (
    [Participantes] [int] NOT NULL REFERENCES [Conferencia_Participantes]([ID]),
    [ID] [int] NOT NULL,
    PRIMARY KEY ( [ID] )
)
GO

CREATE TABLE [Conferencia_Instituicao] (
    [ID] [int] NOT NULL,
    [Nome] [varchar](128) NOT NULL,
    [Morada] [varchar](256) NOT NULL,
    PRIMARY KEY ( [ID] )
)
GO

CREATE TABLE [Conferencia_Autores] (
    [ID] [int] NOT NULL,
    [Nome] [varchar](128) NOT NULL,
    [Email] [varchar](128) NOT NULL,
    [Instituicao] [int] NOT NULL REFERENCES [Conferencia_Instituicao]([ID]),
    [Artigos_Cientificos] [int] NOT NULL UNIQUE,
    PRIMARY KEY ( [ID] )
) 
GO

CREATE TABLE [Conferencia_Artigos_Cientificos] (
    [N_Registo] [int] NOT NULL REFERENCES [Conferencia_Autores]([Artigos_Cientificos]),
    [Conferencia] [int] NOT NULL REFERENCES [Conferencia_Conferencia]([ID]),
    [Autores] [int] NOT NULL REFERENCES [Conferencia_Autores]([ID]),
    [Titulo] [varchar](128) NOT NULL,
    PRIMARY KEY ( [N_Registo] )
)
GO

