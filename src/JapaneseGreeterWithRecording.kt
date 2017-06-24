/**
 * Created by oohashi on 2017/06/24.
 */
class JapaneseGreeterWithRecording: JapaneseGreeter {
    private val _target: MutableSet<String>
    val target: Set<String>
        get(){
            return _target
        }
    constructor() {
        _target = mutableSetOf()
    }
    override fun sayHello(target: String) {
        _target.add(target)
        super.sayHello(target)
    }
}
