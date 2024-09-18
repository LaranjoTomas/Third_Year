DROP TABLE IF EXISTS [CarRent_Aluguer];
DROP TABLE IF EXISTS [CarRent_Pesado];
DROP TABLE IF EXISTS [CarRent_Ligeiro];
DROP TABLE IF EXISTS [CarRent_Similaridade];
DROP TABLE IF EXISTS [CarRent_Tipo_Veiculo];
DROP TABLE IF EXISTS [CarRent_Veiculo];
DROP TABLE IF EXISTS [CarRent_Balcão];
DROP TABLE IF EXISTS [CarRent_Cliente];

CREATE TABLE [CarRent_Cliente] (
    [NIF] [int] NOT NULL,
    [Endereco] [varchar](512) NOT NULL,
    [Num_Carta] [int] NOT NULL,
    [Nome] [varchar](128) NOT NULL,
    PRIMARY KEY ( [NIF] )
)
GO

CREATE TABLE [CarRent_Balcão] (
    [Numero] [int] NOT NULL,
    [Nome] [varchar](128) NOT NULL,
    [Endereco] [varchar](512) NOT NULL,
    PRIMARY KEY ( [Numero] )
)
GO

CREATE TABLE [CarRent_Tipo_Veiculo] (
    [Codigo] [int] NOT NULL,
    [Arcondicionado] [bit] NOT NULL,
    [Designacao] [varchar](128) NOT NULL,
    [Similaridade] [int] NOT NULL
    PRIMARY KEY ( [Codigo] )
)
GO

CREATE TABLE [CarRent_Veiculo] (
    [Matricula] [varchar](16) NOT NULL,
    [Marca] [varchar](128) NOT NULL,
    [Ano] [int] NOT NULL,
    [Tipo] [int] NOT NULL REFERENCES [CarRent_Tipo_Veiculo]([Codigo]),
    PRIMARY KEY ( [Matricula] )
)
GO

CREATE TABLE [CarRent_Similaridade] (
    [Codigo1] [int] NOT NULL REFERENCES [CarRent_Tipo_Veiculo]([Codigo]),
    [Codigo2] [int] NOT NULL REFERENCES [CarRent_Tipo_Veiculo]([Codigo]),
    PRIMARY KEY ( [Codigo1] )
)
GO

CREATE TABLE [CarRent_Ligeiro] (
    [Tipo_Veiculo] [int] NOT NULL REFERENCES [CarRent_Tipo_Veiculo]([Codigo]),
    [ID] [int] NOT NULL,
    [NumLugares] [int] NOT NULL,
    [NumPortas] [int] NOT NULL,
    [Combustivel] [varchar](128) NOT NULL,
    PRIMARY KEY ( [ID] )
)
GO

CREATE TABLE [CarRent_Pesado] (
    [Tipo_Veiculo] [int] NOT NULL REFERENCES [CarRent_Tipo_Veiculo]([Codigo]),
    [ID] [int] NOT NULL,
    [Passageiros] [int] NOT NULL,
    [Peso] [int] NOT NULL,
    PRIMARY KEY ( [ID] )
)
GO

CREATE TABLE [CarRent_Aluguer] (
    [Cliente] [int] NOT NULL REFERENCES [CarRent_Cliente]([NIF]),
    [Balcao] [int] NOT NULL REFERENCES [CarRent_Balcão]([Numero]),
    [Numero] [int] NOT NULL,
    [Data] [date] NOT NULL,
    [Duracao] [int] NOT NULL,
    [Veiculo] [varchar](16) NOT NULL REFERENCES [CarRent_Veiculo]([Matricula]),
    PRIMARY KEY ( [Numero] )
)
GO
