//atribut
var hasil = "Bilangan Prima = "

//proses
for(var i=0; i<= 50; i++){
    bil=0
    for(var j=1; j<=i; j++){
        if(i%j==0){
            bil=bil+1
        }
    }
    if(bil==2){
        hasil += i+', '
    }
}

//output
console.log(hasil)





