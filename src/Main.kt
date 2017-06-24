/**
 * Created by oohashi on 2017/06/24.
 */

fun main(args: Array<String>) {
    var hoge = JapaneseGreeterWithRecording()
    hoge.sayHello()
    hoge.sayHello("大橋")
    println(hoge.target)
}
