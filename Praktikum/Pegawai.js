/**
 * Code ini ditulis oleh Yolanda Al Hidayah Pasaribu
 * 
 * 19104057 - IT Telkom Purwokerto
 * 
 * Inheritance Object
 */

//class pegawai
var Pegawai = {
    //method fungsi input data
    inputData : function(nip, nama, alamat, gajiPokok){
        this.nip = prompt('Masukkan NIP\t: ')
        this.nama = prompt('Masukkan Nama\t: ')
        this.alamat = prompt('Masukkan Alamat\t: ')
        this.gajiPokok = prompt('Masukkan Gaji Pokok\t: ')
    },

    //method fungsi inputTunjangan
    inputTunjangan : function(tunjangan){
        this.tunjangan = prompt('Masukkan tunjangan\t: ')
    },

    //metdod fungsi print
    print : function(){
        console.log('NIP\t: ', this.nip)
        console.log('Nama\t: ', this.alamat)
        console.log('Alamat\t: ', this.alamat)
        console.log('Gaji Pokok\t: ', this.gajiPokok)
        console.log('Tunjangan\t: ', this.tunjangan)
        console.log('Total Gaji\t: ', (Number(this.gajiPokok) + (this.tunjangan))) 
    }
}

//deklarasi seles - objek baru sales, berdasarkan pegawai
var Sales = Object.create(Pegawai)
Sales.inputTunjangan = function(tunjangan){
    jmlPelanggan = prompt('Masukkan jumlah pelanggan yang direktut\t: ')
    this.tunjangan = jmlPelanggan * 5000
}

var Satpam = Object.create(Pegawai)
Satpam.inputTunjangan = function(tunjangan){
    jam = prompt('Masukkan Jumlah Lembur (dalam jam)\t: ')
    this.tunjangan = jam * 10000
}

var Manager = Object.create(Pegawai)
Manager.inputTunjangan = function(tunjangan){
    thMasuk = prompt('Masukkan tahun masuk\t: ')
    lamaKerja = 2020 - thMasuk
    if(lamaKerja <= 3){
        this.tunjangan = 5/100 * this.gajiPokok
    }else{
        this.tunjangan = 10/100 * this.gajiPokok
    }
}

const prompt = require('prompt-sync')()

console.log('Data Pegawai PT. ABC')
console.log('\n1. Satpam')
Satpam.inputData()
Satpam.inputTunjangan()

console.log('\n2. Sales')
Sales.inputData()
Sales.inputTunjangan()

console.log('\n3. Manager')
Manager.inputData()
Manager.inputTunjangan()

console.log('\n===========================')
console.log('\n Hasil Input Data Pegawai  ')
console.log('\n===========================')
console.log('\n1. Data Satpam')
Satpam.print()
console.log('\n2. Data Sales')
Sales.print()
console.log('\n3. Data Manager')
Manager.print()

