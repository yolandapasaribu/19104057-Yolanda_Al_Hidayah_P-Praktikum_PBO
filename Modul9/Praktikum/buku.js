//constructor Buku
function Buku(judul, pengarang, penerbit, thTerbit){
    this.judul = judul;
    this.pengarang = pengarang;
    this.penerbit = penerbit;
    this.thTerbit = thTerbit;

    this.tampil = function(){
        console.log('Judul Buku\t: ', this.judul)
        console.log('Nama Pengarang\t: ', this.pengarang)
        console.log('Penerbit\t: ', this.penerbit)
        console.log('Tahun terbit\t: ', this.thTerbit)
    }
}

const prompt = require('prompt-sync')()

let jmlBuku = prompt('Jumlah buku yang akan diinput\t: ')

//deklarasi array
var arrayBuku = []

//deklarasi objek
var buku = {}

//perulangan untuk membuat objek
for(let i=1; i<=jmlBuku; i++){
    console.log()

    //membuat objek dengan constructor
    buku = new Buku(
        prompt(`Masukkan judul buku ke-${i}\t : `),
        prompt(`Masukkan nama pengarang\t\t : `),
        prompt(`Masukkan nama penerbit\t\t : `),
        prompt(`Masukkan tahun terbit\t\t : `)

    )

    arrayBuku.push(buku)

    var editData = prompt('Ingin mengubah data? [ya/tidak]\t: ')

    if(editData == 'ya'){
        var noBuku = prompt('Masukkan urutan buku yang ingin diubah\t: ')

        var namaData = prompt('Masukkan data yang ingin diubah[Judul/Pengarang/Tahun Terbit]\t: ')

        let index = noBuku-1
        if(namaData =='Judul'){
            arrayBuku[index].judul = prompt('Masukkan judul buku baru\t: ')
        } else if(namaData == 'Pengarang'){
            arrayBuku[index].pengarang = prompt('Masukkan nama pengarang baru\t: ')
        } else if(namaData == 'Penerbit'){
            arrayBuku[index].penerbit = prompt('Masukkan nama penerbit baru\t: ')
        }else if(namaData == 'Tahun Terbit'){
            arrayBuku[index].thTerbit = prompt('Masukkan nama Tahun terbit baru\t: ')
        }else {
            console.log('Pilihan tidak sesuai')
        }

        //cetak data 
        console.log('\n Data buku yang berhasil disimpan')

        index = 1;

        for(let i in arrayBuku){
            console.log(`\nBuku ke-${index}`)
            index++
            arrayBuku[i].tampil()
        }
    } else if(editData=='tidak'){
        console.log('\nData Buku')

        index = 1;

        for(let i in arrayBuku){
            console.log(`\nBuku ke-${index}`)
            index++
            arrayBuku[i].tampil()}

        }else{
            console.log('Pilihan tidak sesuai')
    }
}