#language: pt
#encoding: utf-8

@LoginSite

Funcionalidade: Autenticação de usuário
  Como usuário do sistema
  Quero fazer login com minhas credenciais
  Para acessar funcionalidades personalizadas com base no meu perfil.
  Contexto:
    Dado o usuario clicar no botao login

  @loginValido @login
  Esquema do Cenario: Login bem-sucedido com credenciais válidas
    Quando preencher o email "<email>"
    E preencher a senha "<senha>"
    E clicar no botao confirmar
    Entao o sistema apresenta "<mensagem>"

    Exemplos:
      | email             | senha        | mensagem     |
      | Teste@Filipe.com  | 12345678     | TesteFilipe  |
      | Teste@Filipe2.com | 87654321     | TesteFilipe2 |

  @loginInvalido @login
  Esquema do Cenario: Tentar login com diferentes credenciais
    Quando preencher o email "<email>"
    E preencher a senha "<senha>"
    E clicar no botao confirmar
    Então o sistema apresenta erro "<mensagem>"

    Exemplos:
      | email          | senha        | mensagem                                       |
      | adm@adm.com    | adm123       | Your email or password is incorrect!           |
      | Tes&$@test.com | adm#@^@*(!   | Your email or password is incorrect!           |




