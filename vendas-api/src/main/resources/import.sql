insert into cliente (id, nome) values (1,'Eletrônicos Eletro');
insert into cliente (id, nome) values (2,'Smart Compras');

insert into produto (id, nome, valor) values (1,'Notbook', 3000.0);
insert into produto (id, nome, valor) values (2,'Smart TV', 2000.0);
insert into produto (id, nome, valor) values (3,'Smart Phone', 1000.0);

insert into venda (id, cliente_id, frete, total, cadastro) values (1,1,15.0,2965.0, sysdate());

insert into item (id, venda_id, produto_id, quantidade) values (1,1,1,1);