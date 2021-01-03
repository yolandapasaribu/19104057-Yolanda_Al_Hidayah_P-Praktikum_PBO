/*
 * Code ini ditulis oleh Yolanda Al Hidayah Pasaribu
 * 
 * 19104057 - IT Telkom Purwokerto
 * 
 * Design Pattern Private Member
 * 
 */
function Person(paramName){
    var name = paramName
    var age = 20

    this.setName = function(newName){
        name = newName
    }

    this.getName = function(){
        return name
    }

    this.setAge =  function(newAge){
        return age = newAge
    }

    this.getAge = function(){
        return age
    }

    this.growOlder = function(){
        age++
    }
}

var person = new Person('Yolondo')


console.log('Nama person\t : ', person.getName())
console.log('Umur person\t: ' , person.getAge())

person.setAge(100)
console.log('Umur person yang diganti\t : ', person.getAge())

person.growOlder()
console.log('Umur person yang ditambah\t: ', person.getAge())