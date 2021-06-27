fun main() {
    // 3. Number

    /*
        byte    8   -128                            127
        short   16  -32768                          32767
        int     32  -2.147.483.648                  2.147.483.647
        long    64  -9.223.372.036.854.775.808      9.223.372.036.854.775.807
     */

    var age: Int = 20
    var juta: Long = 2_000_000
    var sampleFloat: Float = 10.1F

    println(age)
    println(juta)
    println(sampleFloat)

    var sampleBinary: Byte = 0b01010110
    println(sampleBinary)

    var sampleHexa: Int = 0x00201
    println(sampleHexa)

    var price: Long = 9_000_000_000_000L    // separator in number
    println(price)

    var priceInt: Int = price.toInt()   // convertion overflow, because batas maksimal int hanya sampai 2Man
    println(priceInt)

    var doubleBinary: Double = sampleBinary.toDouble()
    println(doubleBinary)
}
