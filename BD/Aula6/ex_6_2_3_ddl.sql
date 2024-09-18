CREATE TABLE medico (
    numSNS INT PRIMARY KEY,
    nome VARCHAR(50),
    especialidade VARCHAR(50),
);

CREATE TABLE  paciente (
    numUtente INT PRIMARY KEY,
    nome VARCHAR(50),
    dataNasc DATE,
    endereco VARCHAR(50),
);

CREATE TABLE farmacia (
    telefone VARCHAR(50) PRIMARY KEY,
);