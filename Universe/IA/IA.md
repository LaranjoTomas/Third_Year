# Agentes

<span style="color:#00b0f0">Agente</span> - entidade com capacidade de obter informaçao sobre o seu ambiente
	- usa sensores para percecionar ambiente
	- usa actuadores para interagir com ambiente

<span style="color:#00b0f0">Teste de Turing</span> - AI conversa com um humano. Se o humano nao conseguir distinguir entre um AI e outro humano, o AI é "inteligente"

<span style="color:#00b0f0">Mundo</span>: 
- **Acessivel** -> agente consegue recolher toda a informaçao do mundo
- **efectivamente acessivel** -> agente consegue recolher informaçao que necessita para uma ação
- **deterministico** -> se o estado resultante de uma açao for TOTALMENTE determinado pelo estado actual e pelos efeitos esperados dessa ação
- **episodico** -> se cada percepção-acção for independente das outras
- **<span style="color:#ff0000">dinamico</span>/<span style="color:#00b050">estatico</span>** -> se o mundo <span style="color:#ff0000">pode</span>/<span style="color:#00b050">nao pode</span> mudar enquanto o agente pensa
 - **<span style="color:#ff0000">continuo</span>/<span style="color:#00b050">discreto</span>** -> se a evoluçao do mundo é <span style="color:#ff0000">continua / sem saltos</span> / <span style="color:#00b050">com saltos</span>
	

<span style="color:#00b0f0">Agentes reativos</span> - reagem de acordo com as alteraçoes imediatas do mundo, sem considerar historico de açoes (de ele proprio)

<span style="color:#00b0f0">Agentes deliberativos</span> - tem modelo interno do mundo, permitindo planeamento de açoes, e consideram estados passados e antecipam futuras consequencias

<span style="color:#00b0f0">Arquitecturas de agentes</span>:
- Subsunção: Por camadas. Camada mais baixa é a mais reactiva. Camadas de cima dao "feed" para as camadas de baixo
- Três Torres: Perceçao -> Modelo -> Ação
- Três Camadas: Deliberativa -> Açoes Intermedias -> Reactiva
- CARL (jacobs do mr beast): ![[Pasted image 20240108193756.png]]

# Redes Semânticas

<span style="color:#00b0f0">Tipos de Relações:</span>
- Sub-tipo: mamifero
- Membro
- Relaçao objecto-objecto
- Relaçao conjunto-objecto
- Relacao conjunto-conjunto

![[Pasted image 20240108194505.png]]

<span style="color:#00b0f0">Herança:</span>
- Apenas em relaçoes "sub-tipo" e "membro"

<span style="color:#00b0f0">Metodos e Demonios:</span>
- Metodos: semantica parecida com POO
- Demonios: procedimento q sao executadas automaticamente quando certas operaçoes sao realizadas
- 
<span style="color:#00b0f0">Deduçao</span>: inferir casos particulares de regras gerais
<span style="color:#00b0f0">Induçao</span>: !Deduçao

# Linguagem KIF (KYS)

- Feita para representar conhecimento trocado entre agentes
- Pode tbm ser usada para modelos internos de um agente
- Semântica declarativa
- Tao ou mais expressiva que logica de 1ª ordem
- Permite representar meta-conhecimento
- Mundo é feito com objetos e relaçoes entre objetos
- Relaçao = conjunto arbitrario de listas de objetos
- Objetos podem ser concretos ou abstratos
- Objetos podem ser primitivos ou compostos

# Engenharia de Conhecimento

<span style="color:#00b0f0">Base de conhecimento:</span> Conjunto de representaçoes de factos e regras de funcionamento

<span style="color:#00b0f0">Engenharia de Conhecimento:</span> Processo ou actividade de construir bases de conhecimento

<span style="color:#00b0f0">Ontologia:</span> 
- Vocabulario sobre um dominio com relaçoes hierarquicas
- Objectivo é captar a essencia da organizaçao do conhecimento

# Redes de Bae

- Permitem representar conhecimento impreciso
- Grafo dirigido aciclico
# Pesquisa com propagação de restrições

<span style="color:#00b0f0">Problemas de atribuição:</span> Pretende atribuir valores a um conjunto de variaveis

<span style="color:#00b0f0">Métodos de resoluçao: </span>
- Construtivo
- Construtivo com propagaçao de restriçoes
- Melhorias sucessivas

![[Pasted image 20240108221349.png]]

Objectivo é dar um numero entre 0 e 9 a todas as letras de modo a que a soma seja true

F, O, R, T, U, W € {0, ..., 9} - Restringir sobre todas as variaveis
Agora restringimos para:
- O+O = R + 10 x CarryOver (restriçao sobre 3 variáveis (de ordem superior))
- W+W+CarryIn = U + 10 x CarryOver
Etc. para as outras colunas

# Pesquisa por melhorias sucessivas

<span style="color:#00b0f0">Montanhismo:</span>
- É visto como um problema de optimizar uma função
- Escolhe sempre a child com <span style="color:#ff0000">melhor avaliaçao</span>
- No backtracking
- if (current_node.value > child_node.value) then STOP

<span style="color:#00b0f0">Variantes:</span>
- Estocastico: escolhe <span style="color:#ff0000">aleatoriamente</span> entre as children que melhoram o value
- Primeira Escolha: escolhe <span style="color:#ff0000">aleatoriamente</span> entre as children <span style="color:#ff0000">ATÉ</span> encontrar uma com melhor value
- Reinicio Aleatorio: montanhismo normal mas com start_nodes random

<span style="color:#00b0f0">Recozimento Simulado:</span>
- Aceita children com values <span style="color:#ff0000">PIORES</span> que o atual
- Children escolhidos aleatoriamente
- Usa temperatura para terminar a pesquisa:
	- À medida que o tempo passa, a pesquisa arrisca cada vez menos quanto a aceitar alterações com ganho negativo

<span style="color:#00b0f0">Pesquisa local alargada:</span>
- Semelhante ao montanhismo, mas kinda como machine learning. Guarda estados anteriores, e à medida que pesquisa, vai descartando os estados com pior avaliaçao, e guardando os melhores children

<span style="color:#00b0f0">Pesquisa alargada estocastica:</span>
- Mesma cena, mas os children sao escolhidos aleatoriamente

<span style="color:#00b0f0">Algoritmos geneticos:</span>
- 

<span style="color:#00b0f0">Aprendizagem:</span>
- Supervisionada: cada exemplo contem uma instancia do que quer aprender
- Semi-supervisionada: uma pequena parte dos exemplos contem uma instancia do que quer aprender
- Por reforço: o agente aprende o seu comportamento tendo em conta as recompensas que recebe pelas suas ações
- Nao-supervisionada: o processo em si descobre o que quer aprender

<span style="color:#00b0f0">Aprendizagem de regras - pesquisa em profundidade ( greedy ):</span>
- Dado um grande numero de exemplos, quando eu fizer um novo teste, ira descartar as partes Negativas, e tentará maximizar as Positivas.

<span style="color:#00b0f0">Árvore de decisão: selecção do atributo de teste</span>
- Baseado na Teoria da Informação:
	- Entropia apriori: H(C) = -E p(Ci) x log2 (p(Ci))
	- Entropia aposteriori, dado o valor de um atributo: H(C|aj,k) = -Ei p(Ci |aj,k)log2
	- Entropia global aposteriori: H(C|Aj) = Ek p(aj,k) x H(C|aj,k)
- Ganho de informação:
	- I(C;Aj) = H(C) - H(C|Aj)
- Razão do ganho:
	- H(Aj) = -E p(aj,k) x log2(p(aj,k))
	- R(C;Aj) = I(C;Aj) / H(Aj)