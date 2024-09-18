# BD: Guião 7


## ​7.2 
 
### *a)*

```
    Livro (<u>Titulo_Livro</u>, <u>Nome_Autor</u>, Afiliacao_Autor, Tipo_Livro, Preco, NoPaginas,
        Editor, Endereco_Editor, Ano_Publicacao)

    Livro(<u> A </u>, <u> B </u>, C, D, E, F, G, H, I)

    Chaves:
        <u> A </u>,<u> B </u> -> G, D, F, I
        D, F -> E
        <u> B </u> -> C
        G -> H
```

### *b)* 

```
    2nd formula normal {
                        R1 = <u> A </u>, <u> B </u>, D, E, F, G, H, I
                        R2 = <u> B </u>, C
    }
    
    3rd formula normal {
                        R1 = (<u> A </u>, <u> B </u>, D, F, G, I)
                        R2 = (<u> B </u>, C)
                        R3 = (D, F, E)
                        R4 = (G, H)
    }
```




## ​7.3
 
### *a)*

```

    R={A,B,C,D,E,F,G,H,I,J}

    F={ {A, B}→{C}, {A}→{D, E}, {B}→{F}, {F}→{G, H}, {D}→{I, J}}

    Chave:
        { <u> A </u>, <u> B </u> }
```


### *b)* 

```

    2nd Formula Normal {
                        R1 = <u> A </u>, <u> B </u>, C
                        R2 = <u> A </u>, D, E, I, J     (D -> I, J)
                        R3 = <u> B </u>, F, G, H        (F -> G, H)
    }

```


### *c)* 

```

    3rd Formula Normal {
                        R1 = (<u> A </u>, <u> B </u>, C)
                        R2 = (<u> A </u>, D, E)
                        R3 = (<u> B </u>,F)
                        R4 = (F, G, H)
                        R5 = (D, I, J)
    }

```


## ​7.4
 
### *a)*

```

    R={A,B,C,D,E}

    F={ {A,B}→{C,D,E}, {D}→{ E}, {C}→{A}}

    Chave:
        {<u> B </u>}
```


### *b)* 

```

    2nd Formula Normal {
                        R1 = A, <u> B </u>, C, D, E
    }

    3rd Formula Normal {
                        R1 = {A, <u> B </u>, C, D, E}
                        R2 = {D, E} (D -> E)
                        R3 = {C, A} (C -> A)
    }
    
```


### *c)* 

```

    R={A,<u> B </u>,C,D,E}

    {A,<u> B </u>} → {C,D,E}:
    A,B é uma superchave, portanto não viola a BCNF.

    Para {D} → {E}:
    D é uma superchave, portanto não viola a BCNF.
    
    Para {C} → {A}:
    C não é uma superchave, pois não é uma chave da relação. Portanto, essa dependência funcional viola a BCNF.

    R1 = {C, A} ( C -> A)

    R2 = {<u> B </u>, C, D, E} (<u> B </u>,C -> D, E)

    R3 = {D, E} (D -> E)

```



## ​7.5
 
### *a)*

```

    R={A,B,C,D,E}

    F={ {A,B}→{C,D,E}, {A}→{ C}, {C}→{D}}

    Chave:
        {<u> A </u>, <u> B </u>}
```

### *b)* 

```

    2nd Formula Normal {
                        R1 = <u> A </u>, <u> B </u>, D, E
                        R2 = <u> A </u>, C, D (<u> A </u> -> C, C -> D )
    }

```


### *c)* 

```

    3rd Formula Normal {
                        R1 = {<u> A </u>,<u> B </u> , D, E} ( <u> A </u>, <u> B </u> -> D, E)
                        R2 = {A, C} (A -> C)
                        R3 = {C, D} (C -> D)
    }

```

### *d)*

```

    R={A,B,C,D,E}

    F={ {A,B}→{C,D,E}, {A}→{ C}, {C}→{D}}

    R1 = {A, B, D, E} ( A, B -> D, E)
    R2 = {A, C} (A -> C)
    R3 = {C, D} (C -> D)

```
