4.(cores: vermelho, verde, cinza, laranja, roxo, rosa)
 ![[Pasted image 20240109141848.png]]
	A) R: No mínimo é necessário 3 cores.
		A- vermelho
		B- verde
		C- vermelho
		D- verde
		E- roxo
	B) R: No mínimo é necessário 4 cores.
		A- vermelho
		B-  verde
		C- rosa
		D- verde
		E- roxo
		F- vermelho
	C) R: No mínimo é necessário 4 cores.
		A- vermelho
		B- verde
		C- vermelho
		D- rosa
		E- verde
		F- rosa
		G- roxo

5. André, Bernardo and Claudio take a bike ride. Each one rides one of their friends’ bikes and takes the hat of one of the others. The bearer of Claudio’s hat rides Bernardo’s bicycle. What bike and hat does each friend carry?
	A)  Represent the problem through a constraint graph.
	![[Pasted image 20240109144639.png]]
	B)Use the module constraint search to solve the problem.
	   
	A, B, C: Representam as bicicletas que o Andre, Bernardo e Claudio têm, respectivamente.
	   
	Ac, Bc, Cc: Representam os chapéus de Andre, Bernardo e Claudio estão a usar, respectivamente.
	   
	André, Bernardo, Claudio: Representam as bicicletas e chapéus dos amigos, respetivamente. Por exemplo, André == B & Cc, diz que o André tem a bicicleta do bernardo e  o chapéu do claudio 
	   
	Cada Amigo usa uma bicicleta e chapéu diferente dos outros amigos:
		r1: lambda André, Bernardo, Claudio: André != Bernardo != Claudio	   
	Quem usa o chapéu do claudio anda na bicicleta do bernardo:
	    r2: lambda André, A, Ac, Bernardo, B, Bc, Claudio, C, Cc: André == B & Cc

	André == A & Ac <span style="color:#ff0000">X</span>
	André == A & Bc <span style="color:#ff0000">X</span>
	André == A & Cc <span style="color:#ff0000">X</span>
	André == B & Ac <span style="color:#ff0000">X</span>
	André == B & Bc <span style="color:#ff0000">X</span>
	André == B & Cc <span style="color:#00b050">X</span>
	André == C & Ac <span style="color:#ff0000">X</span>
	André == C & Bc <span style="color:#00b050">X</span>
	André == C & Cc <span style="color:#ff0000">X</span>

	Bernardo == A & Ac <span style="color:#ff0000">X</span>
	Bernardo == A & Bc <span style="color:#ff0000">X</span>
	Bernardo == A & Cc <span style="color:#00b050">X</span>
	Bernardo == B & Ac <span style="color:#ff0000">X</span>
	Bernardo == B & Bc <span style="color:#ff0000">X</span>
	Bernardo == B & Cc <span style="color:#ff0000">X</span>
	Bernardo == C & Ac <span style="color:#00b050">X</span>
	Bernardo == C & Bc <span style="color:#ff0000">X</span>
	Bernardo == C & Cc <span style="color:#ff0000">X</span>
	
	Claudio == A & Ac <span style="color:#ff0000">X</span>
	Claudio == A & Bc <span style="color:#00b050">X</span>
	Claudio == A & Cc <span style="color:#ff0000">X</span>
	Claudio == B & Ac <span style="color:#00b050">X</span>
	Claudio == B & Bc <span style="color:#ff0000">X</span>
	Claudio == B & Cc <span style="color:#00b050">X</span>
	Claudio == C & Ac <span style="color:#00b050">X</span>
	Claudio == C & Bc <span style="color:#ff0000">X</span>
	Claudio == C & Cc <span style="color:#ff0000">X</span>

6. Consider the following Sudoku puzzle where each row, column and square of 3 by 3 must be filled with numbers from 1 to 9 without repetitions. Present an approach to solving this puzzle using Constraint Propagation Search. Indicate which variables, their domain, and the constraints to consider.
	 ![[Pasted image 20240109160548.png]]

	Variables:
		 9 rows x 9 columns(81 cells)
	Domain:
		{1,2,3,4,5,6,7,8,9}
	Constraints:
		Row Constraint:
			No repeated digit in a row
		Column Constraint:
			No repeated digit in a column
		Square Constraint:
			No repeated digit in each square
		Initial values Constraint:
			Must respect existing values already placed on board
	**Example Constraints (for a single variable i, j):**
	- Row Constraint: `for k in range(1, 10): i != k for j' != j` 
	- Column Constraint: `for k in range(1, 10): i != k for i' != i` (it asserts that the current cell´s value 'i' must be different from the values of other cells in the same column)
	- Square Constraint: `for k in range(1, 10): i != k for i' != i, j' != j` (it asserts that the current cell's value `k` must be different from the values of other cells in the same 3x3 square
	- `i' != i` where `i'` iterates over all other cells in the same row. `j' != j` where `j'` iterates over all other columns in the same row


7. Does the special case of simulated annealing with temperature T = 0 have significant similarities with any other known search technique? In this case, identify the main similarities and differences.

	R: A pesquisa irá terminar quando a temperatura chega ao ter o valor 0. Tem semelhanças com a pesquisa por melhorias sucessivas, montanhismo. Sendo recozimento simulado uma variante de montanhismo é obvio que eles possuem semelhanças entre si. Por exemplo, o próximo estado é escolhido baseado na melhoria que ele faz em relação ao estado atual, e ambos fazem movimentos que levam a melhorar or igualar a solução(colinas), com alvo de ascender a qualidade da paisagem(zonas de soluções menos satisfatórias) com foco num ótimo "local".
	   As diferenças entre estes dois são:  o recozimento simulado pode aceitar movimentos que piorem a solução com uma probabilidade decrescente, que o deixa explorar o espaço da solução mais abrangentemente; em montanhismo o movimento só é aceite se isso levar a uma melhoria no objetivo da função, ao contrário, recozimento simulado introduz randomness e a possibilidade de aceitar piores movimentos quando a temperatura não está a zero.
8. In order to solve it through constraint search, formulate the problem of scheduling four tasks (A, B, C and D) taking into account the following information: • Tasks start at whole hours, from 8h on a certain day, and finish no later than 19h on the same day. • The duration of the tasks is as follows: A - 1h, B - 2h, C - 3h, D - 4h. • The A task must finish before the B and C tasks begin. • The D task should start after the B and C tasks finish. • Tasks cannot be performed simultaneously.

	Variables:
		{A,B,C,D}
	Domain:
		Duration(A:1 hora, B:2 horas, C: 3 horas, D: 4 horas)
		A: {8,...,18} 
		B: {8,...,17} 
		C: {8,...,16} 
		D: {8,...,15}
	Constraints:
		Task1 tem de terminar antes de task2 e Task3 começar:
		    r1: (Finish(task1))->(Can_Start(Task2) ^ Can_Start(Task3))
		Task1 cannot start at the same time as Task2:
			r2:lambda Task1,Task2,Time1,Time2 = Time1 != Time2 
		Task2 cannot start while Task1 is being performed:
			r3:lambda Task1,Task2,Time1,Time2 = Time2 ∉ {Time1,...,Time1 +Duration(Task1)}
		Task3(D) can start after Task1 and Task2 (B and C) finish:
			r4: (~Finish(Task1) ^ ~Finish(Task2) ) -> ( ~Start(Task3) )


11.  In the context of automated problem solving using search techniques, define the following terms in your own words: state, state space, action, search tree, restriction.
	- Descrição do ponto de partida – o estado inicial
	- Um conjunto de transições de estados - state space
	- Um função que diz se um dado estado satisfaz o objetivo - restriction
	- Por vezes também uma função que avalia o custo de uma solução, organiza a esploração de estados e acções durante uma  - search tree
	- possivel operação ou movimento que pode ser usada num cenário de problema-solução  - action

# Machine Learning
1. 
	D appears in 1/4 of all cases,
	S appears in 3/4 of all D patients and 1/8 of the ~D patients
	{D, ~D}- classes, Attribute {S}
	|P(D) = 1/4 | P(S|D) = 3/4 | P(S|~D)=1/8 | P(~D)=3/4 | P(~S|D)=1/4 | P(~S|~D)=7/8 |
	a) Ganho de informação (Information gain)
		P(S)=P(S|D)P(D)+P(S|~D)P(~D)<=>3/4 * 1/4 +1/8 * 3/4 = 3/16 + 3/32 = 9/32
		P(~S)=1 - 9/32 = 23/32
		P(D^S) = P(S^D) = P(S|D)P(D) <=> P(S^D) = 3/4  * 1/4 = 3/16
		P(D^~S) = P(~S^D) = P(~S|D)P(D) <=> P(~S^D) = 1/4  * 1/4 = 1/16
		P(D|S)= P(D^S)/P(S) <=> P(D|S) = 3/16 / 9/32 = 2/3
		P(D|~S) = P(~S^D)/P(~S) <=> P(D|S) = 1/16 / 9/32 = 2/9
	    H(D) = -1/4 * log2(1/4) - 3/4 * log2(3/4) = 0.811<br>
	    Com S = positiva
	    H(D|S)= -P(D|S) * log2(P(D|S)) - P(~D|S) * log2(P(~D|S)) <=>
	    <=> H(D|S)=  2/3 * log2(2/3) - 1/3 * log2(1/3) <=>
	    <=> H(D|S)= 0.138 <br>
	    Com S = negativa
	    H(D|~S) = -P(D|~S) * log2(P(D|~S)) - P(~D|~S) * log2(P(~D|~S)) <=>
		<=> H(D|~S) = - 2/9 * log2( 2/9) - 7/9 * log2(7/9 ) <=>		
		<=> H(D|~S) = 0.764<br>
		H(D|Si) = P(S)H(D|S) + P(~S)H(D|~S) <=>
		<=> H(D|Si) = 9/32 * 0.138 + 23/32* 0.764
		<=> H(D|Si) = 0.588 <br>
		IG(D,S) = H(D) - H(D|Si) <=>
		<=> IG(D,S) = 0.811 -  0.588 <=>
		<=> IG(D,S) = 0.223
	b)
		H(Si) = -p(S) * log2(P(S)) - P(~S) * log2(P(~S)) <=>
		<=> H(Si) = - 9/32 * log2(9/32 ) - 23/32 * log2(23/32) <=>
		<=> H(Si) = 0.857
		IG_Ratio (C,S) = IG(D,S) / H(Si) = 0.223 / 0.857 =  0.260

2. 
	In some domains, each attribute is never tested more than once along the path of each leaf to the root of the decision tree. What characterizes the domains where this is more likely to happen?
		R: 

3. 
	Consider the following dataset, with three binary attributes (A1, A2 e A3) and two classes.  Use the TDIDT algorithm to generate a decision tree based on this data. The choice of the attribute for each node should be based on the information gain criterion. <br>
	![[Pasted image 20240109222513.png]]
	
	Classe  = {0, 1}
	p(0) = 9 / 20 
	p(1) = 11 / 20 <br>
	H(Class) = -p(0) x log2(p(0)) - p(1) x log2(p(1)) = - 9/20 x log2(9/20) - 11 / 20 x log2(11 / 20) = 0.993 <br>
	p(A1=0|0) = 1/1 (prob of A1=0 given Class=0 )
	p(A1=0|1) = 0/1 (prob of A1=0 given Class=1 )
	p(A1=1|0) = 2/4 (prob of A1=1 given Class=0 )
	p(A1=1|1) = 2/4 (prob of Class 1 given A1=1)
	H(A1=0|class) = - 1 x log2(1) - 0 x log2(0) = 0 
	H(A1=1|Class) = -2/4 x log2(2/4) -2/4 x log2(2/4) = 1 <br>
	|E_{A1=0}| is the count of examples where A1=0 and |E_{A1=1}| is the count of examples where A1=1, and |E| is the total number of examples <br>
	IG(A1) = H(class) - E (i=0) (|EA1=i|/|E|) x H(Class | A1 = i) = 0.993−(1/5​⋅0+4/5​⋅1) = 0.171<br>
	p(A2=0|0) = 2/2 (prob of A2=0 given Class=0)
	p(A2=0|1) = 0/2 (prob of A2=0 given Class=1)
	p(A2=1|0) = 1/3 (prob of A2=1 given Class=0)
	p(A2=1|1) = 2/3 (prob of A2=1 given Class=1)
	H(A2=0|class)) = - 1 x log2(2/2) - 0 x log2(0/2) = 0
	H(A2=1|Class)) = - 1/3 x log2(1/3) -2/3 x log2(2/3) = 0.918<br>
	E_{A2=0}| is the count of examples where A2=0 and |E_{A2=1}| is the count of examples where A2=1, and |E| is the total number of examples <br>
	IG(A2) = H(class) - E (i=0) (|EA2=i|/|E|) x H(A2 | Class = i) = 0.993−((2/5​⋅H(A2 | Class=0)+3/5​⋅H(A2=1|Class)) = 0.993−(2/5​⋅0+3/5​⋅0.918) = 0.442<br>
	p(A3=0|0) = 2/3 (prob of Class 0 given A3=0)
	p(A3=0|1) = 1/3 (prob of Class 1 given A3=0)
	p(A3=1|0) = 1/2 (prob of Class 0 given A3=1)
	p(A3=1|1) = 1/2 (prob of Class 1 given A3=1)
	H(A3=0|class)) = - 2/3 x log2(2/3) - 1/3 x log2(1/3) = 0.918
	H(A3=1|Class)) = - 1/2x log2(1/2) -1/2 x log2(1/2) = 1 <br>
	E_{A3=0}| is the count of examples where A3=0 and |E_{A3=1}| is the count of examples where A3=1, and |E| is the total number of examples <br>
	IG(A3) = H(class) - E (i=0) (|EA1=i|/|E|) x H( A3 = i | Class) = 0.993−((3/5​⋅H(A3=0|Class)+2/5​⋅H(A3=1|Class)) = 0.993 - ( 3/5 * 0.918 + 2/5 * 1) = 0.042 <br>
	Highest information Gain come from attribute A2 with IG(A2) = 0.442 <br>
	![[Pasted image 20240109234552.png]]
 
4.  
	Suppose a set of examples, E, is divided into subsets Ei according to the values of an attribute. In each Ei , there are pi positive examples and ni negative examples. Show that the information gain will be positive, unless pi/(pi + ni) is equal for all attributes. <br>
	H(E) = -(pi/(ni+pi)) * log2(pi/(ni+pi)) - (ni/(ni+pi)) * log2(ni/(ni+pi))
	IG(E,A) = H(E) - ∑i ( ( | Ei | / | E | ) * H( Ei ) )<br>
	Se a proporções pi/(pi+ni) são iguais para todos os atributos, então H(Ei) vai ser o mesmo para todos os subsets Ei. Sendo assim, a soma ∑i ( ( | Ei | / | E | ) * H( Ei ) ) vai ser a mesma para todos os atributos e o ganho de informação será determinado pela diferença na entropia H(E). 
	Sabendo que a entropia é sempre positiva e o ganho de informação é calculado a partir de subtrair uma quantidade não negativa de H(E), o ganho de informação vai ser positivo a menos que a soma de ( ( | Ei | / | E | ) * H( Ei ) ) seja 0 para todos os atributos.
	Em conclusão, o ganho de informação vai ser positivo a menos que a entropia do set original seja 0.