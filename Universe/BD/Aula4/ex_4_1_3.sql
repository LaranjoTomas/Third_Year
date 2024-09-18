CREATE TABLE [Stocks_TipoDePagamento] (
	[Codigo] [int] NOT NULL,
	[Nome] [varchar](128) NOT NULL,
	PRIMARY KEY ( [Codigo] )
)
GO

CREATE TABLE [Stocks_TipoDeFornecedor] (
	[Codigo] [int] NOT NULL,
	[Nome] [varchar](128) NOT NULL,
	PRIMARY KEY ( [Codigo] )
)
GO

CREATE TABLE [Stocks_Fornecedor] (
	[NIF] [int] NOT NULL,
	[Nome] [varchar](128) NOT NULL,
	[Morada] [varchar](512) NOT NULL,
	[TipoDePagamento_Codigo] [int] NOT NULL REFERENCES [Stocks_TipoDePagamento] ([Codigo]),
	[TipoDeFornecedor_Codigo] [int] NOT NULL REFERENCES [Stocks_TipoDeFornecedor] ([Codigo]),
	PRIMARY KEY ( [NIF] )
)
GO

CREATE TABLE [Stocks_Encomenda] (
	[Numero] [int] NOT NULL,
	[Data] [date] NOT NULL,
	[Fornecedor] [int] NOT NULL REFERENCES [Stocks_Fornecedor] ([NIF]),
	PRIMARY KEY ( [Numero] )
)
GO

CREATE TABLE [Stocks_ProdutoDeEncomenda] (
	[ID] [int] NOT NULL,
	[Quantidade] [int] NOT NULL,
	[Encomenda] [int] NOT NULL REFERENCES [Stocks_Encomenda] ([Numero]),
	PRIMARY KEY ( [ID] )
)
GO

CREATE TABLE [Stocks_Produto] (
	[Codigo] [int] NOT NULL,
	[Nome] [varchar](128) NOT NULL,
	[Preco] [float] NOT NULL,
	[TaxaDeIva] [float] NOT NULL,
	[Quantidade] [int] NOT NULL,
	[ProdutoDeEncomenda_ID] [int] NOT NULL REFERENCES [Stocks_ProdutoDeEncomenda] ([ID]),
	PRIMARY KEY ( [Codigo] )
)