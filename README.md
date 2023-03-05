# Micro serviço de envio de emails

## Requisitos para rodar a aplicação
 . Java 11
  <br/>
 . RabbitMQ versão utilizada 3.10.7
  <br/>
 . Servidor SMTP

## Rodando a aplicação
 <li>Para rodar uma instância do banco MySQL com comando . "docker-compose up -d" , na pasta raiz do projeto.</li> 
  <br/>
  <br/>
 . Inserir as configurações de STMP na tabela tb_smtp , pois a aplicação pega de forma dinânica essas informações , para o envio do email.
  <br/>
  <br/>
 . O RabbitMQ pode rodar em container com exemplos no site : "https://hub.docker.com/_/rabbitmq" .
  <br/>
  <br/>
 . Gerando o jar da aplicação com o comando "mvn clean package"
  <br/>
  <br/>
 . E por fim , java -jar target/email-0.0.1-SNAPSHOT.jar
 
## Endpoint
 