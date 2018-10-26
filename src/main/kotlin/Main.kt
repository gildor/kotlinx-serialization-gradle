import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JSON

fun main() {
    val parsedFoo = JSON.parse<Foo>(json)

    check(parsedFoo == Foo(bar = 42))

    val serializedFoo = JSON.stringify(parsedFoo)

    check(serializedFoo == json)

    println(serializedFoo)
}

const val json = """{"bar":42}"""

@Serializable
data class Foo(val bar: Int)