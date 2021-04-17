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
- [Ferramentas necessãrias](#ferramentas)
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

## ✍️ Autores <a name = "autores"></a>:
- Melissa Zorzanelli
- Pedro Hoppe



## 🎉 Considerações finais <a name = "consideracoes"></a>
- Esse projeto foi desenvolvido para a disciplina de Mestrado em Informática na UFES, "Desenvolvimento Web e Web Semântica", ministrada pelo Prof. Vítor E. Silva Souza, 2020/2

- O sistema JurisProc apresenta uma arquitetura baseada na arquitetura do projeto FrameWeb descrito em ´https://nemo.inf.ufes.br/projetos/frameweb/´
