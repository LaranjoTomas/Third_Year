GO
CREATE PROCEDURE [dbo].[delete_manutencao] @id int
AS
BEGIN
    DELETE FROM Estado_Manutencao WHERE id_manutencao = @id;
    DELETE FROM Manutencao_Funcionario WHERE id_manutencao = @id;
    DELETE FROM Manutencao_Peca WHERE id_manutencao = @id;
    DELETE FROM Manutencao WHERE id = @id;
END

