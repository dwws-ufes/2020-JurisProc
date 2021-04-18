# 2020-JurisProc
Trabalho para a edição 2020 do curso "Desenvolvimento Web e a Web Semântica".  

<h3 align="center">JurisProc</h3>

<div align="center">

[![License](https://img.shields.io/badge/license-MIT-blue.svg)](/LICENSE)

</div>

O sistema JurisProc simula uma situação jurídica real e simula um portal que poderia ser utilizado por advogados ao protocolar um recurso específico, o Pedido de Uniformização, previsto na Lei n°10.259/2001, em seu artigo 14. Este é o recurso cabível contra o acórdão proferido por uma Turma Recursal e direcionado à Turma Nacional de Uniformização (TNU).  

Documentação sobre a aplicação JurisPro e como implantá-la (how to deploy).

## 📝 Conteúdo

- [Pré-requisitos](#pre-requisitos)
- [Ferramentas necessárias](#ferramentas)
- [Implantação](#implantacao)
- [Autores](#autores)
- [Considerações Finais](#consideracoes)


## 🛠️ Pré-requisitos <a name = "pre-requisitos"></a>:
- Docker

Para executar este aplicativo localmente é preciso ter o Docker instalado na máquina, caso não tenha instalado, você poderá instalar com esse comando (no linux): 
sudo apt install docker.io

Após, para o Docker iniciar sempre com a máquina, utilize este comando: sudo systemctl enable --now docker

Para testar se deu certo: sudo docker run hello-world

Estando tudo ok, já é possível usar o docker na máquina.

## ⛏️ Ferramentas necessárias <a name = "ferramentas"></a>:
- JakartaEE
- Eclipse
- Maven
- MySQL
- JButler
- WildFly
- Frameweb

## 🚀Implantação <a name = "implantacao"></a>: 

1 - Clone o projeto para o seu computador;
```
git clone https://github.com/dwws-ufes/2020-JurisProc.git
```

2 - É necessário instalar o seguinte:
- [Eclipse 2020-12](http://www.eclipse.org/);
- [WildFly 22](http://wildfly.org) e crie uma configuração de servidor dentro do Eclipse;
- [MySQL 8.0](http://www.mysql.com/products/community/) e crie um schema chamado `jurisproc` e usuário chamado `dwws` com a senha `dwws` e acesso total ao banco de dados homônimo;
- Configure [the MySQL JDBC driver](http://dev.mysql.com/downloads/connector/j/) no WildFly;
- Configure o datasource no WildFly o arquivo`standalone-full.xml`

```XML
 <datasource jndi-name="java:jboss/datasources/Jurisproc" pool-name="JurisprocPool">
            <connection-url>jdbc:mysql://localhost:3306/jurisproc</connection-url>
              <driver-class>com.mysql.cj.jdbc.Driver</driver-class>
               <driver>mysql</driver>
                    <security>
                        <user-name>dwws</user-name>
                        <password>dwws</password>
                    </security>
                    <validation>
			<valid-connection-checker class-name="org.jboss.jca.adapters.jdbc.extensions.mysql.MySQLValidConnectionChecker"/>
                        <background-validation>true</background-validation>
                        <exception-sorter class-name="org.jboss.jca.adapters.jdbc.extensions.mysql.MySQLExceptionSorter"/>
                    </validation>          
 </datasource>
```
3 - Adicione dentro de: subsystem xmlns="urn:jboss:domain:security:2.0"
            	
```XML
<security-domains>
	...
<security-domain name="database-login" cache-type="default">
                    <authentication>
                        <login-module code="Database" flag="required">
                            <module-option name="dsJndiName" value="java:jboss/datasources/Jurisproc"/>
                            <module-option name="principalsQuery" value="select senha from Usuario where email=?"/>
                           <module-option name="rolesQuery" value="select roles_nome,'Roles' from Usuario_SystemRole as user_roles inner join Usuario as su on su.id = user_roles.Usuario_id where su.email = ?"/>
                            <module-option name="hashAlgorithm" value="SHA-256"/>
                            <module-option name="hashEncoding" value="base64"/>
                        </login-module>
                    </authentication>
                </security-domain>
	...
	</security-domains>
		    
```
4 - Faça a importação do projeto no Eclipse;

5 - Execute os scripts do arquivo "inserts.sql" no banco jurisproc;

6 - Execute o servidor;




## ✍️ Autores <a name = "autores"></a>:
- [Melissa Zorzanelli](http://lattes.cnpq.br/5734353552551908)
- [Pedro Hoppe](http://lattes.cnpq.br/4031843038047078)



## 🎉 Considerações finais <a name = "consideracoes"></a>
- Esse projeto foi desenvolvido para a disciplina de Mestrado em Informática na UFES, "Desenvolvimento Web e Web Semântica", ministrada pelo Prof. Vítor E. Silva Souza, 2020/2

- O sistema JurisProc apresenta uma arquitetura baseada na arquitetura do projeto [FrameWeb](https://nemo.inf.ufes.br/projetos/frameweb/)
