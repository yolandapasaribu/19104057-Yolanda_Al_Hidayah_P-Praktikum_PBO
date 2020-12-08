var person0 = {} // tanpa value

var person1 = { name : "Yolanda"} // menggunakan value


var person2 = new Object()//menggunakan Object
person2.name = "yoloo" //tambah properti

person1.age = 20
person2.age = 25

//duplicate shift alt bawah
//cara pertama akses
console.log('Object dari person 1 : ')
console.log(`Nama\t: ${ person1.name }`)
console.log('Age\t: '+ person1.age)

console.log()

//cara kedua akses

console.log('Object dari person 2 : ')
console.log(`Nama\t: ${ person2['name'] }`)
console.log('Age\t: '+ person2['age'])
