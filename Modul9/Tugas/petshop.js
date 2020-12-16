const prompt = require('prompt-sync')()

var arrayHewan = []

var hewan = {}

var noHewan

let index

function Hewan(nama, jenis, umur, makanan, riwayatPenyakit){
    this.nama = nama
    this.jenis = jenis
    this.umur = umur
    this.makanan = makanan
    this.riwayatPenyakit = riwayatPenyakit

    this.tampil = function(){
        console.log('Nama\t\t: ', this.nama)
        console.log('Jenis\t\t: ', this.jenis)
        console.log('Umur\t\t: ',this.umur)
        console.log('Makanan\t\t: ', this.makanan)
        console.log('Riwayat Penyakit\t: ', this.riwayatPenyakit)
    }
}

//tambah hewan
   function tambahData(){
    console.log('-----TAMBAH HEWAN----')
    let jmlHewan = prompt('Jumlah hewan yang akan ditambahkan\t: ')
    for(let i=0; i<jmlHewan; i++){
        console.log()
    
        hewan = new Hewan(
            console.log(`Input hewan ke-${i}: `),
            prompt(` - Input nama hewan\t\t: `),
            prompt(` - Input jenis hewan\t\t: `),
            prompt(` - Input umur hewan\t\t: `),
            prompt(` - Input makanan hewan\t\t: `),
            prompt(` - Input riwayat penyakit hewan\t: `),
        )
        arrayHewan.push(hewan)
    }

   }
//edit hewan menggunakan prototype
    function editData(){
        console.log()
        console.log('-----EDIT HEWAN-----')
        noHewan = prompt('Masukkan urutan data hewan yang ingin diubah\t: ')

        Hewan.prototype.edit = function(){
            nama = prompt('Masukkan nama hewan baru\t\t: ')
            jenis = prompt('Masukkan jenis baru\t\t: ')
            umur = prompt('Masukkan umur baru\t\t: ')
            makanan = prompt('Masukkan makanan baru \t\t: ')
            riwayatPenyakit = prompt('Masukkan riwayat penyakit baru hewan\t: ')
            tampil = this.tampil
            return {nama,jenis,umur,makanan,riwayatPenyakit,tampil}   
        }
        index = noHewan-1
        arrayHewan[index] = arrayHewan[index].edit()
    }
 //Tampil hewan
function cetakData(){

    console.log('-----TAMPIL DATA HEWAN-----')
    console.log('Data Sesuda diubah')
    index= 1
    for(let i in arrayHewan){
        console.log(`\nHewan ke-${index}`)
        index++
        arrayHewan[i].tampil()
    }
}

var pilihanMenu = true

while(pilihanMenu){
    console.log("======================")
    console.log("     DATA PETSHOP     ")
    console.log("======================")
    console.log("1. Tambah Data Hewan")
    console.log("2. Edit Data Hewan")
    console.log("3. Tampil Data Hewan")
    console.log("4. Keluar")

    var pilih = prompt('Masukkan pilihan menu\t: ')
    switch(pilih){
        case '1':
            pilih = tambahData()
            break
        case '2' :
            pilih = editData()
            break
        case '3' :
            pilih = cetakData()
            break
        case '4' :
            console.log('Keluar')
            pilihanMenu = false
            break
        default:
            console.log("Nope")
    }
}

