const prompt = require('prompt-sync')()

let total = prompt('Berapa input Mahasiswa\t: ')

var array = []
var mahasiswa = {}

for(let i = 0; i< total; i++){
  console.log(`\nMahasiswa ${ i }`)
  mahasiswa = {
    firstName : prompt('Input Nama Depan\t\t:'),
    lastName : prompt('Input Nama Belakang\t\t:'),
    fullName : function(){
      return this.firstName + " " + this.lastName
    },
    birth : prompt('Input Tgl Lahir\t\t: '),
    nim : prompt('Input NIM\t\t\t: '),
    age : function(){
      let year = this.birth.slice(this.birth.length - 4)
      //slice buat motong tring //this merujuk ke mhs
      return 2020 - year
    }
  }

  array.push(mahasiswa)
}


console.log()
let index = 0

for(let x in array){
  console.log(`\nMahasiswa ${ index }`)
  index++
  console.log(`Nama\t\t\t:${ array[x].fullName()}`)
  console.log(`Tanggal Lahir\t: ${ array[x].birth }`)
  console.log(`NIM\t\t\t\t: ${ array[x].nim }`)
  console.log(`Umur\t\t\t: ${ array[x].age() }`)
}