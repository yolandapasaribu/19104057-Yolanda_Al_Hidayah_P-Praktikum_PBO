/*
* Code ditulis oleh Yolanda Al Hidayah Pasaribu
*/

function reflect(value){
    return value;
}

//menampilkan fungsi
//------arguments 1
console.log(reflect('Halo'));
console.log(reflect('Hari ini hari ke ', 2));
console.log('Panjang argument : ', reflect.length);

//mendefinisikan fungi reflect
reflect = function(){
    return arguments[1]
}

//menampilkan fungsi
console.log(reflect('Halo'));
console.log(reflect('Hari ini hari ke ', 2));
console.log('Panjang argument : ', reflect.length);