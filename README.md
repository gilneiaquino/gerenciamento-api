# gerenciamento-api
APIS Rest do projeto gerenciamento web

Iniciar aplicação com dockerfile: 

Criação da imagem aplicação: 

sudo docker build -t gerenciamento-app-spring .

Criação da imagem do banco postgres:

sudo docker run -d \
    --name docker-postgres \
    -e POSTGRES_DB=db \
    -e POSTGRES_USER=postgres \
    -e POSTGRES_PASSWORD=postgres \
   postgres:10.4

Subir aplicação spring :

sudo docker run -p 8080:8080 gerenciamento-app-spring

Acessando os microserviços pelo swagger via navegador:

http://localhost:8080/swagger-ui.html


======================
Admine acesso banco mysql
======================

endereço: http://localhost:8090/
Sistema: MySQL
Servidor: mysqldb
Usuário: root
Senha:12345

======================
iniciar aplicacao com docker-compose
======================
Criar o banco "Escola"
comando: docker-compose up
Acessar API via swagger: 
http://localhost:8080/swagger-ui.html