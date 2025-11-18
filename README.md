Este é um projeto de automação de testes desenvolvido em Java 11, utilizando Selenium para interagir com interfaces web e Cucumber para escrever testes no formato BDD usando a linguagem gherkin. 
O objetivo desse projeto é participar de um desafio do Mirante, usando automação para testar a página WEB.

Pré-requisitos
Antes de começar, os seguintes itens deram que está instalados em sua máquina:

Java 11 JDK (versão mínima recomendada)
Maven (para gerenciamento de dependências)
Git (para clonar o repositório)
IntelliJ IDEA (IDE recomendado, usada nesse projeto)
Um navegador compatível com Selenium (ex.: Chrome ou Firefox) e o respectivo WebDriver (ex.: ChromeDriver), Nesse projeto tem drivers na sua raiz!

Configuração do Ambiente
Siga os passos abaixo para configurar o ambiente localmente:

1. Instale o Java 11 JDK
Baixe o JDK 11 em: Oracle JDK ou OpenJDK.
Siga as instruções de instalação para o seu sistema operacional (Windows, Linux ou macOS).
instalação: no CDM você pode usar o comando "java -version" e ver qual a versão e se deu tudo certo.

2. Configure uma variável de ambiente JAVA_HOME
Defina a variável de ambiente JAVA_HOME apontando para o diretório de instalação do JDK.
Caminho:  Pesquise por "variáveis de ambiente" com a jalena aberta da configuração, clique em > "Variáveis ​​de Ambiente".

![image](https://github.com/user-attachments/assets/b4613e7b-bbbe-4c18-adac-305bd2e05e83)

Adicione uma nova variável de sistema:
Nome: JAVA_HOME
Valor: C:\caminhoPara\Java\jdk-11 (ajuste o caminho conforme sua instalação).

![image](https://github.com/user-attachments/assets/8b7bcc55-f94d-4750-ae45-9acad5c82900)

Na variável Path, adiciona no botão novo o valor %JAVA_HOME%\bin.

![image](https://github.com/user-attachments/assets/22d7b3e5-8566-4ceb-a453-4665f893a079)

4. Navegador
Usando o navegardor de sua preferência, esse projeto já possui os drivers necessarios para testar, para definir qual deseja usar, basta ir no arquivo config.properties.

Abrindo sua IDE (vou usar a intellij com exemplo)

5. Abra o Projeto no IntelliJ IDEA
Abra o IntelliJ IDEA.
Clique em File > Open e selecione o diretório do projeto (onde está o pom.xml).

Caso queira clonar o projeto, basta ir em:


![image](https://github.com/user-attachments/assets/d31b23f3-eec6-47ee-baa4-42bf325ba3bd)

Colocar a url do projeto e clicar em clonar:

![image](https://github.com/user-attachments/assets/fbb1380e-186c-4cc4-b234-f822cefb7504)

6. Configure o JDK no IntelliJ
Vá para File > Project Structure.
Em Project, selecione o JDK instalado (ex.: 11).

![image](https://github.com/user-attachments/assets/14542a2c-5b4a-4a7a-be3d-99db93636a41)

Em Modules, confirme que o mesmo JDK está selecionado.
Clique em Apply e OK.

![image](https://github.com/user-attachments/assets/8c76ec60-12f8-4dd0-bcf5-b8633111c1d4)

7. Baixe as Dependências
No IntelliJ, clique com o botão direito no pom.xml e selecione Maven > Sync Project. Isso baixará o JUnit, Cucumber e outras dependências.

![image](https://github.com/user-attachments/assets/46ea371e-d0b2-493f-baf9-2350fbd0c7c7)

Provavelmente esse projeto vai ter todas dependências que precisa para ser rodada, no entanto, caso precise pode obter em https://mvnrepository.com.
E no arquivo pom.xml pode colocar as dependências que precisa.

Executando os Testes
1. Testes JUnit no IntelliJ
Abra o arquivo do projeto em src/main/java/runners (entre em uma CT que queira testar).
Clique com o botão direito no arquivo ou em um método de teste e selecione Run 'CTNome'.

![image](https://github.com/user-attachments/assets/37527e2d-051b-4bb6-aab1-d6f4cc1b312e)

2. Testes Cucumber no IntelliJ
Abra um arquivo .feature em src/main/resources/features.
Clique com o botão direito no arquivo ou em um cenário e selecione Run 'FeatureNome'.

![image](https://github.com/user-attachments/assets/1788934f-8cd7-4049-b38a-011ae2aa3d88)

3. Relatórios do Cucumber:
Além do relatório, no arquivo do projeto chamado screenshots, pode achar um print da última tela do cenário testado.


