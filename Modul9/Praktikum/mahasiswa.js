function Mahasiswa(nim, nama, prodi){
    this.nim = nim;
    this.nama = nama;
    this.prodi = prodi;

    //fungsi untuk menampilkan
    this.tampil = function(){
        console.log('NIM\t: ', this.nim)
        console.log('Nama\t: ', this.nama)
        console.log('Prodi\t: ', this.prodi)
    }
}
const prompt = require('prompt-sync')()

let jmlMhs = prompt('Masukkan jumlah mahasiswa\t: ')

//array mahasiswa
var arrayMhs = []

//objek mahasiswa
var mhs = {}

for(let i=1; i<=jmlMhs; i++){
    console.log(`\nMahasiswa ke-${i}`)

    //buat objek mhs
    mhs = new Mahasiswa(
        prompt('Masukkan NIM\t\t: '),
        prompt('Masukkan Nama\t\t: '),
        prompt('Masukkan Prodi\t\t: ')
    )
    arrayMhs.push(mhs)
}

var editData = prompt('Ingin mengubah data? [ya/tidak]\t:')

if(editData == 'ya'){
    var noMhs = prompt('Masukkan nomor urut mahasiswa\t: ')

    //tambah fungsi baru ke constructor

    Mahasiswa.prototype.edit = function(){
        nim = prompt('NIM\t: '),
        nama = prompt('Nama\t: '),
        prodi = prompt('Prodi\t: '),
        tampil = this.tampil
        return {nim, nama, prodi, tampil}
    }

    let index = noMhs-1
    arrayMhs[index] = arrayMhs[index].edit()

    console.log('Data setelah di ubah')
    index = 1

    for(let i in arrayMhs){
        console.log(`\nMahasiswa ke-${index}`)
        index++
        arrayMhs[i].tampil()
    }
  
} 
else if(editData == 'tidak'){
        console.log('Data setelah di ubah')
    index = 1

    for(let i in arrayMhs){
        console.log(`\nMahasiswa ke-${index}`)
        index++
        arrayMhs[i].tampil()
    }
}else{
    console.log('Pilihan tidak sesuai')
}