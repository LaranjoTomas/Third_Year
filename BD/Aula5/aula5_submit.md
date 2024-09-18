# BD: Guião 5


## ​Problema 5.1
 
### *a)*

```

(π Pname, Pnumber (project) ⨝ Pnumber = Pno works_on) ⨝ Essn = Ssn (π Fname, Lname, Ssn (employee))

```


### *b)* 

```

π Fname, Minit, Lname, employee.Ssn (employee ⨝ employee.Super_ssn = supSsn.Ssn (ρ supSsn (π Ssn (σ (Fname = 'Carlos' AND Minit = 'D' AND Lname = 'Gomes') (employee)))))


```


### *c)* 

```

π Pname, totalHours ((π Pname, Pnumber (project)) ⨝ Pnumber = Pno (γ Pno; sum(Hours) -> totalHours (works_on)))

```


### *d)* 

```

π Fname, Lname σ Dno = 3 (employee ⨝ Ssn = Essn σ Hours > 20 (works_on ⨝ Pno = Pnumber σ Pname = 'Aveiro Digital' (project)))

```


### *e)* 

```

π Fname, Lname (employee) - π Fname, Lname (employee ⨝ Ssn = Essn (works_on))

```


### *f)* 

```

π Dname,Fname, Lname, Salary (department ⨝ Dnumber = Dno (σ Sex='F' (employee)))

```


### *g)* 

```

π Fname, Lname, totalDepend σ totalDepend > 2 (employee ⨝ Ssn = Essn (γ Essn; count(Essn) -> totalDepend (dependent)))

```


### *h)* 

```

π Fname, Lname (employee ⨝ Ssn = Mgr_ssn (department)) - π Fname, Lname (employee ⨝ Ssn = Essn (dependent))

```


### *i)* 

```

π Fname, Lname, Address (employee ⨝ Ssn = Essn (works_on ⨝ Pno = Pnumber σ Plocation = 'Aveiro' (project))) - π Fname, Lname, Address (employee ⨝ Dno = dept_location.Dnumber (department ⨝ department.Dnumber = dept_location.Dnumber σ Dlocation = 'Aveiro' (dept_location)))

```


## ​Problema 5.2

### *a)*

```

π nome (fornecedor) - π nome (fornecedor ⨝ nif = fornecedor (encomenda)) 

```

### *b)* 

```

π  numero, AvgUnidades (encomenda ⨝ numero = numEnc (γ numEnc; avg(unidades) -> AvgUnidades (item)))

```


### *c)* 

```

γ;avg(num_prod)->media (γ numEnc;count(codProd)-> num_prod (item))

```


### *d)* 

```

π fornecedor.nome, produto.nome, item.unidades (fornecedor ⨝ nif = fornecedor (encomenda ⨝ numero = numEnc (item ⨝ codProd = codigo (produto))))

```


## ​Problema 5.3

### *a)*

```

π paciente.numUtente (paciente) - π paciente.numUtente (paciente ⨝ paciente.numUtente = prescricao.numUtente (prescricao))

```

### *b)* 

```

π especialidade, countPres (medico ⨝ numSNS = numMedico (γ numMedico; count(numPresc) -> countPres (prescricao)))

```


### *c)* 

```

(γ nome; count(numPresc) -> Prescricoes (prescricao ⨝ farmacia = nome farmacia))

```


### *d)* 

```

π nome σ numRegFarm = 906 (farmaco) - π nomeFarmaco σ numRegFarm = 906 (presc_farmaco)

```

### *e)* 

```

FARM_SELLED = σfarmacia!=null (presc_farmaco ⨝presc_farmaco.numPresc=prescricao.numPresc prescricao)
AUX_TABLE = γ farmacia, numRegFarm; count(numRegFarm)->qtd_farmacos FARM_SELLED
πfarmacia,nome,qtd_farmacos (AUX_TABLE ⨝numRegFarm=numReg farmaceutica)

```

### *f)* 

```

(γ numUtente; count(numMedico)->DiferentesMedicos (π numUtente,numMedico prescricao))

```
