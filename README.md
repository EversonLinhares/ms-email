# Micro serviço de envio de emails

## Requisitos para rodar a aplicação
 . Java 11
  <br/>
 . RabbitMQ versão utilizada 3.10.7
  <br/>
 . Servidor SMTP

## Rodando a aplicação
 . Para rodar uma instancia do banco mySQL com comando . "docker-compose up -d" , na pasta raiz do projeto.
  <br/>
 . Inserir as configurações de STMP na tabela tb_smtp , pois a aplicação pega de forma dinânica essas informações , para o envio do email.
  <br/>
 . O RabbitMQ pode rodar em container com exemplos no site : "https://hub.docker.com/_/rabbitmq" .
  <br/>
 . Gerando o jar da aplicação com o comando "mvn clean package"
  <br/>
 . E por fim , java -jar target/email-0.0.1-SNAPSHOT.jar