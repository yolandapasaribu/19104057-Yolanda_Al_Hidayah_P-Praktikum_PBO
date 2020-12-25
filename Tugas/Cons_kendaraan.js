/**
 * Code ini ditulis oleh Yolanda Al Hidayah Pasaribu
 * 
 * 19104057 - IT Telkom Purwokerto
 * 
 * Inheritance Constructor
 */

const prompt = require('prompt-sync')()

function Kendaraan(noPlat, merk, pajakKendaraan){
    this.noPlat = noPlat
    this.merk = merk
    this.pajakKendaraan = pajakKendaraan
}


Kendaraan.prototype.fasTambahan = function(){}

Kendaraan.prototype.inputKendaraan = function(){
    this.noPlat = prompt('Masukkan No. Plat\t\t: ')
    this.merk = prompt('Masukkan Merk\t\t\t: ')
    this.pajakKendaraan = prompt('Masukkan Pajak Kendaraan\t: ')
}

Kendaraan.prototype.PrintfasTambahan = function(){}

Kendaraan.prototype.hitungPajak = function(){}

Kendaraan.prototype.print = function(){
    console.log('--- INFO KENDARAAN ---')
    console.log('No. Kendaraan\t\t\t: ', this.noPlat)
    console.log('Merk\t\t\t\t: ', this.merk)
    this.PrintfasTambahan()
    console.log('Masukkan pajak kendaraan\t: ', this.pajakKendaraan)
    console.log('Total Pembayaran pajak\t\t: ', this.hitungPajak) 
}

//turunan fungsi sedan

function Sedan(fasKeamanan, kapasitasCC, fasKenyamanan){
    this.fasKeamanan = fasKeamanan
    this.kapasitasCC = kapasitasCC
    this.fasKenyamanan = fasKenyamanan
}


//menginheritance fungsi kendaraan

Sedan.prototype = new Kendaraan()
Sedan.prototype.constructor = Kendaraan

//mendefinisi ulang fungsi method fasTambahan
Sedan.prototype.fasTambahan = function(){
    this.fasKeamanan =prompt ('Masukkan fasilitas keamanan\t: ')
    this.kapasitasCC = prompt ('Masukkan kapasistas CC\t\t: ')
    this.fasKenyamanan = prompt ('Masukkan fasilitas kenyamanan\t: ')
}


//mendefinisi ulang fungsi method PrintfasTambahan
Sedan.prototype.PrintfasTambahan = function(){
    console.log('Fasilitas keamanan\t\t: ',this.fasKeamanan)
    console.log('Kapasitas CC\t\t\t: ',this.kapasitasCC)
    console.log('Fasilitas kenyamanan\t\t: ',this.fasKenyamanan)
}

//mendefinisi ulang fungsi  method hitungPajak
Sedan.prototype.hitungPajak = function(){
    this.hitungPajak = (Number(this.pajakKendaraan * 1  + (this.pajakKendaraan * this.kapasitasCC * 0.00005)))
}

//turunan fungsi bus
function Bus(kapPenumpang, kapBagasi){
    this.kapPenumpang = kapPenumpang
    this.kapBagasi = kapBagasi
}

//menginheritance fungsi kendaraan
Bus.prototype = new Kendaraan()
Bus.prototype.constructor = Kendaraan

//mendefinisi ulang fungsi method fasTambahan
Bus.prototype.fasTambahan = function(){
    this.kapPenumpang = prompt ('Masukkan Kapasitas Penumpang\t:')
    this.kapBagasi= prompt ('Masukkan Kapasitas Bagasi (kg)\t: ')
}

//mendefinisi ulang fungsi method PrintfasTambahan
Bus.prototype.PrintfasTambahan = function(){
    console.log('Kapasitas Penumpang\t: ',this.kapPenumpang)
    console.log('Kapasitas Bagasi (kg)\t: ',this.kapBagasi)
}

//mendefinisi ulang fungsi method hitungPajak
Bus.prototype.hitungPajak = function(){
    this.hitungPajak = (Number(this.pajakKendaraan * 1 + (this.pajakKendaraan * this.kapPenumpang * this.kapBagasi * 0.00005)))
}


console.log('Input data Sedan')

//objek sedan
var obSedan = new Sedan()

//input data sedan
obSedan.inputKendaraan()
obSedan.fasTambahan()


console.log('Input data Bus')
//objek bus
var obBus = new Bus()

//input data Bus
obBus.inputKendaraan()
obBus.fasTambahan()

console.log('\n---Data Seluruh Kendaraan---')

//cetak data sedan
console.log('1. Sedan')

obSedan.hitungPajak()
obSedan.print()

console.log()
//cetak data bus
console.log('2. Bus')


obBus.hitungPajak()
obBus.print()








