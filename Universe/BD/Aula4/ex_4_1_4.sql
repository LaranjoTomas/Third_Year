DROP TABLE IF EXISTS [Farmacia_Especialista];
DROP TABLE IF EXISTS [Farmacia_Medico];
DROP TABLE IF EXISTS [Farmacia_Paciente];
DROP TABLE IF EXISTS [Farmacia_Farmacia];
DROP TABLE IF EXISTS [Farmacia_Farmaceutica];
DROP TABLE IF EXISTS [Farmacia_Prescricao];
DROP TABLE IF EXISTS [Farmacia_Farmaco];
DROP TABLE IF EXISTS [Farmacia_Farmaco_Prescricao];

CREATE TABLE [Farmacia_Especialista] (
    [Codigo] [int] NOT NULL,
    [Nome] [varchar](128) NOT NULL,
    PRIMARY KEY ( [Codigo] )
)
GO

CREATE TABLE [Farmacia_Medico] (
    [SNS] [int] NOT NULL,
    [Especialista] [int] NOT NULL REFERENCES [Farmacia_Especialista]([Codigo]),
    [Nome] [varchar](128) NOT NULL,
    PRIMARY KEY ( [SNS] )
)
GO

CREATE TABLE [Farmacia_Paciente] (
    [N_Utente] [int] NOT NULL,
    [Nome] [varchar](128) NOT NULL,
    [Morada] [varchar](256) NOT NULL,
    [DOB] [date] NOT NULL,
    PRIMARY KEY ( [N_Utente] )
)
GO

CREATE TABLE [Farmacia_Farmacia] (
    [NIF] [int] NOT NULL,
    [Nome] [varchar](128) NOT NULL,
    [Morada] [varchar](256) NOT NULL,
    [Telefone] [int] NOT NULL,
    PRIMARY KEY ( [NIF] )
)
GO

CREATE TABLE [Farmacia_Farmaceutica] (
    [N_RN] [int] NOT NULL,
    [Nome] [varchar](128) NOT NULL,
    [Morada] [varchar](256) NOT NULL,
    [Telefone] [int] NOT NULL,
    PRIMARY KEY ( [N_RN] )
) 
GO

CREATE TABLE [Farmacia_Prescricao] (
    [Medico] [int] NOT NULL REFERENCES [Farmacia_Medico]([SNS]),
    [Paciente] [int] NOT NULL REFERENCES [Farmacia_Paciente]([N_Utente]),
    [N_Unico] [int] NOT NULL,
    [Data] [date] NOT NULL,
    PRIMARY KEY ( [N_Unico] )
)
GO

CREATE TABLE [Farmacia_Farmaco] (
    [Farmmacia] [int] NOT NULL REFERENCES [Farmacia_Farmacia]([NIF]),
    [Farmaceutica] [int] NOT NULL REFERENCES [Farmacia_Farmaceutica]([N_RN]),
    [Formula] [varchar](256) NOT NULL,
    [Nome_comercial] [varchar](128) NOT NULL,
    [novo_unico] [int] NOT NULL,
    PRIMARY KEY ( [novo_unico] )
)
GO

CREATE TABLE [Farmacia_Farmaco_Prescricao] (
    [Prescricao] [int] NOT NULL REFERENCES [Farmacia_Prescricao]([N_Unico]),
    [Farmaco] [int] NOT NULL REFERENCES [Farmacia_Farmaco]([novo_unico]),
    PRIMARY KEY ( [Prescricao], [Farmaco] )
)
GO
    

