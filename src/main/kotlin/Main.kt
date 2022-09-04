import java.awt.Button

fun main() {

    // GLOSSARIO (var, val, fun, main, class, Double, String, Int)

    // val é uma variável IMUTÁVEL
    // var é uma variável MUTÁVEL
    // double, Srting e Int são tipos de vavriáveis (número decimal, texto, número inteiro)

    val preço = 54.90 // TIPO INFERIDO


    //ESPAÇOS DE MEMÓRIA EM TIPOS PRIMITIVOS

// texto
    val product: String = "iMac"

//numeros
    val byte: Byte = 8 // tipo de varíavel int do tipo byte (o número ocupa até 8 bits)
    val short: Short = 16 // tipo de variavel int do tipo short (o número ocupa até 16 bits)
    val age : Int = 39 // 32 bits
    val long: Long = 12345678910 // tipo de variavel int do tipo long (64 bits)
    val price : Double = 31.90 // tipo de variavel double 64 bits
    val desconto: Float = 31.90f // tipo de variavel double com ponto flutuante (floating point) 32-bit
    val mediaDePreco = 22
    val response = mediaDePreco.toDouble()


    // booleano (true ou false)
    val booleana = true





    println("tenho $age anos e quero comprar um $product no valor de $price" )
    println(price::class)
    println(product::class)
    println(age::class)
    println(byte::class)
println(response)
}