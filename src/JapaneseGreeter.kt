/**
 * Created by oohashi on 2017/06/24.
 */
open class JapaneseGreeter: Greeter {
    override fun sayHello(target: String) {
        println("こんにちは，" + target + "さん" + "!")
    }
    override  fun sayHello() {
        sayHello("匿名")
    }
}
