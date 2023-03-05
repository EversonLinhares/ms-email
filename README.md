# Micro serviço de envio de emails

## Requisitos para rodar a aplicação
<ul>
 <li> Java 11 </li>
 <li>RabbitMQ versão utilizada 3.10.7</li>
 <li> Servidor SMTP</li>
</ul>

## Rodando a aplicação
 <ul>
 <li>Para rodar uma instância do banco MySQL com comando . "docker-compose up -d" , na pasta raiz do projeto.</li>
 <li> Inserir as configurações de STMP na tabela tb_smtp , pois a aplicação pega de forma dinânica essas informações , para o envio do email.</li>
 <li>O RabbitMQ pode rodar em container com exemplos no site : <a> https://hub.docker.com/_/rabbitmq </a> .</li>
 <li>Gerando o jar da aplicação com o comando "mvn clean package"</li>
 <li> E por fim , java -jar target/email-0.0.1-SNAPSHOT.jar</li>
 </ul>

## Endpoint
 