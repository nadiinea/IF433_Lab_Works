package oop_111152_nadine.week5

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {

    override fun bekerja() {
        println("$nama sedang menyiapkan materi perkuliahan dan merevisi RPKPS.")
    }

    fun mengajar() {
        println("$nama sedang ngajar mahasiswa di kelas.")
    }
}