/*
class MySqlConnection{
    fun connect();
}

class Sql(_dbConnection:MySqlConnection){
    var dbConnection = _dbConnection
}
*/

interface DBConnectionInterface
{
    fun connect();
}

class MySqlConnection:DBConnectionInterface {
    override fun connect(){
        
    }
}

class PostgreSQLConnection:DBConnectionInterface {
    override fun connect(){
        
    }
}

class Sql(_dbConnection:DBConnectionInterface){
    var dbConnection = _dbConnection
}
