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

--Seções Judiciárias
INSERT INTO jurisproc.SecaoJudiciaria (id, uuid, version, latitude, longitude, nome, secaoAdmissibilidade, tribunalResponsavel) VALUES(1, '58e6b065-b42c-4a6e-95d1-773a398c4499', 0, NULL, NULL, 'Vitória-ES', 1, 1);
INSERT INTO jurisproc.SecaoJudiciaria (id, uuid, version, latitude, longitude, nome, secaoAdmissibilidade, tribunalResponsavel) VALUES(2, 'c18fabec-d6c4-45c9-ba78-71f5fd139164', 0, NULL, NULL, 'São Paulo', 1, 2);
INSERT INTO jurisproc.SecaoJudiciaria (id, uuid, version, latitude, longitude, nome, secaoAdmissibilidade, tribunalResponsavel) VALUES(3, '5c3f2706-c142-4d4c-81bc-67494f60c318', 0, NULL, NULL, 'Rio de Janeiro', 2, 1);
INSERT INTO jurisproc.SecaoJudiciaria (id, uuid, version, latitude, longitude, nome, secaoAdmissibilidade, tribunalResponsavel) VALUES(4, '513dd310-71ad-4b57-a269-64ade3da2265', 0, NULL, NULL, 'Curitiba', 1, 3);
INSERT INTO jurisproc.SecaoJudiciaria (id, uuid, version, latitude, longitude, nome, secaoAdmissibilidade, tribunalResponsavel) VALUES(5, '6ae9f709-9503-4135-ac66-53d045f386f0', 0, NULL, NULL, 'Campo Grande', 1, 2);
INSERT INTO jurisproc.SecaoJudiciaria (id, uuid, version, latitude, longitude, nome, secaoAdmissibilidade, tribunalResponsavel) VALUES(6, 'b04f813c-f13d-48f2-9977-eca688722c34', 0, NULL, NULL, 'Brasília', 1, 0);
INSERT INTO jurisproc.SecaoJudiciaria (id, uuid, version, latitude, longitude, nome, secaoAdmissibilidade, tribunalResponsavel) VALUES(7, 'd5a6707c-a158-418f-97ed-799993e0315e', 0, NULL, NULL, 'Porto Alegre', 1, 3);
INSERT INTO jurisproc.SecaoJudiciaria (id, uuid, version, latitude, longitude, nome, secaoAdmissibilidade, tribunalResponsavel) VALUES(8, '5bb2f472-6eed-453b-baae-6a8b24a9f945', 0, NULL, NULL, 'São Mateus', 1, 1);
INSERT INTO jurisproc.SecaoJudiciaria (id, uuid, version, latitude, longitude, nome, secaoAdmissibilidade, tribunalResponsavel) VALUES(9, '4e793a43-540d-46ca-909d-768c263822ea', 0, NULL, NULL, 'Salvador', 1, 0);
INSERT INTO jurisproc.SecaoJudiciaria (id, uuid, version, latitude, longitude, nome, secaoAdmissibilidade, tribunalResponsavel) VALUES(10, 'd5272193-cce4-4f86-9bd7-a2e2a0da73b8', 0, NULL, NULL, 'Recife', 1, 4);
