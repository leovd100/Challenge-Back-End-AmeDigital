# Desafio AmeDigital Api de planetas Star Wars

Esse desafio foi proposto a partir do repositório [Back-end Challenge](https://github.com/CollabCodeTech/backend-challenges)

---

### Versões

    - Java 17
    - Spring boot 3

---

Neste desafio da Ame Digital, temos que criar uma API que retorne para o front-end alguns dados de planetas. Esses dados são:

- Nome
- Clima
- Terreno
- Para cada planeta também devemos ter a quantidade de aparições em filmes, que podem ser obtidas pela API pública do Star Wars: https://swapi.co/.

A Api deve ser REST com as funcionalidades:

- Adicionar um planeta (com nome, clima e terreno)
- Listar planetas
- Buscar por nome
- Buscar por ID
- Remover planeta

A aplicação roda na porta `8080` e conta com a implementação do Spring Security sem configurações a mais, apenas com o hash padrão do Spring. Também utiliza o Swagger para envio de requisições.

A API de busca `GET` suporta paginação com pageable

| Atributo  | Valor |
| --------- | ----- |
| size      | 5     |
| sort      | id    |
| direction | ASC   |

O projeto conta com H2 e um arquivo data.sql para popular o banco de dados em profile de `test`. Porém, por padrão ele se utiliza do PostgreSQL para persistir os dados.
