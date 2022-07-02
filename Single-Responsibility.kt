class Student(_salary: Int){
    var salary: Int = _salary
    var type: String = "Student"
}

class Worker(_salary: Int){
    var salary: Int = _salary
    var type: String = "Worker"
}

class Taxes(_taxes:MutableMap<String,Int>)
{
    var taxes = _taxes;
    
    fun sum() : Int{
        var sum = 0
        for((key, value) in taxes){
            if(key == "Student")
              sum += value/100*10;
            if(key == "Worker")
              sum += value/100*30;
        }
        return sum
        //println("Tax sum is $sum")
    }
  
}

class TaxOutputer(_sum: Int)
{
    var sum = _sum
    
    fun taxDetailsString(){
        println("Tax sum is $sum")
    }
    
    fun taxDetailsArray(){
        println(mapOf("Sum" to sum))
    }
}

fun main() {
    var arrea = mutableMapOf<String,Int>()
    var person1 = Student(200000)
    arrea.put(person1.type, person1.salary)
    var person2 = Worker(500000)
    arrea.put(person2.type, person2.salary)
    var person3 = Worker(700000)
    arrea.put(person3.type, person3.salary)    
    var taxes = Taxes(arrea)
    var sum = taxes.sum()
    var outputer = TaxOutputer(sum)
    outputer.taxDetailsString()
    outputer.taxDetailsArray()
}
