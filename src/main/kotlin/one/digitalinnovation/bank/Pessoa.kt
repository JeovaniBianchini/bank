package one.digitalinnovation.bank

class Pessoa {
    var name: String = "Jeovani"
    var cpf: String = "111.111.111-11"
    private set

    constructor()

    fun pessoaInfo() = "$name e $cpf"


}

fun main() {

    val pessoa = Pessoa()

    println(pessoa.pessoaInfo())

}