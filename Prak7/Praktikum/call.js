/*
* Code ditulis oleh Yolanda Al Hidayah Pasaribu
*/

//membuat method person
var person = {
    fullName : function(){
        return this.firstName + ' ' + this.lastName
    }
}

var person1 = {
    firstName : 'Yolanda',
    lastName : 'Pasaribu'
}

var person2 = {
    firstName : 'TEROTET',
    lastName : 'BOMB'
}

console.log('Menggunakan method call untuk menampilkan objek person 2 : ')

//memanggil method menggunakan method call()
console.log(person.fullName.call(person2))