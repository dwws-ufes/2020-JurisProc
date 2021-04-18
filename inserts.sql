--Tipos de Acordão
INSERT INTO jurisproc.Acordao
(id, uuid, version, numeroProcesso)
VALUES(1, '333066f8-d0dc-4e45-a82a-71ed732ad1e7', 0, 14502001);
INSERT INTO jurisproc.Acordao
(id, uuid, version, numeroProcesso)
VALUES(2, '9132d558-7a80-4354-ac51-4e9266e1b520', 0, 30002015);
INSERT INTO jurisproc.Acordao
(id, uuid, version, numeroProcesso)
VALUES(3, 'da6e828a-88c4-442a-b943-4d0090a097bb', 0, 43502015);


--Usuários Admins
INSERT INTO jurisproc.Usuario
(id, uuid, version, OAB, dataRegistro, email, nome, senha, linkResetaSenha)
VALUES(1, '83217d4d-df74-4928-91da-9b0d6e4e12d7', 0, '25432', '2021-04-15 16:21:40.644000000', 'pedro.hoppe@edu.ufes.br', 'Pedro', 'pmWkWSBCL51Bfkhn79xPuKBKHz//H6B+mY6G9/eieuM=', NULL);
INSERT INTO jurisproc.Usuario
(id, uuid, version, OAB, dataRegistro, email, nome, senha, linkResetaSenha)
VALUES(2, 'afea7bc1-d24a-4b8c-a1c5-a46a73496ff4', 0, '25432', '2021-04-17 22:40:46.685000000', 'melissa.zor@inf.ufes.br', 'Melissa Zorzanelli', 'pmWkWSBCL51Bfkhn79xPuKBKHz//H6B+mY6G9/eieuM=', NULL);

--ROLEs
INSERT INTO jurisproc.SystemRole
(nome)
VALUES('ADMIN');
INSERT INTO jurisproc.SystemRole
(nome)
VALUES('USUARIO_NORMAL');

--Roles do ADMINs
INSERT INTO jurisproc.Usuario_SystemRole
(Usuario_id, roles_nome)
VALUES(1, 'ADMIN');
INSERT INTO jurisproc.Usuario_SystemRole
(Usuario_id, roles_nome)
VALUES(2, 'ADMIN');

--Assuntos
INSERT INTO jurisproc.Assunto
(id, uuid, version, competencia, nome)
VALUES(1, 'a3daf35d-de2b-4bac-96db-f32f26f62bd9', 0, 'Direito Previdenciário', 'Aposentadoria por Invalidez');
INSERT INTO jurisproc.Assunto
(id, uuid, version, competencia, nome)
VALUES(2, 'a3daf35d-de2b-4bac-96av-f32f26f62bd9', 0, 'Direito Previdenciário', 'Auxílio-Doença');
INSERT INTO jurisproc.Assunto
(id, uuid, version, competencia, nome)
VALUES(3, 'badaf35d-de2b-4bac-96av-f32f26f62bd9', 0, 'Direito Previdenciário', 'Auxílio-Reclusão');
INSERT INTO jurisproc.Assunto
(id, uuid, version, competencia, nome)
VALUES(4, '722cd727-ba04-4b84-9d5a-07a4c40bfb36', 0, 'Direito Previdenciário', 'Aposentadoria por tempo de serviço');
INSERT INTO jurisproc.Assunto
(id, uuid, version, competencia, nome)
VALUES(5, '9e0b8953-9a35-4719-bffb-d7e37de4d72e', 0, 'Direito Previdenciário', 'RMI - Renda Mensal Inicial');
INSERT INTO jurisproc.Assunto
(id, uuid, version, competencia, nome)
VALUES(6, '4ffa6dca-e3a9-49ca-913f-fb243b596906', 0, 'Direito Tributário', 'Contribuiçoes');
INSERT INTO jurisproc.Assunto
(id, uuid, version, competencia, nome)
VALUES(7, '9d967316-0a65-4b87-b146-7dfdb9f77ee1', 0, 'Direito Tributário', 'Impostos');
INSERT INTO jurisproc.Assunto
(id, uuid, version, competencia, nome)
VALUES(8, '4eb56daa-5ede-4f51-8697-cec4b8714d77', 0, 'Direito Administrativo', 'Servidor Público Civil');
INSERT INTO jurisproc.Assunto
(id, uuid, version, competencia, nome)
VALUES(9, '572a1927-38f0-4e65-93a4-b0222961af90', 0, 'Direito Administrativo', 'Militar');
INSERT INTO jurisproc.Assunto
(id, uuid, version, competencia, nome)
VALUES(10, '985230f3-8243-455f-a18d-560460b19003', 0, 'Direito Consumidor', 'Contratos de Consumo');
INSERT INTO jurisproc.Assunto
(id, uuid, version, competencia, nome)
VALUES(11, '5a2d17fa-7f22-4654-ac0a-fbae2a2b9df3', 0, 'Direito Consumidor', 'Práticas Abusivas');

