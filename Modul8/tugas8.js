const prompt = require('prompt-sync')()

var array = []

//function mahasiswa
function Mahasiswa(nama, tglLahir, nim, prodi){
    this.nama = nama
    this.tglLahir = tglLahir
    this.age = function(){
       let year = this.tglLahir.slice(this.tglLahir.length - 4)
       return 2020 - year
     }
    this.nim = nim
    this.prodi = prodi
    this.grade = null
}

//function menambahkan data mahasiswa
function tambahMhs(){
    console.log("Tambah Mahasiswa")
    let nama = prompt("Input Nama\t\t : ")
    let tglLahir = prompt("Input Tanggal Lahir\t : ")
    let nim = prompt("Input NIM\t\t : ")
        console.log(" Pilih Prodi")
        console.log(" 1. S1 SE")
        console.log(" 2. S1 IF")
        console.log(" 3. S1 SI")
    let prodi = prompt("Input angka Prodi\t: ")
        switch (prodi){
            case '1' : 
                prodi = 'S1 SE'
                break
            case '2' : 
                prodi = 'S1 IF'
                break
            case '3' : 
            prodi = 'S1 SI'
                break
            default :
            prodi = 'NOPE'
    }
    let mahasiswa = new Mahasiswa(nama, tglLahir, nim, prodi)
    array.push(mahasiswa)
}

//penilaian
function Grade (nilai){
    if (nilai > 80 && nilai <= 100){
       return 'A'
    }
    else if (nilai > 60 && nilai <= 80){
      return 'B'
    }

    else if (nilai > 40 && nilai <= 60){
        return 'C'
    }

    else if (nilai > 0 && nilai <= 40){
        return 'D'    
    }
}

//menginputkan nilai dengan berdasarkan nim 
function cariData(){
    var cariNim = prompt('Masukkan NIM: ')
    var nilai = prompt('Masukkan nilai: ')

    var index = array.findIndex(function(data){
        return data['nim'] == cariNim;
    })
    array[index]['grade'] = Grade(nilai)
}

//menampilkan data mahasiswa
function dataMhs(){
    let index = 0
 for(let x in array){
    var umur = array[x].age()
     console.log(`\nMahasiswa ${ index }`)
     index++
     console.log(`Nama\t\t: ${ array[x].nama}`)
     console.log(`Tanggal Lahir\t: ${ array[x].tglLahir}`)
     console.log(`Umur\t\t: ${ umur }`)
     console.log(`NIM\t\t: ${ array[x].nim }`)
     console.log(`Prodi\t\t: ${ array[x].prodi}`) 
     console.log(`Grade\t\t: ${ array[x].grade}`)
     console.log()
  }
}

//Menampilkan menu penilaian
var pilihMenu = true

while(pilihMenu){
    console.log("======================")
    console.log("    MENU PENILAIAN    ")
    console.log("======================")
    console.log("1. Tambah Mahasiswa")
    console.log("2. Penilaian")
    console.log("3. Daftar Mahasiswa")
    console.log("4. Keluar")

    var pilihan = prompt('Masukan pilihan\: ')
    switch(pilihan){
    case '1':
        pilihan = tambahMhs()
        break;
    case '2' :
        pilihan = cariData()
        break;
    case '3' :
        pilihan = dataMhs()
        break;
    case '4' :
        console.log('METU!')
        pilihMenu = false
        break; 
    default:
        console.log("Pilihan tidak ditemukan")
    }
}








        

