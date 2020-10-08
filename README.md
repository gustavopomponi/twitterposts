# twitterposts

1. Descrição

    Plataforma utilizada para obtenção das últimas postagens de twitter dada uma determinada tag
    
<br>
    
2. Composição da Solução

    1. Banco de Dados PostgreSQL em Docker, utilizado para armazenar as informações coletadas do twitter
    2. API para obtenção das informações do twitter e armazenamento no banco de dados.
    3. API gateway para segurança e controle de acesso à aplicação
    4. Arquitetura da Solução
    5. Frontend em Angular para exibição das informações coletadas do twitter
    6. ELK Stack para armazenamento de logs em Docker, utilizando base PostgreSQL
    
<br>
    
3. Tecnologias Utilizadas

    1. Java 8
    2. Spring Boot
    3. Spring Cloud Gateway
    4. Postgresql
    5. JUnit
    6. Mockito
    7. Docker Desktop 2.3.0.5 (48029) - Ambiente
    8. Swagger 2.9.2 - Documentação de API
    9. IntelliJ IDEA 2020.1.4 Community Edition - Desenvolvimento das API's
    10. Draw.IO (https://app.diagrams.net) - Confecção dos diagramas
    11. Spring Social Twitter

<br>

4. Instruções de Instalação

    1. Baixe o arquivo xxx para algum diretório de sua escolha
    2. Execute o comando docker-compose up -d
    
<br>

5. Chamadas da API

    <table>
        <tr>
            <td colspan="2">Endpoints</td>
        </tr>
        <tr>
            <td>
                Endpoint
            </td>
            <td>
                Método
            </td>
        </tr>
        <tr>
            <td>
                /tweets
            </td>
            <td>
                GET
            </td>
        </tr>
    </table>

    1. Para fazer a chamada utilizando postman, 

7. Requisitos

    1. Possuir o Docker instalado na maquina que irá rodar a aplicação
    2. Possuir um app criado no Twitter Developer
    3. Possuir um projeto no Portal do Desenvolvedor do Twitter