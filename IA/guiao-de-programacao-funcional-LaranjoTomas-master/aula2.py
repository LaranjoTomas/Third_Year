import math

#Exercicio 4.1
impar = lambda x: x%2 != 0 

#Exercicio 4.2
positivo = lambda x: x > 0

#Exercicio 4.3
comparar_modulo = lambda x, y: abs(x) < abs(y)  

#Exercicio 4.4
cart2pol = lambda x, y: ( math.sqrt(x**2 + y**2), math.atan2(y, x) )

#Exercicio 4.5
ex5 = lambda f, g, h: lambda x, y, z : h(f(x,y), g(y,z))

#Exercicio 4.6
def quantificador_universal(lista, f):
    for x in lista:
        return f
#Exercicio 4.8
def subconjunto(lista1, lista2):
    for x in lista1:
        if x not in lista2:
            return False
        else: 
            continue
    return True

#Exercicio 4.9
def menor_ordem(lista, f):
    if lista == [] :
        return []
    small = lista [0]
    for x in lista[1:] :
        if f(x, small):
            small = x
    return small

#Exercicio 4.10
def menor_e_resto_ordem(lista, f):
    pass

#Exercicio 5.2
def ordenar_seleccao(lista, ordem):
    pass
