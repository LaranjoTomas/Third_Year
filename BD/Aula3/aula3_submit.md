# BD: Guião 3


## ​Problema 3.1
 
### *a)*

```
Ligeiro: ID, Tipo_Veiculo_Codigo, numlugares, portas, combustivel
Pesado: ID, Tipo_Veiculo_Codigo, peso, passageiros
Tipo_Veiculo: codigo, designacao, arcondicionado
Similares: Tipo_Veiculo_Codigo1, Tipo_Veiculo_Codigo2
Veiculo: matricula, ano, marca, Tipo_Veiculo_Codigo
Cliente: NIF, nome, endereco, num_carta
Balcao: Numero, nome, endereco
Aluger: Numero, duracao, data

```

Ligeiro: <u>ID</u>, numlugares, portas, combustivel.

Pesado: <u>ID</u>, peso, passageiros

Tipo_Veiculo: <u>Codigo</u>, designacao, arcondicionado

Similares: <u>Tipo_Veiculo_Codigo1</u>, <u>Tipo_Veiculo_Codigo2</u>

Veiculo: <u>matricula</u>, ano, marca, <u>Tipo_Veiculo_Codigo</u>

Cliente: <u>NIF</u>, nome, endereco, num_carta

Balcao: <u>Numero</u>, nome, endereco

Aluger: <u>Numero</u>, duracao, data, Cliente_NIF, Veiculo_matricula, Balcao_Numero


### *b)* 

```

Cliente: 
Chaves Candidatas: NIF, num_carta
Chaves Primárias (PK): NIF
Chaves(s) Estrangeiras(s) (FKs): Não tem

Veiculo:
Chaves Candidatas: matricula
Chaves Primárias (PK): matricula
Chaves(s) Estrangeiras(s) (FKs): Tipo_Veiculo_Codigo

Tipo_Veiculo:
Chaves Candidatas:
Chaves Primárias (PK):
Chaves(s) Estrangeiras(s) (FKs):

Aluger: 
Chaves Candidatas: Numero, (Cliente_NIF + Veiculo_matricula + Balcao_Numero + Data)
Chaves Primárias (PK): Numero
Chaves(s) Estrangeiras(s) (FKs): Cliente_NIF, Veiculo_matricula, Balcao_Numero

Balcao:
Chaves Candidatas: Numero
Chaves Primárias (PK): Numero
Chaves(s) Estrangeiras(s) (FKs): Não tem

Ligeiro:
Chaves Candidatas: ID
Chaves Primárias (PK): ID
Chaves(s) Estrangeiras(s) (FKs): Não tem

Pesado:
Chaves Candidatas: ID
Chaves Primárias (PK): ID
Chaves(s) Estrangeiras(s) (FKs): Não tem

```


### *c)* 

![ex_3_1c!](ex_3_1c.jpg "AnImage")


## ​Problema 3.2

### *a)*

```

Airport: Airport_Code, Name, City, State
Airlane_type: type_name, max_seats, company
Airplane: Airplane_ID, Max_seats
Seat: seat_number, customer_name, customer_phone
Flight_leg: leg_number, scheduled_arr_time, scheduled_dep_time
Leg_instance: available_seats, date, arr_time, dep_time
Flight: number, airline, weekdays
Fare: code, amount, restrictions

```


### *b)* 

```

Airport:
Chaves Candidatas: Airport_Code
Chaves Primárias (PK): Airport_Code
Chaves(s) Estrangeiras(s) (FKs): Não tem

Airlane_type:
Chaves Candidatas: type_name
Chaves Primárias (PK): type_name
Chaves(s) Estrangeiras(s) (FKs): Não tem

Airplane:
Chaves Candidatas: Airplane_ID
Chaves Primárias (PK): Airplane_ID
Chaves(s) Estrangeiras(s) (FKs): Não tem

Flight:
Chaves Candidatas: number
Chaves Primárias (PK): number
Chaves(s) Estrangeiras(s) (FKs): Não tem

Flight_leg:
Chaves Candidatas: (Flight_number + leg_number + Airport_Airport_Code)
Chaves Primárias (PK): (Flight_number + leg_number + Airport_Airport_Code)
Chaves(s) Estrangeiras(s) (FKs): Flight_number, Airport_Airport_Code

leg_instance:
Chaves Candidatas: (Flight_number + leg_number + Airport_Airport_Code + date + Airplane_Airplane_ID)
Chaves Primárias (PK): (Flight_number + leg_number + Airport_Airport_Code + date)
Chaves(s) Estrangeiras(s) (FKs): Flight_number, Airport_Airport_Code

Seat:
Chaves Candidatas: (Flight_number + leg_number + Airport_Airport_Code + date + Airplane_Airplane_ID + seat_number)
Chaves Primárias (PK): (Flight_number + leg_number + Airport_Airport_Code + date + Airplane_Airplane_ID + seat_number)
Chaves(s) Estrangeiras(s) (FKs): Flight_number, Airport_Airport_Code, Airplane_Airplane_ID

Fare:
Chaves Candidatas: (Flight_number + code)
Chaves Primárias (PK): (Flight_number + code)
Chaves(s) Estrangeiras(s) (FKs): Flight_number

```


### *c)* 

![ex_3_2c!](ex_3_2c.jpg "AnImage")


## ​Problema 3.3


### *a)* 2.1

![ex_3_3_a!](ex_3_3a.jpg "AnImage")

### *b)* 2.2

![ex_3_3_u!](ex_3_3u.jpg "AnImage")

### *c)* 2.3

![ex_3_3_c!](ex_3_3c.jpg "AnImage")

### *d)* 2.4

![ex_3_3_d!](ex_3_3d.jpg "AnImage")