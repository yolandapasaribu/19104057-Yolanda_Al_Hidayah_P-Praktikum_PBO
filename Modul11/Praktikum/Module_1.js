/*
 * Code ini ditulis oleh Yolanda Al Hidayah Pasaribu
 * 
 * 19104057 - IT Telkom Purwokerto
 * 
 * 
 */
var person = (function(){
    var age = 25

    return{
        name : 'Puyol',
        getAge : function(){
            return age
        },

        growOlder : function(){
            age++
        }
    }
}())

console.log('Nama person\t : ', person.name)
console.log('Umur person\t: ' ,person.getAge())

person.age = 100
console.log('Umur person yang diganti\t : ', person.getAge())

person.growOlder()
console.log('Umur person yang ditambah\t: ',person.getAge())