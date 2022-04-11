package Color
import Color.Color
import Color.Color.*



fun main(args: Array<String>){
    println(RED.rgb())
    println(getMnemonic(RED))
    println(getWarmth(BLUE))
    println(mix(BLUE,YELLOW))
    print(mixOptimized(BLUE,YELLOW))
}