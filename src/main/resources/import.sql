INSERT INTO tb_categoria (id, nome, descricao) VALUES (1, 'Eletrônicos', 'Dispositivos e acessórios eletrônicos');
INSERT INTO tb_categoria (id, nome, descricao) VALUES (2, 'Roupas', 'Vestuário masculino, feminino e infantil');
INSERT INTO tb_categoria (id, nome, descricao) VALUES (3, 'Alimentos', 'Produtos alimentícios e bebidas');
INSERT INTO tb_categoria (id, nome, descricao) VALUES (4, 'Móveis', 'Móveis para casa e escritório');
INSERT INTO tb_categoria (id, nome, descricao) VALUES (5, 'Brinquedos', 'Brinquedos educativos e de lazer');
INSERT INTO tb_categoria (id, nome, descricao) VALUES (6, 'Esportes', 'Artigos esportivos e fitness');
INSERT INTO tb_categoria (id, nome, descricao) VALUES (7, 'Automotivo', 'Peças e acessórios para veículos');
INSERT INTO tb_categoria (id, nome, descricao) VALUES (8, 'Livros', 'Livros de diversas categorias e gêneros');
INSERT INTO tb_categoria (id, nome, descricao) VALUES (9, 'Papelaria', 'Material escolar e escritório');
INSERT INTO tb_categoria (id, nome, descricao) VALUES (10, 'Cosméticos', 'Produtos de beleza e cuidados pessoais');
INSERT INTO tb_categoria (id, nome, descricao) VALUES (11, 'Informática', 'Computadores, periféricos e acessórios');
INSERT INTO tb_categoria (id, nome, descricao) VALUES (12, 'Ferramentas', 'Ferramentas elétricas e manuais');
INSERT INTO tb_categoria (id, nome, descricao) VALUES (13, 'Pet Shop', 'Produtos para animais de estimação');
INSERT INTO tb_categoria (id, nome, descricao) VALUES (14, 'Casa e Decoração', 'Itens decorativos e utilidades domésticas');
INSERT INTO tb_categoria (id, nome, descricao) VALUES (15, 'Instrumentos Musicais', 'Instrumentos e acessórios musicais');
INSERT INTO tb_categoria (id, nome, descricao) VALUES (16, 'Eletrodomésticos', 'Aparelhos para uso doméstico');
INSERT INTO tb_categoria (id, nome, descricao) VALUES (17, 'Saúde', 'Produtos médicos e hospitalares');
INSERT INTO tb_categoria (id, nome, descricao) VALUES (18, 'Construção', 'Materiais para construção e reforma');
INSERT INTO tb_categoria (id, nome, descricao) VALUES (19, 'Segurança', 'Equipamentos de segurança e proteção');
INSERT INTO tb_categoria (id, nome, descricao) VALUES (20, 'Jardinagem', 'Ferramentas e produtos para jardinagem');

INSERT INTO tb_fornecedor (id, nome, email, telefone, categoria_id) VALUES (1, 'Fornecedor A', 'fornecedora@exemplo.com', '1234-5678', 1);
INSERT INTO tb_fornecedor (id, nome, email, telefone, categoria_id) VALUES (2, 'Fornecedor B', 'fornecedorB@exemplo.com', '2345-6789', 2);
INSERT INTO tb_fornecedor (id, nome, email, telefone, categoria_id) VALUES (3, 'Fornecedor C', 'fornecedorC@exemplo.com', '3456-7890', 3);
INSERT INTO tb_fornecedor (id, nome, email, telefone, categoria_id) VALUES (4, 'Fornecedor D', 'fornecedorD@exemplo.com', '4567-8901', 4);
INSERT INTO tb_fornecedor (id, nome, email, telefone, categoria_id) VALUES (5, 'Fornecedor E', 'fornecedorE@exemplo.com', '5678-9012', 5);
INSERT INTO tb_fornecedor (id, nome, email, telefone, categoria_id) VALUES (6, 'Fornecedor F', 'fornecedorF@exemplo.com', '6789-0123', 6);
INSERT INTO tb_fornecedor (id, nome, email, telefone, categoria_id) VALUES (7, 'Fornecedor G', 'fornecedorG@exemplo.com', '7890-1234', 7);
INSERT INTO tb_fornecedor (id, nome, email, telefone, categoria_id) VALUES (8, 'Fornecedor H', 'fornecedorH@exemplo.com', '8901-2345', 8);
INSERT INTO tb_fornecedor (id, nome, email, telefone, categoria_id) VALUES (9, 'Fornecedor I', 'fornecedorI@exemplo.com', '9012-3456', 9);
INSERT INTO tb_fornecedor (id, nome, email, telefone, categoria_id) VALUES (10, 'Fornecedor J', 'fornecedorJ@exemplo.com', '0123-4567', 10);
INSERT INTO tb_fornecedor (id, nome, email, telefone, categoria_id) VALUES (11, 'Fornecedor K', 'fornecedorK@exemplo.com', '1234-5678', 11);
INSERT INTO tb_fornecedor (id, nome, email, telefone, categoria_id) VALUES (12, 'Fornecedor L', 'fornecedorL@exemplo.com', '2345-6789', 12);
INSERT INTO tb_fornecedor (id, nome, email, telefone, categoria_id) VALUES (13, 'Fornecedor M', 'fornecedorM@exemplo.com', '3456-7890', 13);
INSERT INTO tb_fornecedor (id, nome, email, telefone, categoria_id) VALUES (14, 'Fornecedor N', 'fornecedorN@exemplo.com', '4567-8901', 14);
INSERT INTO tb_fornecedor (id, nome, email, telefone, categoria_id) VALUES (15, 'Fornecedor O', 'fornecedorO@exemplo.com', '5678-9012', 15);
INSERT INTO tb_fornecedor (id, nome, email, telefone, categoria_id) VALUES (16, 'Fornecedor P', 'fornecedorP@exemplo.com', '6789-0123', 16);
INSERT INTO tb_fornecedor (id, nome, email, telefone, categoria_id) VALUES (17, 'Fornecedor Q', 'fornecedorQ@exemplo.com', '7890-1234', 17);
INSERT INTO tb_fornecedor (id, nome, email, telefone, categoria_id) VALUES (18, 'Fornecedor R', 'fornecedorR@exemplo.com', '8901-2345', 18);
INSERT INTO tb_fornecedor (id, nome, email, telefone, categoria_id) VALUES (19, 'Fornecedor S', 'fornecedorS@exemplo.com', '9012-3456', 19);
INSERT INTO tb_fornecedor (id, nome, email, telefone, categoria_id) VALUES (20, 'Fornecedor T', 'fornecedorT@exemplo.com', '0123-4567', 20);

INSERT INTO produto (id, nome, descricao, preco, quantidade_em_estoque, categoria_id, fornecedor_id) VALUES (1, 'Produto A', 'Descrição do Produto A', 100.50, 50, 1, 1);
INSERT INTO produto (id, nome, descricao, preco, quantidade_em_estoque, categoria_id, fornecedor_id) VALUES (2, 'Produto B', 'Descrição do Produto B', 150.75, 40, 2, 2);
INSERT INTO produto (id, nome, descricao, preco, quantidade_em_estoque, categoria_id, fornecedor_id) VALUES (3, 'Produto C', 'Descrição do Produto C', 200.00, 30, 3, 3);
INSERT INTO produto (id, nome, descricao, preco, quantidade_em_estoque, categoria_id, fornecedor_id) VALUES (4, 'Produto D', 'Descrição do Produto D', 250.20, 20, 4, 4);
INSERT INTO produto (id, nome, descricao, preco, quantidade_em_estoque, categoria_id, fornecedor_id) VALUES (5, 'Produto E', 'Descrição do Produto E', 300.80, 10, 5, 5);
INSERT INTO produto (id, nome, descricao, preco, quantidade_em_estoque, categoria_id, fornecedor_id) VALUES (6, 'Produto F', 'Descrição do Produto F', 120.50, 60, 6, 6);
INSERT INTO produto (id, nome, descricao, preco, quantidade_em_estoque, categoria_id, fornecedor_id) VALUES (7, 'Produto G', 'Descrição do Produto G', 180.30, 35, 7, 7);
INSERT INTO produto (id, nome, descricao, preco, quantidade_em_estoque, categoria_id, fornecedor_id) VALUES (8, 'Produto H', 'Descrição do Produto H', 220.60, 45, 8, 8);
INSERT INTO produto (id, nome, descricao, preco, quantidade_em_estoque, categoria_id, fornecedor_id) VALUES (9, 'Produto I', 'Descrição do Produto I', 270.90, 50, 9, 9);
INSERT INTO produto (id, nome, descricao, preco, quantidade_em_estoque, categoria_id, fornecedor_id) VALUES (10, 'Produto J', 'Descrição do Produto J', 330.50, 30, 10, 10);
INSERT INTO produto (id, nome, descricao, preco, quantidade_em_estoque, categoria_id, fornecedor_id) VALUES (11, 'Produto K', 'Descrição do Produto K', 140.60, 60, 11, 11);
INSERT INTO produto (id, nome, descricao, preco, quantidade_em_estoque, categoria_id, fornecedor_id) VALUES (12, 'Produto L', 'Descrição do Produto L', 160.70, 20, 12, 12);
INSERT INTO produto (id, nome, descricao, preco, quantidade_em_estoque, categoria_id, fornecedor_id) VALUES (13, 'Produto M', 'Descrição do Produto M', 210.80, 10, 13, 13);
INSERT INTO produto (id, nome, descricao, preco, quantidade_em_estoque, categoria_id, fornecedor_id) VALUES (14, 'Produto N', 'Descrição do Produto N', 260.90, 80, 14, 14);
INSERT INTO produto (id, nome, descricao, preco, quantidade_em_estoque, categoria_id, fornecedor_id) VALUES (15, 'Produto O', 'Descrição do Produto O', 320.40, 70, 15, 15);
INSERT INTO produto (id, nome, descricao, preco, quantidade_em_estoque, categoria_id, fornecedor_id) VALUES (16, 'Produto P', 'Descrição do Produto P', 190.30, 45, 16, 16);
INSERT INTO produto (id, nome, descricao, preco, quantidade_em_estoque, categoria_id, fornecedor_id) VALUES (17, 'Produto Q', 'Descrição do Produto Q', 230.60, 25, 17, 17);
INSERT INTO produto (id, nome, descricao, preco, quantidade_em_estoque, categoria_id, fornecedor_id) VALUES (18, 'Produto R', 'Descrição do Produto R', 280.70, 50, 18, 18);
INSERT INTO produto (id, nome, descricao, preco, quantidade_em_estoque, categoria_id, fornecedor_id) VALUES (19, 'Produto S', 'Descrição do Produto S', 340.20, 35, 19, 19);
INSERT INTO produto (id, nome, descricao, preco, quantidade_em_estoque, categoria_id, fornecedor_id) VALUES (20, 'Produto T', 'Descrição do Produto T', 120.80, 60, 20, 20);
INSERT INTO produto (id, nome, descricao, preco, quantidade_em_estoque, categoria_id, fornecedor_id) VALUES (21, 'Produto U', 'Descrição do Produto U', 110.00, 100, 1, 1);
INSERT INTO produto (id, nome, descricao, preco, quantidade_em_estoque, categoria_id, fornecedor_id) VALUES (22, 'Produto V', 'Descrição do Produto V', 130.50, 90, 2, 2);
INSERT INTO produto (id, nome, descricao, preco, quantidade_em_estoque, categoria_id, fornecedor_id) VALUES (23, 'Produto W', 'Descrição do Produto W', 140.90, 80, 3, 3);
INSERT INTO produto (id, nome, descricao, preco, quantidade_em_estoque, categoria_id, fornecedor_id) VALUES (24, 'Produto X', 'Descrição do Produto X', 150.30, 70, 4, 4);
INSERT INTO produto (id, nome, descricao, preco, quantidade_em_estoque, categoria_id, fornecedor_id) VALUES (25, 'Produto Y', 'Descrição do Produto Y', 160.80, 60, 5, 5);
INSERT INTO produto (id, nome, descricao, preco, quantidade_em_estoque, categoria_id, fornecedor_id) VALUES (26, 'Produto Z', 'Descrição do Produto Z', 170.50, 50, 6, 6);
INSERT INTO produto (id, nome, descricao, preco, quantidade_em_estoque, categoria_id, fornecedor_id) VALUES (27, 'Produto AA', 'Descrição do Produto AA', 180.00, 40, 7, 7);
INSERT INTO produto (id, nome, descricao, preco, quantidade_em_estoque, categoria_id, fornecedor_id) VALUES (28, 'Produto AB', 'Descrição do Produto AB', 190.30, 30, 8, 8);
INSERT INTO produto (id, nome, descricao, preco, quantidade_em_estoque, categoria_id, fornecedor_id) VALUES (29, 'Produto AC', 'Descrição do Produto AC', 200.20, 20, 9, 9);
INSERT INTO produto (id, nome, descricao, preco, quantidade_em_estoque, categoria_id, fornecedor_id) VALUES (30, 'Produto AD', 'Descrição do Produto AD', 210.70, 10, 10, 10);
