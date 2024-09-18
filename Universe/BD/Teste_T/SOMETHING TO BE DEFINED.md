
# Base de Dados 

**Sistema de Gestão de Ficheiros** 
	Problemas: 
		-Acesso concorrente aos dados
		-Integridade 
		-Segurança
**Sistema de Gestão de Base de Dados (SGBD)**
	Database Management System(DBMS): general-purpose software; facilita o processo de defining, constructing, manipulating and sharing databases.
	<br> **Defining -** Database catalog or dictionary
	<br> **Constructing -** Processo de armazenamento de dados
	<br> **Manipulating -** Operações como a pesquisa de dados
	<br> **Sharing -** Acesso simultâneo a dados vindo de utilizadores ou programas
	<br>
	SGBD é uma entidade única, opera com a BD. Existe interface de acesso, elevada abstração, dados integrados. Suporta N BDs.
	<br>
	**Vantagens :**
		- Independência entre programas e dados
		- Integridade de dados
		- Elevada abstração
		- Consistência de dados
		- Eficiência de acesso aos . concorrencial
		- Isolamento de utilizadores
		- Segurança
		- Backups
	<br>**Desvantagens:**
		- Maior custo e complexidade de download e manutenção
		- Centralização de dados mais expostos a falhas
	<br> **SGBD scheme -**
		![[Pasted image 20240408131309.png]]  
**Arquitetura ANSI/SPARCK**
	- **External Level:**
		- Domínio: Utilizadores finais e prog. de aplicações
		- Oferece vistas da BD adaptadas a cada utilizador
	- **Conceptual Level:**
		- Descreve a estrutura da BD para os utilizadores
		- Oculta details de implementação física
		- Domínio: Administrador BD e prog. de aplicações
	- **Internal Level:**
		- Lida com a implem. física da BD
		- Domínio: Programadores de sistemas de BD
	<br> **Independência de dados:**
		**==Dois níveis de independência:==**
			- **==Físico==**
				- Alterações aqui não devem impactar o conceptual
			- **==Lógico==**
				- Alterações no conceptual não devem afetar os esquemas externos ou aplicações já criadas.
		<br> ![[Pasted image 20240408132945.png]]
**Modelo de Base de Dados**
	- **Modelo de BD:** conjunto de conceitos para descrição lógica de dados
	- **Schema:** descrição de um conjunto de dados com recurso a um determinado modelo
	- Bom **modelo** é fundamental para independência dos dados
	- **==Modelo Relacional==** é o mais usado 
	<br> **1ª Geração -** Hierárquico, Rede
	<br> **2ª Geração -** ==Relacional==
	<br> **3ª Geração -** No one cares

# Desenho de BD
	![[Pasted image 20240408133940.png]]
	**SGBD - Independent**
		 **Análise de Requisitos:**
			Comunicação com o cliente para definir a estrutura da base de dados inclui: identificação de dados essenciais, filtragem para remover redundâncias, esclarecimento de dúvidas e diferenciação entre dados e operações.
		<br> **Desenho Conceptual:**
			- Modelo Conceptual
			A modelação mapeia entidades e relações do mundo real para conceitos de base de dados, não sendo determinística nem sempre clara. Oferece uma visão abstrata da estrutura da base de dados e é geralmente realizada através da técnica do Modelo Entidade/Relacionamento (E/R).
	<br> **DER** 
		**Entidades :**
			- Fortes
			- Fracas
		**Atributos:**
			- Derivados
			- Multivalor (pode ter vários valores)
			- Compostos ( tem outros atributos a descreve-los)
		**Relacionamentos:**
			- Grau 
				- Unária
					- Recursivos - assimétricas (necessita indicar os roles) e simétricas
				- Binária
				- Ternária
				- Múltiplos
			- Obrigatoriedade
				- Participação Total (obrigatório)
				- Participação parcial (opcional)
			- Cardinalidade
				- 1:1
				- 1:N
				- N:M
	<br>**Modelo Relacional:**
		- Representado por ==Tabelas==
		- Sistema de manipulação é ==Álgebra Relacional==
	<br>**Chaves:**
		• Superchave (superkey): conjunto de atributos que identificam de forma única os tuplos da relação. 
		• Chave Candidata (candidate key): subconjunto de atributos de uma superchave que não pode ser reduzido sem perder essa qualidade de superchave.
		 • Chave Primária (primary key): chave principal selecionada de entre as chaves candidatas.
		  • Chave Única (unique key): chave candidata não eleita como primária. 
		  • Chave Estrangeira ou importada (foreign key): conjunto de um ou mais atributos que é chave primária noutra relação.
	  <br>**Regras de Codd (12):**
		1 - Representação de informação, representados de uma só forma os dados
		2 - Acesso Garantido, 
		3 - Suporte sistemático de valores nulos
		4 - Catálogo activo e disponível, metadados e dados acedidos da mesma maneira
		5 - Linguagem completa
		6 - Regra da atualização de vistas (view) **(Próxima matéria)**
		7 - Operações de alto-nível, tratar tabela como operando
		8 - Independência física dos dados
		9 - Independência lógica dos dados, alterações no esquema da BD não deve afetar o nível externo
		10- Restrições de integridade
		11- Independência da localização
		12- Não subversão      