/*
* Tipos de Datos:
* Tipo de datos numerico   Bit
* Double                   64
* Float                    32
* Long                     64
* Int                      32
* Short                    16
* Byte                     8
* Double
* */
fun main(args:Array<String>){
    var numero:Int=18;
    var doble:Double=18.0;
    var flotante:Float=18F;
/*
* Tipos de Datos: Character, String
* */
    var char:Char='a';
    var char2:Char='\uFA10';
    println(char2)
    var charToInt:Int=char.toInt();
    println(charToInt)

    var cadena:String="Juan"
    println(cadena[0])

    /*
    * Caracteres de escape
    * */
    cadena="Juan\nPablo Velasuqez"
    print(cadena)

    cadena="""
         Hola \n Pablo ""
         con salto de linea
    """.trimIndent()
    print(cadena);

    var variable1:String="Juan";
    println("Mi nombre es $variable1");
    var dinero=10;
    println("Mi nombre es $variable1 y tengo ${variable1.length} carácteres");
    println("Tengo ${'$'} $dinero");
}