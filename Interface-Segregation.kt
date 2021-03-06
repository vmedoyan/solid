interface TaxInterface {
    var tax: Int
}
interface SalaryInterface {
    var SalaryWithoutTax: Int
}

class Student(_salary: Int) : TaxInterface{
    var salary: Int = _salary
    var type: String = "Student"
    override var tax = salary/100*10;
}

class Worker(_salary: Int) : TaxInterface,SalaryInterface{
    var salary: Int = _salary
    var type: String = "Worker"
    override var tax = salary/100*30;
    override var SalaryWithoutTax = salary/100*30;
}

open class Taxes(_taxes:MutableMap<String,Int>)
{
    var taxes = _taxes;
    fun sum() : Int{
        var sum = 0
        for((key, value) in taxes){
            sum += value;
        }
        return sum
    }
    
}

class Salary : Taxes{
    constructor(_taxes:MutableMap<String,Int>): super(_taxes) {
        var taxes = _taxes
    }
    
    fun salary() : Int{
        var sum = 0
        for((key, value) in taxes){
            sum += value;
        }
        return sum
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
    arrea.put(person1.type, person1.tax)
    var person2 = Worker(500000)
    arrea.put(person2.type, person2.tax)
    var person3 = Worker(700000)
    arrea.put(person3.type, person3.tax)    
    var salary = Salary(arrea)
    var sum1 = salary.salary()
    var outputer = TaxOutputer(sum1)
    outputer.taxDetailsString()
    outputer.taxDetailsArray()
}
