package one.digitalinnovation.bank

class Pessoa {
    var name: String = "Jeovani"
    var cpf: String = "111.111.111-11"

    inner class Endereco{
        val rua:String = "Rua teste"
    }

}

fun main() {

    val pessoa = Pessoa()

    println(pessoa.name)
    println(pessoa.cpf)
    println(pessoa.Endereco().rua)
}