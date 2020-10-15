<h1>Notas de aprendizaje en kotlin</h1>
<li>
<ul>
   Tipos de Datos:
    Tipo de datos numerico   Bit</ul>
   <ul> Double                   64</ul>
   <ul> Float                    32</ul>
   <ul> Long                     64 </ul>
   <ul> Int                      32 </ul>
   <ul> Short                    16 </ul>
   <ul> Byte                     8 </ul>
</li>

### Texto que incluye salida de variables
```

    var variable1:String="Juan";
    println("Mi nombre es $variable1");
    var dinero=10;
    println("Mi nombre es $variable1 y tengo ${variable1.length} carácteres");
    println("Tengo ${'$'} $dinero");
```   

## operador Any
<p>Permite crear elementos con cualquier tipo de datps</p>

```
/* Any */
fun main(args:Array<String>){
    var cualquiera:Any =18.18f;
    println(cualquiera)
    var array:Array<Any> =arrayOf("Pablo",1,2);
    print(array.toString());
}
```
