# BD: Guião 9


## ​9.1

<!-- Construa um stored procedure que aceite o ssn de um funcionário, que o remova da 
tabela de funcionários, que remova as suas entradas da tabela works_on e que remova 
ainda  os  seus  dependentes.  Que  preocupações  adicionais  devem  ter  no  storage 
procedure para além das referidas anteriormente? -->
 
### *a)*

```
GO
CREATE PROCEDURE RemoveEmployeeFromEmployees @ssn INT 
AS
	BEGIN
		DELETE FROM Company.Dependent WHERE Essn=@ssn;
		DELETE FROM Company.Works_on WHERE Essn=@ssn;
		UPDATE Company.Employee SET Super_ssn=NULL WHERE Super_ssn=@ssn;
		UPDATE Company.Department SET Mgr_ssn=NULL WHERE Mgr_ssn=@ssn;
		DELETE FROM Company.Employee WHERE Ssn=@ssn;
	END;

Preocupações adicionais: Verificação da existência do Ssn, restrições de chave estrangeira e tratamento de exceções
EXEC RemoveEmployeeFromEmployees 21312332;
```
<!-- 
Crie um stored procedure que retorne um record-set com os funcionários gestores 
de departamentos, assim como o ssn e número de anos (como gestor) do funcionário 
mais antigo dessa lista.  -->

### *b)* 

```
GO
CREATE PROCEDURE GETMANAGERINFO (@mgr_ssn INT OUTPUT, @worked_yrs INT OUTPUT)
AS
BEGIN
    -- Retorna o Ssn de todos os gerentes
    SELECT E.Ssn
    FROM Company.Employee E
    INNER JOIN Company.Department D ON E.Ssn = D.Mgr_ssn;

    -- Configura @mgr_ssn e @worked_yrs para o Ssn e o número de anos do gerente mais antigo
    SELECT TOP 1 @mgr_ssn = E.Ssn, @worked_yrs = DATEDIFF(year, D.Mgr_start_date, GETDATE())
    FROM Company.Employee E
    INNER JOIN Company.Department D ON E.Ssn = D.Mgr_ssn
    ORDER BY D.Mgr_start_date ASC;
END
GO

DECLARE @ssn INT;
DECLARE @years INT;
EXEC GETMANAGERINFO @ssn OUTPUT,
PRINT @ssn;
PRINT @years;
```
<!-- 
Construa um  trigger  que  não permita  que  determinado  funcionário  seja  definido 
como gestor de mais do que um departamento. -->

### *c)* 

```
CREATE TRIGGER PreventManagerFromMultipleDepartments 
  ON Company.Department 
  AFTER UPDATE, INSERT 
AS
BEGIN
	DECLARE @employee_ssn as INT;
		IF (SELECT COUNT(*) FROM inserted) > 0
		  BEGIN
		    SELECT TOP 1 @employee_ssn = Mgr_ssn FROM inserted;
		    IF @employee_ssn IS NULL OR (SELECT COUNT(*) FROM Employee WHERE Ssn = @employee_ssn) = 0
		      RAISERROR('Employee with SSN %d does not exist.', 16, 1);
		    ELSE
		      BEGIN
		        IF EXISTS (SELECT COUNT(Dnumber) FROM Company.Department WHERE Mgr_ssn=@employee_ssn) >= 1
		          RAISERROR('Employee cannot manage more than one department.', 16, 1);
		        ELSE
			          INSERT INTO Company.Department SELECT * FROM inserted;
		        END
			END
		END
	END;
END;

-- Execute separate queries after trigger definition
SELECT * FROM Company.Department;
SELECT * FROM Company.Employee;

-- Sample Inserts (assuming Dept_Start_Date is a date column)
INSERT INTO Company.Department VALUES ('TESTING', 5, 11111111, '2024-12-01');
INSERT INTO Company.Department VALUES ('AVERAGEJONES', 5, 999999999, '2024-12-02');
INSERT INTO Company.Department VALUES ('WDWDWDWDWD', 5, NULL, '2024-12-03');
```

<!-- Crie um trigger que não permita que determinado funcionário tenha um vencimento 
superior ao vencimento do gestor do seu departamento. Nestes casos, o trigger deve 
ajustar o salário do funcionário para um valor igual ao salário do gestor menos uma 
unidade. -->

### *d)* 

```
CREATE TRIGGER AdjustSalaryToManager 
  ON Company.Employee 
  AFTER UPDATE, INSERT
AS
BEGIN
	DECLARE @employee_ssn as INT;
	DECLARE @employee_salary as INT;
	DECLARE @dno as INT;
	DECLARE @manager_salary as INT;

	SELECT TOP 1 @employee_ssn = Ssn, @employee_salary = Salary, @dno = Dno FROM inserted;
	SELECT TOP 1 @manager_salary = Company.Employee.Salary FROM Company.Department INNER JOIN Company.Employee ON Company.Department.Mgr_ssn = Company.Employee.Ssn WHERE @dno = Dnumber;

	IF @employee_salary > @manager_salary
	BEGIN
		UPDATE Company.Employee SET Salary = @manager_salary - 1 WHERE Ssn = @employee_ssn;
	END
END;

-- Execute separate queries after trigger definition
INSERT INTO Company.Employee VALUES ("John", "A", "Doe", 11111111, "2024-12-01", "STREET SOMEWHERE" , "M", 10000000, 5);
INSERT INTO COMPANY.Employee VALUES ("Jane", "B", "Doe", 11111112, "2024-12-01", "STREET SOMEWHERE" , "F", 10000001, 5);
SELECT * FROM Company.Employee;
```
<!-- 
Crie uma UDF que, para determinado funcionário (ssn), devolva o nome e localização 
dos projetos em que trabalha -->

### *e)* 

```
CREATE FUNCTION GetProjectsForEmployee (@ssn INT)
RETURNS @TABLE
TABLE([PPname] VARCHAR(50), [PPlocation] VARCHAR(50))
AS
BEGIN
	INSERT INTO @TABLE
		SELECT Pname, Plocation FROM Company.Project INNER JOIN Company.Works_on ON Works_on.Pno = Project.Pnumber WHERE Works_on.Essn=@ssn
	RETURN
END
SELECT * FROM Company.PROJECT;
SELECT * FROM Company.WORKS_ON;
SELECT * FROM GetProjectsForEmployee(11111111);
SELECT * FROM GetProjectsForEmployee(11111112);
SELECT * FROM GetProjectsForEmployee(11111113);

```

<!-- Crie uma UDF que, para determinado departamento (dno), retorne os funcionários com um vencimento superior à média dos vencimentos desse departamento -->

### *f)* 

```
CREATE FUNCTION GetEmployeesAboveAverageSalary (@dno INT) 
RETURNS @TABLE
TABLE([Fname] VARCHAR(50), [Lname] VARCHAR(50), [Salary] INT)
AS
BEGIN
	INSERT INTO @TABLE
		SELECT Fname, Lname, Salary FROM Company.Employee WHERE Salary > (SELECT AVG(Salary) FROM Company.Employee WHERE Dno=@dno)
	RETURN
END

SELECT * FROM Company.Employee;
SELECT * FROM GetEmployeesAboveAverageSalary(5);
SELECT * FROM GetEmployeesAboveAverageSalary(10);
SELECT * FROM GetEmployeesAboveAverageSalary(15);

```
<!-- 
Crie uma UDF que, para determinado departamento, retorne um record-set com os 
projetos desse departamento. Para cada projeto devemos ter um atributo com seu o 
orçamento  mensal  de  mão  de  obra  e  outra  coluna  com  o  valor  acumulado  do 
orçamento.   
Nota: parta do princípio que um funcionário trabalha 40 horas por semana para o 
cálculo do custo da sua afetação ao projeto. -->

### *g)* 

```
CREATE FUNCTION GetProjectsForDepartment (@dno INT)
RETURNS @TABLE
TABLE([Pname] VARCHAR(50), [Pnumber] INT, [Plocation] VARCHAR(50), [Dnum] INT, [Budget] DECIMAL(10,2), [Total_Budget] DECIMAL(10,2))
AS
BEGIN
	INSERT INTO @TABLE
		SELECT Pname, Pnumber, Plocation, Dnum, Budget, SUM(Budget) OVER (PARTITION BY Pname) AS Total_Budget
		FROM Company.Project
		INNER JOIN Company.Works_on ON Works_on.Pno = Project.Pnumber
		WHERE Dnum=@dno
	RETURN
END

SELECT * FROM Company.PROJECT;
SELECT * FROM Company.WORKS_ON;
SELECT * FROM GetProjectsForDepartment(1);
SELECT * FROM GetProjectsForDepartment(2);
SELECT * FROM GetProjectsForDepartment(3);
```

<!-- Pretende-se criar um trigger que, quando se elimina um departamento, este passe para 
uma tabela department_deleted com a mesma estrutura da department. Caso esta 
tabela não exista então deve criar uma nova e só depois inserir o registo. Implemente 
a  solução  com  um  trigger  de  cada  tipo  (after  e  instead of).  Discuta  vantagens  e 
desvantagem de cada implementação. 
Utilize a seguinte instrução para verificar se determinada tabela existe: 
   IF (EXISTS (SELECT * FROM INFORMATION_SCHEMA.TABLES  
     WHERE TABLE_SCHEMA = 'myschema' AND  TABLE_NAME = 'mytable')) -->

### *h)* 

```
CREATE TRIGGER DepartmentDeletedAfter
  ON Company.Department
  AFTER DELETE
AS
BEGIN
	IF (EXISTS (SELECT * FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = 'Company' AND TABLE_NAME = 'Department_Deleted'))
	BEGIN
		INSERT INTO Company.Department_Deleted SELECT * FROM deleted;
	END
	ELSE
	BEGIN
		CREATE TABLE Company.Department_Deleted AS SELECT * FROM Company.Department WHERE 1=0;
		INSERT INTO Company.Department_Deleted SELECT * FROM deleted;
	END
END
```

<!-- Relativamente  aos  stored  procedure  e  UDFs,  enumere  as  suas  mais  valias  e  as 
características que as distingue. Dê exemplos de situações em que se deve utiliza cada 
uma destas ferramentas -->

### *i)* 

```
Stored Procedures:
	- Vantagens:

		- Centralizam a lógica de negócios.
		- Melhoram a performance.
		- Controlam a segurança dos dados.
		- Promovem a reutilização de código.

	- Exemplos de uso:

		- Atualizações complexas em várias tabelas.
		- Processamento em lote.
		- Validações de negócios.
		- User-Defined Functions (UDFs):

	- Vantagens:

		- Encapsulam lógica de cálculo.
		- Facilitam o uso em consultas.
		- Simplificam consultas complexas.
		- São flexíveis com parâmetros e retorno de valores.

	- Exemplos de uso:

	- Conversão de unidades.
	- Cálculos complexos em várias consultas.
	- Formatação de strings ou datas.

Distinções:
	- Retorno de Valor: Stored procedures podem retornar zero ou mais valores, enquanto UDFs sempre retornam um valor.
	
	- Contexto de Uso: Stored procedures para manipulação de dados e lógica de negócios; UDFs para cálculos e transformações de dados em consultas.
	
	- Chamada: Stored procedures são chamadas explicitamente com EXECUTE ou pelo nome; UDFs são chamadas como funções regulares em consultas SQL.
```
