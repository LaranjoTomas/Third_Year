# BD: Guião 8


## ​8.1. Complete a seguinte tabela.
Complete the following table.

| #   | Query                                                                                                      | Rows  | Cost    | Pag. Reads | Time (ms) | Index used                       | Index Op.                                            | Discussion |
| :-- | :--------------------------------------------------------------------------------------------------------- | :---- | :------ | :--------- | :-------- | :------------------------------- | :--------------------------------------------------- | :--------- |
| 1   | SELECT * from Production.WorkOrder                                                                         | 72591 | 0.484   | 531        | 1171      | PK                               | Clustered Index Scan                                 |            |
| 2   | SELECT * from Production.WorkOrder where WorkOrderID=1234                                                  | 1     | 0.00328 | 216        | 102       | PK                               | Clustered Index Seek                                 |            |
| 3.1 | SELECT * FROM Production.WorkOrder WHERE WorkOrderID between 10000 and 10010                               | 11    | 0.00329 | 20         | 121       | PK                               | Clustered Index Seek                                 |            |
| 3.2 | SELECT * FROM Production.WorkOrder WHERE WorkOrderID between 1 and 72591                                   | 72591 | 0.474   | 556        | 595       | PK                               | Clustered Index Seek                                 |            |
| 4   | SELECT * FROM Production.WorkOrder WHERE StartDate = '2007-06-25'                                          | 72591 | 0.473   | 1914       | 152       | PK                               | Clustered Index Scan                                 |            |
| 5   | SELECT * FROM Production.WorkOrder WHERE ProductID = 757                                                   | 9     | 0.00329 | 46         | 204       | ProductID                        | Index Seek (NonClustered) and Key Lookup (Clustered) |            |
| 6.1 | SELECT WorkOrderID, StartDate FROM Production.WorkOrder WHERE ProductID = 757                              | 9     | 0.00329 | 240        | 4         | ProductID Covered (StartDate)    | Index Seek (NonClustered) and Key Lookup (Clustered) |            |
| 6.2 | SELECT WorkOrderID, StartDate FROM Production.WorkOrder WHERE ProductID = 945                              | 1105  | 0.473   | 750        | 110       | ProductID Covered (StartDate)    | Clustered Index Scan (Clustered)                     |            |
| 6.3 | SELECT WorkOrderID FROM Production.WorkOrder WHERE ProductID = 945 AND StartDate = '2006-01-04'            | 1     | 0.474   | 558        | 3         | ProductID Covered (StartDate)    | Clustered Index Scan (Clustered)                     |            |
| 7   | SELECT WorkOrderID, StartDate FROM Production.WorkOrder WHERE ProductID = 945 AND StartDate = '2006-01-04' | 1     | 0.474   | 558        | 6         | ProductID and StartDate          | Clustered Index Scan (Clustered)                     |            |
| 8   | SELECT WorkOrderID, StartDate FROM Production.WorkOrder WHERE ProductID = 945 AND StartDate = '2006-01-04' | 1     | 0.473   | 752        | 5         | Composite (ProductID, StartDate) |                                                      |            |

## ​8.2.

### a)

```
CREATE TABLE mytemp (
    rid BIGINT IDENTITY (1, 1) NOT NULL,
    at1 INT NULL,
    at2 INT NULL,
    at3 INT NULL,
    lixo VARCHAR(100) NULL,
    CONSTRAINT PK_mytemp PRIMARY KEY CLUSTERED (rid)
);
ou 
CREATE UNIQUE CLUSTERED INDEX rid_index ON dbo.mytemp(rid)
```

### b)

```
Index depth 3, level 0:
	Avg_frag_% - 98.5 ; page_count - 823 ; avg_pag_space_% - 65.89
	
Index depth 3, level 1:
	Avg_frag_% - 0 ; page_count - 5 ; avg_pag_space_% - 85.69
	
Index depth 3, level 2:
	Avg_frag_% - 0 ; page_count - 2 ; avg_pag_space_% - 0.4

Index depth 0, level 0:
	Avg_frag_% - 0 ; page_count - 0 ; avg_pag_space_% - 0
```

### c)

```
FillFactor 65:
	Inserted 50000 total rows
	Milliseconds: 139085

FillFactor 80:
	Inserted 50000 total rows
	Milliseconds: 130025

FillFactor 90:
	Inserted 50000 total rows
	Milliseconds: 179238
```

### d)

```
CREATE TABLE mytemp ( 
	rid BIGINT IDENTITY (1, 1) NOT NULL, 
	at1 INT NULL, 
	at2 INT NULL, 
	at3 INT NULL, 
	lixo varchar(100) NULL 
);
SET IDENTITY_INSERT dbo.mytemp ON;

FillFactor 60:
	Inserted 50000 total rows
	Milliseconds: 190754

```

### e)

```
CREATE NONCLUSTERED INDEX at1_index ON my_temp(at1);
CREATE NONCLUSTERED INDEX at2_index ON my_temp(at2);
CREATE NONCLUSTERED INDEX at3_index ON my_temp(at3);
CREATE NONCLUSTERED INDEX lixo_index ON my_temp(lixo);

Com Indexes:
	Inserted 50000 total rows
	Milliseconds: 320463
	

Sem Indexes:
	Inserted 50000 total rows
	Milliseconds: 269233
```

## ​8.3.

```

a)
	I)
		CREATE UNIQUE CLUSTERED INDEX ssn_index ON Company.Employee(Ssn);
		
	II)
		CREATE NONCLUSTERED INDEX name_index ON Company.Employee(Fname, Lname);
		
	III)
		CREATE NONCLUSTERED INDEX department_index ON Company.Employee(Dno);
		CREATE NONCLUSTERED INDEX department_index ON Company.Department(Dnumber);
		
	IV)
		CREATE UNIQUE CLUSTERED INDEX project_index ON Company.Works_On(Essn, Pno);
		CREATE UNIQUE CLUSTERED INDEX project_index ON Company.Employee(Ssn);
		CREATE NONCLUSTERED INDEX project_index ON Company.Project(Pnumber);
		
	V)
		CREATE NONCLUSTERED INDEX dependent_index ON Company.Dependent(Essn);
		CREATE NONCLUSTERED INDEX dependent_index ON Company.Employee(Ssn);
		
	VI)
		CREATE NONCLUSTERED INDEX project_department_index ON Company.Project(Dnum);
		CREATE NONCLUSTERED INDEX project_department_index ON Company.Department(Dnumber);

```
