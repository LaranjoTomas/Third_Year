CREATE TABLE [ATL_Professor] (
    [Nº_CC] [int] NOT NULL,
    [telef] [int] NOT NULL,
    [Email] [varchar](128) NOT NULL,
    [Nº_Funcionario] [int] NOT NULL,
    [Nome] [varchar](128) NOT NULL,
    [Morada] [varchar](128) NOT NULL,
    [DOB] [date] NOT NULL,
    PRIMARY KEY ( [Nº_Funcionario] )
)
GO

CREATE TABLE [ATL_Turma] (
    [ID] [int] NOT NULL,
    [Classe] [varchar](128) NOT NULL,
    [Escolaridade] [varchar](128) NOT NULL,
    [Ano_Letivo] [int] NOT NULL,
    [Nº_Max] [int] NOT NULL,
    [Professor_Nº_Funcionario] [int] NOT NULL REFERENCES [ATL_Professor] ([Nº_Funcionario]),
    PRIMARY KEY ( [ID] )
)
GO

CREATE TABLE [ATL_Atividade] (
    [ID] [int] NOT NULL,
    [Designação] [varchar](128) NOT NULL,
    [Custo] [varchar](128) NOT NULL,
    [Turma_ID] [int] NOT NULL REFERENCES [ATL_Turma] ([ID]),
    PRIMARY KEY ( [ID] )
)
GO

CREATE TABLE [ATL_EncarregadoDeEducacao] (
    [Nº_CC] [int] NOT NULL,
    [Nome] [varchar](128) NOT NULL,
    [Morada] [varchar](128) NOT NULL,
    [Telefone] [int] NOT NULL,
    [Email] [varchar](128) NOT NULL,
    [DOB] [date] NOT NULL,
    [Relação] [varchar](128) NOT NULL,
    PRIMARY KEY ( [Nº_CC] )
)
GO

CREATE TABLE [ATL_PessoasComAutorização] (
    [Nº_CC] [int] NOT NULL,
    [Nome] [varchar](128) NOT NULL,
    [Morada] [varchar](128) NOT NULL,
    [Telefone] [int] NOT NULL,
    [Email] [varchar](128) NOT NULL,
    [DOB] [date] NOT NULL,
    PRIMARY KEY ( [Nº_CC] )
)
GO

CREATE TABLE [ATL_Aluno] (
    [Nº_CC] [int] NOT NULL,
    [Nome] [varchar](128) NOT NULL,
    [Morada] [varchar](128) NOT NULL,
    [Telefone] [int] NOT NULL,
    [Email] [varchar](128) NOT NULL,
    [DOB] [date] NOT NULL,
    [Atividade_ID] [int] NOT NULL REFERENCES [ATL_Atividade] ([ID]),
    [EncarregadoDeEducacao_Nº_CC] [int] NOT NULL REFERENCES [ATL_EncarregadoDeEducacao] ([Nº_CC]),
    [PessoasComAutorização_Nº_CC] [int] NOT NULL REFERENCES [ATL_PessoasComAutorização] ([Nº_CC]),
    PRIMARY KEY ( [Nº_CC] )
)
GO

CREATE TABLE [ATL_ATL] (
    [Turma_ID] [int] NOT NULL REFERENCES [ATL_Turma] ([ID]),
    PRIMARY KEY ( [Turma_ID] )
)
GO