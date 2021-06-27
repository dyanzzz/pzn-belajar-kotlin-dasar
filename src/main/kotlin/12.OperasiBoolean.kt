fun main() {
    // 12. Operasi Boolean

    // && (dan), || (atau), ! (negasi/tidak)
    // && -> jika salah 1 ada yg bernilai false, maka hasilnya false
    // || -> jika salah 1 ada yg bernilai true, maka hasilnya true
    // ! -> kebalikan/ negasi

    val nilaiA = 80
    val nilaiB = 70

    val passFinalExam = nilaiA > 75
    val passAttendee = nilaiB > 85

    val harusLulusSemuanya = passAttendee && passFinalExam
    println("hasil ujianku harus lulus keduanya -> $harusLulusSemuanya")

    val lulusKarenaSalahSatunyaTrue = passAttendee || passFinalExam
    println("hasil ujianku harus lulus salah satunya -> $lulusKarenaSalahSatunyaTrue")
}