# Desafio-03

Resolução do Desafio 3:
____________________________________________________________

a) Com suas palavras, defina:
	i. o que é o protocolo de comunicação HTTP e como ele funciona;

	- HTTP é a abreviação de Hyper Text Transfer Protocol, que significa: Protocolo de Transferência de Hipertexto. Ou seja, 
  é a padronização das requisições e respostas entre clientes e servidores. Quando o usuário digita o site no navegador, 
  ele está fazendo uma requisição a um servidor. Essa requisição é padronizada pelo formato HTTP (ou ainda o HTTPS - que é 
  a versão que inclui chaves para proteger a informação trafegada).

	ii. o que é REST, e qual é a sua relação com o protocolo HTTP;

	- Representational State Transfer, é um estilo de arquitetura de serviços WEB e Api's Stateless (requisições independentes). 
  Quando requerido, o REST envia o estado de uma API no momento da requisição. Além disso, com o REST, é possível manejar as 
  informações por exemplo acrescentando novo registro, modificando um registro já existente, ou até mesmo deletando-o. 
  Para realizar a comunicação com os serviços e API's, o REST utiliza da semântica do HTML <GET, POST, PUT, DELETE>.

	iii. o que é Web API, e qual é a sua relação com REST;
		
	- É uma interface de programação de aplicações de dois lados (navegador/servidor). Por meio dessa interface é feita 
  a requisição REST (ou Soap) a um servidor e se recebe o código de status como resposta (404 por exemplo). 

b) Liste todos os métodos de solicitações HTTP utilizados pelo padrão REST e suas respectivas finalidades;

	- <GET> usado para solicitar que um servidor envie um recurso.
	- <POST> enviar dados de entrada para o servidor, como criar um novo elemento.
	- <PUT> modifica dados anteriormente enviados para o servidor.
	- <DELETE> exclui as informações. 
	-<HEAD> solicita uma resposta sem o body do conteúdo.
	-<CONNECT> estabelece um túnel para o servidor identificado pelo recurso de destino.
	-<OPTIONS> descrever as opções de comunicação com o server.
	-<TRACE> executa um teste de chamada com o servidor, semelhante ao trace rout do cmd.
	-<PATCH> aplica modificações parciais em um recurso.


i) O que é Swagger? 
	- É um framework com diversas ferramentas que auxilia a descrição, o consumo e a visualização de serviços de 
  uma API REST. Nele existem ferramentas que ajudam a realizar tarefas como especificar, implementar, testar e utilizar a 
  API.Com o swagger, podemos criar a documentação de forma manual, automática e através do Codegen, onde todas as anotações contidas no 
  código fonte da API são convertidas em documentação.	




