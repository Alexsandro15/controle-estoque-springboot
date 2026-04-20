// Produto e liga a Fornecedor(n:n) e Categoria(n:n) 
/*
produto
- id
- nome
- descricao

fornecedor
- id
- nome
- telefone
- email

categoria
- id
- nome

categoria_produto
- produto_id (FK)
- categoria_id (FK)
(PK composta)

estoque
- produto_id (FK)
- quantidade

movimentacao_estoque
- id
- produto_id (FK)
- fornecedor_id (FK nullable)
- quantidade
- preco_unitario
- data
- tipo_movimentacao (se quiser deixar explícito)
*/

------
✔️ Produto inativo continua no histórico
✔️ Movimentação sempre impacta estoque
❌ Não apagar movimentações
✔️ Usar estorno ou inativação
✔️ Nunca deixar estoque negativo

estorno
✔️ O jeito certo

Você cria uma nova movimentação:

ID 1 → +10 (entrada)
ID 2 → -10 (estorno da entrada)

✔️ Histórico preservado
✔️ Auditoria garantida

1 produto pode ter multiplos fornecedores e vice versa
---
métodos
crud = get, getById. create, updatebyid e delete
produto = crud + ativoTrueNome(se um produto está ativo ou ñ pelos caracteres) + voltar só produtos ativos + buscar por nomev
categoria = crud + ativoTrue(se uma categoria está ativo)v
Fornecedor = crud + ativoTrueNome(se um fornecedor está ativo ou ñ pelos caracteres) + voltar só produtos ativos
produtoFornecedor = todos os vinculos do produto, todos os vinculos do fornecedor e apagar por fornecedor+produto por id de cada um
produtoCategoria = todos os vinculos do produto, todos os vinculos da categoria e apagar por categoria+produto por id de cada um
estoque = buscar dados por id do produto
movimentacao = por produto, por data, por tipo(entrada ou movimentacao)




