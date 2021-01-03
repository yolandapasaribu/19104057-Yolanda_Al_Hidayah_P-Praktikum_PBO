/*
 * Code ini ditulis oleh Yolanda Al Hidayah Pasaribu
 * 
 * 19104057 - IT Telkom Purwokerto
 * 
 * Design Pattern Private Member
 * 
 */

var Person = (function(){

    var age = 25

    function InnerPerson(name){
        this.name = name
    }

    InnerPerson.prototype.getAge = function(){
        return age
    }

    InnerPerson.prototype.growOlder = function(){
        age++
    }

    return InnerPerson
}())

var person1 = new Person('Yoloyolo')
var person2 = new Person('Puyol')

console.log('Nama person 1\t: ',person1.name)
console.log('Umur person 1\t: ',person1.getAge())

console.log()

console.log('Nama person 2\t: ',person2.name)
console.log('Umur person 2\t: ',person2.getAge())

console.log()

person1.growOlder()
console.log(`Umur ${person1.name} yang ditambah\t: `,person1.getAge())
console.log(`Umur ${person2.name} yang ditambah\t: `,person2.getAge())