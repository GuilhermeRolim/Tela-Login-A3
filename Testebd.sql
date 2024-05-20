USE bdteste;

CREATE TABLE TesteUsubd (
cpf_usut int (50) NOT NULL,
senha_usut varchar (100) NOT NULL,
nome_usut varchar (100),
tel_usut varchar (30),
end_usut varchar (70),
email_usut varchar (100),
idclass_usut int AUTO_INCREMENT,
PRIMARY KEY (cpf_usut)
);