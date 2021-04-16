/*
* Code ditulis oleh Yolanda Al Hidayah Pasaribu
*/

var person = {
    fullName : function(birth, city){
        return this.firstName + ' ' + this.lastName + ',' + birth + ',' + city
    }
}

var person1 = {
    firstName : 'Yolanda',
    lastName : 'Pasaribu'
}

//menggunakan apply
console.log(person.fullName.apply(person1, ['Mei','Kebumen']))

//jika menggunakan call
//console.log(person.fullName.apply(person1, Mei','Kebumen'))