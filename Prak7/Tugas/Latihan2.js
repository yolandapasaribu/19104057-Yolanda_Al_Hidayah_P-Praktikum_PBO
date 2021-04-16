/*
* Code ditulis oleh Yolanda Al Hidayah Pasaribu
*/

//atribut
var array = new Array(50,100,90,70)
var hasil = rerata(array)

//function menggunakan paramater
function rerata(array){
    var sum = 0;
    for (var i in array){
        sum = sum + array[i]
    }
    var panjang = array.length
    return sum/panjang
}


//function 2
function myFunction2(arg1, arg2){
    this.Name = arg1
    this.array = arg2
}

//membuat objek dari fungsi myFunction
var x = new myFunction2('Yoloo',array)

//output
console.log('Masukan nama\t: '+ x.Name)
console.log('Rata-rata nilai kamu\: '+ hasil)
