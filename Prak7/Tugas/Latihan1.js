/*
* Code ditulis oleh Yolanda Al Hidayah Pasaribu
*/

//membuat fungsi dengan deklarasi
function predikat (nilai){
    if (nilai > 85 && nilai <= 100){
       return 'A'
    }
    else if (nilai > 75 && nilai <= 84){
      return 'B'
    }

    else if (nilai > 65 && nilai <= 75){
        return 'BC'
    }

    else if (nilai > 55 && nilai <= 64){
        return 'C'    
    }

    else if (nilai > 45 && nilai <= 54){
        return 'D'
    }

    else if (nilai > 0 && nilai <= 44){
        return 'E'
    }
}

//function 2
function myFunction2(arg1, arg2){
    this.Name = arg1
    this.nilai = arg2
}

//membuat objek dari fungsi myFunction
var x = new myFunction2('Bambang',78)
var hasil = predikat(x.nilai)

//hasil
console.log('Masukan nama\t: '+ x.Name)
console.log('Masukan nilai\t: ' + x.nilai)

console.log(x.Name+ ' kamu mendapatkan predikat ' + hasil)