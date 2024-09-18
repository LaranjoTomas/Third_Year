# BD: Projeto de Sistema de Gestão de Pedidos de Manutenção de uma Oficina Industrial // P9 - G4

## Breve Introdução

Um sistema de gestão de pedidos de manuntenção de uma oficina industrial para simplificar e melhorar todos os aspectos do processo de gerenciamento de pedidos numa oficina industrial. Abrange desde o registo inicial do pedido até à conclusão do serviço, com funcionalidades como gerenciar mão de obra.

### Análise de Requisitos

```

1. Registar um pedido de manutenção
2. Atribuir um técnico a um pedido
3. Registar a conclusão de um pedido
4. Consultar o histórico de pedidos
5. Consultar o histórico de pedidos de um técnico
6. Consultar o histórico de pedidos de uma máquina
7. maybe permitir alguma cena com garantia

```

![base!](base.png)

### Modelo de Entidade-Relacionamento

```
Entidades: Máquina, Pedido, Técnico, Supervisor, Garantia, Peça, Fornecedor, Compra

Atributos: 
Máquina: id_máquina, nome, tipo, marca, modelo, data_aquisição, id_garantia
Pedido: id_pedido, id_máquina, data_pedido, data_conclusão, estado (concluido, nao-concluido, em progresso, garantia), id_técnico, id_peça
Técnico: id_técnico, nome, especialidade, id_supervisor, DOB, contacto
Supervisor: id_supervisor, nome, DOB, contacto
Garantia: id_garantia, data_inicio, data_fim     
Peça: id_peça, nome, preço, id_fornecedor
Fornecedor: id_fornecedor, nome, contacto  
Compra: id_compra, id_peça, id_fornecedor, data_compra, quantidade, preço_total
           
Relacionamentos:

Máquina(id_máquina) -> Pedido(id_máquina): 1:N
Pedido(id_técnico) -> Técnico(id_técnico): N:1
Técnico(id_supervisor) -> Supervisor(id_supervisor): N:1
Garantia(id_máquina) -> Máquina(id_máquina): 1:1
Pedido(id_peça) -> Peça(id_peça): N:1
Peça(id_fornecedor) -> Fornecedor(id_fornecedor): N:1
Compra(id_peça) -> Peça(id_peça): 1:N
Compra(id_fornecedor) -> Fornecedor(id_fornecedor): 1:N
Técnico(id_técnico) -> Pedido(id_técnico): 1:N
Supervisor(id_supervisor) -> Técnico(id_supervisor): 1:N
Fornecedor(id_fornecedor) -> Compra(id_fornecedor): 1:N
Peça(id_peça) -> Compra(id_peça): 1:N
Máquina(id_garantia) -> Garantia(id_garantia): 1:1
Fornecedor(id_fornecedor) -> Peça(id_fornecedor): 1:N

```



### Diagrama Entidade-Relacionamento

![projeto_der!](projeto_der.png)