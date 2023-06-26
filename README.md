Anotações de cada capítulo do livro! A ideia é escrever os pontos interessantes e exemplos em Java.

Link do repositório oficial do livro:

---

# Capítulos

## Capítulo 1: Introdução a algoritmos

### O que é um algoritmo?

- Nada mais é do que o passo a passo para o computador reproduzir e nos retornar uma resposta esperada;
- São instruções dadas a máquina, utilizando passos.

---

### Pesquisa binária

Imagine o seguinte problema, em uma página de números para contatos, com 100 nomes, desejamos procurar por Carlos.

Se formos fazer a pesquisa nessa lista de uma forma simplista, usando pesquisa simples, teriamos que percorrer um a um, para encontrar o Carlos, poderia ser 20 passos, 10 e por ai vai.

Com a busca binária, já reduziríamos para 2 etapas, já que a conta que utilizamos é

$$
log 100 = 7
$$

Lembrando que o log é o contrário de exponenciação, dessa forma:

$$
2^3 = 8 <=> log 8 = 3
$$

A base do log sempre será 2.

Mas como ele chega nesse valor, simples, a pesquisa binária segue a ideia de eliminar os valores pela metade, por exemplo:

- Quero achar o nome ‘Carlos’;
- Pesquisa começa, posição 50: tem Carlos? Não, a posição 50 está muito alta, remove os 50 pra cima, de 100 agora temos 50 elementos;
- Pesquisa começa, posição 25: tem Carlos? Não a posição 25 está muito alta, remove 25, de 50 agora temos 25 elementos.
- Pesquisa começa, posição 12: tem Carlos? Não a posição 12 está muito alta, remove os outros 12, de 24 elementos, agora temos 11.
- Até encontrar o Carlos.

Para utilizar esse algoritmo, precisamos de duas entradas:

1. Array ordenado;
2. O item procurado;

Exemplo de código em Java:

```bash
private static Integer binarySearch(int[] list, int item) {
         //1
				int baixo = 0;
        int alto = list.length - 1;

				//2
        while (baixo <= alto) {
						//3
            int meio = (baixo + alto) / 2;
            int chute = list[meio];
						//4
            if (chute == item) {
                return meio;
            }
						//5
            if (chute > item) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }
        }
        return null;
    }
```

- (1)Obtém o valor mínimo da lita e o valor máximo do tamanho da lista;
- (2)Enquanto não chegar no valor do item na lista;
- (3)Obtém o meio da lista, realizando a soma do mínimo da lista, com o maior da lista, dividindo por 2, também realiza o chute, que pega o item posicionado no meio da lista;
- (4)Se o chute tiver o mesmo valor do item, retornar resultado com a posição;
- (5)Se o chute for maior que o item, diminui o tamanho máximo da lista, se não, aumente o tamanho mínimo da lista.

Exemplo de uso:

Imagine o seguinte array ordenado ⇒ {1,3,5,8,9,12}

| Item | Lista | baixo | alto | meio | chute |
| --- | --- | --- | --- | --- | --- |
| 3 | 5 | 0 | 4 | 2 | 5 |
| 3 | 5 | 0 | 1 | 1 | 1 |

Chute na posição 1 é igual a 3, logo encontramos o item.

********Exercícios:********

1. Suponha que você tenha uma lista com 128 nomes e esteja fazendo uma pesquisa binária. Qual seria o número máximo de etapas que você levaria para encontrar o nome desejado?
    1. Para isso basta fazermos o log de 128 na base 2, que vai dar 7;
2. Suponha que você duplique o tamanho da lista. Qual seria o número máximo de etapas agora?
    1. O dobro dessa lista é 256, basta fazermos o log de 256 na base 2, que vai dar 8.