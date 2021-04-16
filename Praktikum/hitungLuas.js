/**
 * Code ini ditulis oleh Yolanda Al Hidayah Pasaribu
 * 
 * 19104057 - IT Telkom Purwokerto
 * 
 * Inheritance Constructor
 */

const prompt = require('prompt-sync')()

function PersegiPanjang(panjang, lebar){
    this.panjang = panjang;
    this.lebar = lebar
}

//method
PersegiPanjang.prototype.getLuas = function(){
    var luas = this.panjang * this.lebar
    console.log('Luas\t: ', this.panjang , 'x' , this.lebar, ':', luas)
}

PersegiPanjang.prototype.print = function(){
    console.log('Panjang sisi\t: ' , this.panjang)
    console.log('Lebar sisi\t: ', this.lebar)
}

//turunan fungsi
function Persegi(sisi){
    this.panjang = sisi
    this.lebar = sisi
}

//menginheritance fungsi persegi panjang
Persegi.prototype = new PersegiPanjang()
Persegi.prototype.constructor = PersegiPanjang

//definisi ulang fungsi print()
Persegi.prototype.print = function(){
    console.log('Panjang Sisi\t: ', this.panjang) //krn yang di deklarasikan panjang, bebas mau panjang/lebar
}

console.log('Input persegi panjang')

//objek persegi panjang
var obPersegiPanjang = new PersegiPanjang(
    prompt('Masukkan panjang\t: '),
    prompt('Masukkan lebar\t: ')
)

console.log('\nInput persegi')

//objek persegi
var obPersegi = new Persegi(
    prompt('Masukkan panjang sisi\t: ')
)

console.log('\nMenghitung Luas Persegi Panjang')
obPersegiPanjang.print()
obPersegiPanjang.getLuas()

console.log('\nMenghitung Luas Persegi')
obPersegi.print()
obPersegi.getLuas()
