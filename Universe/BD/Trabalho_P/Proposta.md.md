# BD: Projeto de Sistema de Gestão de Pedidos de Manutenção de uma Oficina Industrial // P9 - G
## Breve Introdução 
```Um sistema de gestão de pedidos de manuntenção de uma oficina industrial para simplificar e melhorar todos os aspectos do processo de gerenciamento de pedidos numa oficina industrial. Abrange desde o registo inicial do pedido até à conclusão do serviço, com funcionalidades como gerenciar mão de obra. ```
### Análise de Requisitos 
``` 1. Registar um pedido de manutenção 
    2. Atribuir um técnico a um pedido 
    3. Registar a conclusão de um pedido 
    4. Consultar o histórico de pedidos 
    5. Consultar o histórico de pedidos de um técnico 
    6. Consultar o histórico de pedidos de uma máquina 
    7. maybe permitir alguma cena com garantia 
``` 

![base!](base.png) 
### Modelo de Entidade-Relacionamento 
``` Entidades: Máquina, Pedido, Técnico Atributos: Máquina: id_máquina, nome, tipo, marca, modelo, data_aquisição, data_fim_garantia??? Pedido: id_pedido, id_máquina, data_pedido, data_conclusão, estado (concluido, nao-concluido, em progresso, garantia), id_técnico Técnico: id_técnico, nome, especialidade Garantia: id_garantia, id_maquina, data_inicio, data_fim 
Relacionamentos: 

```
### Diagrama Entidade-Relacionamento 
![projeto_der!](projeto_der.png)