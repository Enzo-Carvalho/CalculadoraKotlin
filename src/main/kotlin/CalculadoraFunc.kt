fun main() {
    val operacoes = arrayOf("+","-","/","*")
    var oper: String
    var text = ""
    print("Digite o primeiro numero: ")
    val n1 = readln().toInt()
    text += "$n1 "
    println()
    do {
        println("Sendo: \n(+)Adição \n(-)subtração \n(/)divisao \n(*)multiplicação")
        print("Digite de acordo com a operação desejada: ")
        oper = readln()
        } while (oper !in operacoes)

    print("Digite segundo numero: ")
    text += "$oper "
    print("$text ")
    val n2 = readln().toInt()

    if (oper == "+") {
        fun soma(n1: Int, n2: Int): Int {
            return n1 + n2
        }
        println("Soma: $n1 + $n2 = ${soma(n1, n2)}")
    }

    if (oper == "-") {
        fun sub(n1: Int, n2: Int): Int {
            return n1 - (n2)
        }
        println("Subtração: $n1 - $n2 = ${sub(n1, n2)}")
    }
    if (oper == "/") {
        fun div(n1: Int, n2: Int): Int {
            return n1 / n2
        }
        println("Divisão: $n1 / $n2 = ${div(n1, n2)}")
    }
    if (oper == "*"){
        fun multi(n1: Int, n2: Int): Int {
            return n1 * n2
        }
        println("Multiplicação: $n1 x $n2 = ${multi(n1, n2)}")
    }
}