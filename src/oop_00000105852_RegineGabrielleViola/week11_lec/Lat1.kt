package oop_00000105852_RegineGabrielleViola.week11_lec

fun String.rubah_huruf_depan_jadi_besar(): String {
    var hasil = this.split(" ").joinToString(" ") {
        it.replaceFirstChar {
            c -> c.uppercase()
        }
    }
    return "Hai $hasil"
}

fun Int.tentukanGrade(namaMhs:String) {
    var hasilGrade = "E";
    if(this>=80) {
        hasilGrade = "A"
    }else if (this>=70){
        hasilGrade = "B"
    }else {
        hasilGrade = "C"
    }
    println(namaMhs + "Grade kamu " + this)
}

fun String?.cekNulldanEmpty(): String{
    if(this==null || this.isEmpty()){
        return "Username ga boleh null atau empty"
    }else {
        return "Username kamu $this"
    }
}

fun main() {
    println("udin sedunia".rubah_huruf_depan_jadi_besar())

    71.tentukanGrade("Jungkook ")

    var usernameKamu:String? = null
    println(usernameKamu.cekNulldanEmpty());
}