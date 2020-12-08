const prompt = require('prompt-sync')()

let total = prompt('Berapa input Mahasiswa\t: ')

var array = []
var mahasiswa = {}

for(let i = 0; i< total; i++){
  console.log(`\nMahasiswa ${ i }`)

  let firstName = prompt("Input Nama Depan\t: ")
  let lastName = prompt("Input Nama Belakang\t: ")
  let birth = prompt("Input Tanggal lahir\t: ")
  let nim = prompt("Input NIM\t\t: ")

  mahasiswa = new Mahasiswa(firstName, lastName, birth, nim)

  /*
  mahasiswa = new Mahasiswa()
  
  firstName = prompt("Input Nama Depan\t: ")
  lastName = prompt("Input Nama Belakang\t: ")
  birth = prompt("Input Tgl lahir\t: ")
  nim = prompt("Input NIM\t: ")
  
  */

  array.push(mahasiswa)
}
console.log()

let index = 0

for(let x in array){
  console.log(`\nMahasiswa\t ${ index }`)
  index++
  console.log(`Nama\t\t: ${ array[x].fullName()}`)
  console.log(`Tanggal Lahir\t: ${ array[x].birth }`)
  console.log(`NIM\t\t: ${ array[x].nim }`)
  console.log(`Umur\t\t: ${ array[x].age() }`)
}

function Mahasiswa(firstName, lastName, birth, nim){
   this.firstName = firstName
   this.lastName = lastName

   this.fullName = function(){
      return this.firstName + " " + this.lastName
    }

  this.birth = birth
  this.nim = nim
  this.age = function(){
    let year = this.birth.slice(this.birth.length - 4)
    //sclice buat motong string //this merujuk ke mhs
    return 2020 - year
  }
}