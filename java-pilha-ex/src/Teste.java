class ConexaoException extends Exception
{
    //------
}

//------

class Conexao {
    public void fecha() throws ConexaoException {
        //implementacao omitida
    }
}

//------

class TesteConexao {
    public static void main(String[] args) throws ConexaoException {
        Conexao con = new Conexao();
        con.fecha();
    }
}