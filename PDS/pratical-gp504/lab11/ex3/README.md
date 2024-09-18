<!-- Tendo por base o padrão Mediator, descreva um problema e apresente uma implementação 
em Java onde aplique este padrão. 
Juntamente com o código entregue um ficheiro README onde descreva: 1) o problema; 2) 
a solução; 3) referências para recursos/fontes utilizados. -->

# Problem
The problem is to create a chat application where users can send messages to each other. The chat application should have a mediator that will receive the messages and send them to the correct user. The users should not know each other, they should only know the mediator. The mediator should be responsible for sending the messages to the correct user.

# Solution
The solution is to create a mediator that will receive the messages and send them to the correct user. The mediator will have a list of users and will be responsible for sending the messages to the correct user. The users will send the messages to the mediator and the mediator will send the messages to the correct user. The users should not know each other, they should only know the mediator. The mediator will then be responsible for sending the messages to the correct user. 

# Diagram
![alt text](Diagram.png)

# References
- (https://refactoring.guru/design-patterns/mediator) - Mediator Design Pattern
- (https://www.geeksforgeeks.org/mediator-design-pattern/) - Mediator Design Pattern
- (https://www.tutorialspoint.com/design_pattern/mediator_pattern.htm) - Mediator Design Pattern