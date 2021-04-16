/**
 * Code ini ditulis oleh Yolanda Al Hidayah Pasaribu
 * 
 * 19104057 - IT Telkom Purwokerto
 * 
 * Inheritance Object
 */

const prompt = require('prompt-sync')()

//class kendaraan
var Kendaraan = {
    //fungsi method input atribut
    inputAtribut : function(noPlat, merk, pajakKendaraan){
        this.noPlat = prompt('Masukkan No. Plat\t\t: ')
        this.merk = prompt('Masukkan Merk\t\t: ')
        this.pajakKendaraan = prompt('Masukkan Pajak Kendaraan\t: ')
    },

    //fungsi method fasTambahan
    fasTambahan : function(){},

    //fungsi method printFasTambahan
    printFasTambahan : function(){},

    //fungsi method hitung pajak
    hitungPajak : function(){},

    //fungsi method print
    print : function(){
       console.log('--- INFO KENDARAAN ---')
        console.log('No. Kendaraan\t: ', this.noPlat)
        console.log('Merk\t\t\t: ', this.merk)
        this.printFasTambahan()
        console.log('Masukkan pajak kendaraan\t: ', this.pajakKendaraan)
        console.log('Total Pembayaran pajak: ', this.hitungPajak) 
    }
}
   
//objek sedan

var Sedan = Object.create(Kendaraan)

//mendefinisi ulang fungsi method fasTambahan
Sedan.fasTambahan = function(fasKeamanan, kapasitasCC, fasKenyamanan){
        this.fasKeamanan = prompt ('Masukkan fasilitas keamanan\t:')
        this.kapasitasCC = prompt ('Masukkan kapasistas CC\t:')
        this.fasKenyamanan = prompt ('Masukkan fasilitas kenyamanan\t:')
    }

//mendefinisi ulang fungsi method PrintFasTambahan
Sedan.printFasTambahan = function(fasKeamanan, kapasitasCC, fasKenyamanan){
    console.log('Fasilitas keamanan\t: ',this.fasKeamanan)
    console.log('Kapasitas CC\t: ',this.kapasitasCC)
    console.log('Fasilitas kenyamanan\t: ',this.fasKenyamanan)
}

//mendefinisi ulang fungsi  methodhitungPajak
Sedan.hitungPajak = function(hitungPajak){
    this.hitungPajak = (Number(this.pajakKendaraan * 1  + (this.pajakKendaraan * this.kapasitasCC * 0.00005)))
}

//objek Bus
var Bus = Object.create(Kendaraan)

//mendefinisi ulang fungsi method fasTambahan
Bus.fasTambahan = function(kapPenumpang, kapBagasi){
    this.kapPenumpang = prompt ('Masukkan Kapasitas Penumpang\t:')
    this.kapBagasi= prompt ('Masukkan Kapasitas Bagasi\t:')
}

//mendefinisi ulang fungsi  methodPrintFasTambahan
Bus.printFasTambahan = function(kapPenumpang, kapBagasi){
    console.log('Kapasitas Penumpang\t: ',this.kapPenumpang)
    console.log('Kapasitas Bagasi\t: ',this.kapBagasi)
}

//mendefinisi ulang fungsi method hitungPajak
Bus.hitungPajak = function(hitungPajak){
    this.hitungPajak = (Number(this.pajakKendaraan * 1 + (this.pajakKendaraan * this.kapPenumpang * this.kapBagasi * 0.00005)))
}


//input data sedan dan bus
console.log('\n---Input Data---')
console.log('\n1. Sedan')
Sedan.inputAtribut()

Sedan.fasTambahan()
Sedan.hitungPajak()


console.log('\n2. Bus')
Bus.inputAtribut()
Bus.fasTambahan()
Bus.hitungPajak()


//cetak data sedan dan bus
console.log('\n---Data Seluruh Kendaraan---')
console.log('\n1. Sedan')
Sedan.print()
console.log('\n2. Bus')
Bus.print()







