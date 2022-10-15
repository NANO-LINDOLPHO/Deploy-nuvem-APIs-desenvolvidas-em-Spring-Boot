## Cloud Parking    :car:   :blue_car:  :minibus:   :truck: :oncoming_automobile:
***
Neste projeto passamos pelo desafio de desenvolver um conjunto de API’s utilizando Spring Boot para controlar um estacionamento de veículos. Serão controlados a entrada, saída e valor a ser cobrado do cliente. Iremos ser instruídos a aplicar todas as boas práticas de desenvolvimento de API’s incluindo segurança com Spring Security e acesso a banco de dados PostgreSQL. Serão realizados testes e relatórios de cobertura de testes. Após finalizarmos a aplicação e termos enviado para o Github, nos é proposto fazer o deploy na cloud do Heroku a fim de disponibilizar nossa API para a Internet.

_**Pré-requisitos:**_

_Lógica de programação e POO;_   
_Conhecimento Avançado em Java e Spring Boot;_   
_Conhecimento em Banco de dados PostgreSQL;_   
_Conhecimento em GitHub e Heroku;_   

Instrutor: Sandro Giacomozzi - Software engineer, TOTVS   
Carga Horária -> Proposta do Projeto e Mini Curso Springboot: 10h;   
Avaliado como: Full-Stack, Avançado   

:ballot_box_with_check: Apresentação dos objetivos e requisitos do projeto. Introdução aos conceitos do Spring Boot. Gerando nossa aplicação com o Spring Initializr.   
:ballot_box_with_check: Apresentando a estrutura do pom.xml e as dependências do projeto.   
:ballot_box_with_check: Demonstrando outras formas de iniciar nosso projeto. Subindo a aplicação para GitHub.   
:ballot_box_with_check: Hospedando aplicação no Heroku. Adicionando o System Properties.   
:ballot_box_with_check: Apresentando os conceitos REST e Verbos HTTP. Criando o primeiro endpoint de cadastro.   
:ballot_box_with_check: Aplicando Design Patterns DTO para representar nossa view. Finalizando a criação do endpoint de cadastro.   
:ballot_box_with_check: Modelando a conversão das Lista e aplicando o o ResponseEntity.   
:ballot_box_with_check: Criando o método findById() e implementando o @PostMapping.   
:ballot_box_with_check: Documentando a API com Swagger utilizando o Spring Fox.   
:ballot_box_with_check: Configurando as exceções da aplicação e fazendo o tratamento no controller.   
:ballot_box_with_check: Construindo os métodos UPDATE e DELETE.   
:ballot_box_with_check: Realizando os testes da API e configurando as portas da aplicação.   
:ballot_box_with_check: Implementando os testes do findAll().   
:ballot_box_with_check: Revisando a API e iniciando o conceito de Persistência.   
:ballot_box_with_check: Trabalhando com JPA. Configurando o Banco de dados e criando um container.   
:ballot_box_with_check: Realizando alterações no Service e criando a interface Repository.   
:ballot_box_with_check: Implementando algoritmos da regra de negócio. Realizando o cálculo de dias e horas.   
:ballot_box_with_check: Testando o banco de dados da aplicação e realizando as implementações do TestContainers   
:ballot_box_with_check: Atualizando as tabelas do banco de dados e visualizando o Heroku com o DB.   
:ballot_box_with_check: Configurando a segurança da aplicação, acessando e configurando acesso ao Swagger-uri. Adicionando a dependência Spring Security.   
:ballot_box_with_check: Criando a classe de configuração. Security web. SecurityConfiguration.   
:ballot_box_with_check: Finalizando as configurações de acesso e a API.   
:ballot_box_with_check: Entendendo o Desafio e Materiais de Apoio   


### Docker:

#### Run database
docker run --name parking-db -p 5432:5432 -e POSTGRES_DB=parking -e POSTGRES_USER=admin -e POSTGRES_PASSWORD=123 -d postgres:10-alpine

#### Stop database
docker stop parking-db

#### Start database
docker start parking-db
