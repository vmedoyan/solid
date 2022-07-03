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

class Sql(_dbConnection:Any){
    var dbConnection = _dbConnection
}


fun main() {
   
}
