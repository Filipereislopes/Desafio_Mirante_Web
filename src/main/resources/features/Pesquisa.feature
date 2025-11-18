#language:pt
#encoding:utf-8

@Pesquisa

Funcionalidade: Pesquisa de produto
  Como usuario do sistema
  Quero pesquisar por um produto.
  Contexto:
    Dado o usuario tenha feito login no site

  @PesquisarProduto @Teste
  Esquema do Cenario: Realiza pesquisa de produto
    Quando clicar na aba produtos
    E digitar o "<Produto>"
    E clicar no botao pesquisar
    Entao o sistema apresenta o "<Produto>"

    Exemplos:
      | Produto                      |
      | Frozen Tops For Kids         |
      | Regular Fit Straight Jeans   |

  @PesquisarProdutoInexistente @Teste
  Esquema do Cenario: Realiza pesquisa de produto invalido
    Quando clicar na aba produtos
    E digitar o "<Produto>"
    E clicar no botao pesquisar
    Entao o sistema nao apresenta produto

    Exemplos:
      | Produto                      |
      | Camisa frozen infantil       |
      | Terno                        |